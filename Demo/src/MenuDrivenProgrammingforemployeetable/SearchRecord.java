package MenuDrivenProgrammingforemployeetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchRecord { // select *from employee where eno=104;
	Scanner s;
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	int eNo;
	String sql;
	public SearchRecord() {
		

		try {
			s = new Scanner(System.in);
			conn = DBConnection.createConnection();
			sql = "select *from employee where eNo=?";
			pst = conn.prepareStatement(sql);
			System.out.println("Please enter the Employee number to search:");
			eNo = s.nextInt();
			pst.setInt(1, eNo);
			rs = pst.executeQuery();
			System.out.println("Your search Record");
			System.out.println("------------------------------------------");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pst.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
