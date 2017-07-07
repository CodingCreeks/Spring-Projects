package MenuDrivenProgrammingforemployeetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecord { //delete from employee where eNo=104;
	
	Scanner s;
	Connection conn;
	PreparedStatement pst;
	int Result;
	int eNo;
	String sql;
	public DeleteRecord(){
		
		try {
			
			s=new Scanner(System.in);
			conn=DBConnection.createConnection();
			sql= "delete from employee where eNo=?";
			pst=conn.prepareStatement(sql);
			System.out.println("Please input the Employee Number for delete the record: ");
			eNo=s.nextInt();
			pst.setInt(1, eNo);
			Result=pst.executeUpdate();
			if(Result>0){
				System.out.println("Record deleted succefully");
			}else{
				System.out.println("Record not deleted succefully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			try {
				pst.close();
				conn.close();
				
			} catch (Exception e) {
				
			}
		}
		
		
		
	}

}
