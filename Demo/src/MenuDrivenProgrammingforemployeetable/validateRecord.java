package MenuDrivenProgrammingforemployeetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class validateRecord {
	
	Scanner s;
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	String sql;

	int Recordvalidation(int eNo) {
		int validate = 0;
		try {
			
			s = new Scanner(System.in);
			conn = DBConnection.createConnection();
			sql = "select *from employee where eNo=?";
			pst = conn.prepareStatement(sql);
			//eNo = s.nextInt();
			pst.setInt(1, eNo);
			rs = pst.executeQuery();
			while (rs.next()) {

				validate = 1;
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
		return validate;
	}

}
