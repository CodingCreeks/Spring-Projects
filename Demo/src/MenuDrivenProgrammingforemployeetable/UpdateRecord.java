package MenuDrivenProgrammingforemployeetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord { //	update employee set eName="Johndear" where eNo=101;
	
	Scanner s;

	public UpdateRecord(){
		Connection conn = null;
		PreparedStatement pst = null;
		int Result;
		s=new Scanner(System.in);
		int eNo;
		String eName;	
		try {
			conn=DBConnection.createConnection();
			String sql="update employee set eName=? where eNo=?";
			pst=conn.prepareStatement(sql);
			System.out.println("Please input the Employee number for Update? :");
			eNo=s.nextInt();
			System.out.println("Please input the Employee Name :");
			eName=s.next();
			pst.setString(1, eName);
			pst.setInt(2, eNo);
			Result=pst.executeUpdate();
			if(Result>0){
				System.out.println("Employee record Updated successfully....");
			}else{
				System.out.println("Employee record not Updated....");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
