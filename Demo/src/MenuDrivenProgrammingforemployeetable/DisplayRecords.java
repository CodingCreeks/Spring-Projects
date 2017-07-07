package MenuDrivenProgrammingforemployeetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayRecords {
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	
	public DisplayRecords(){	
		conn=DBConnection.createConnection();
		String sql="select *from employee";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			System.out.println("\tEmployee table");
			System.out.println("------------------------------------------");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
}

