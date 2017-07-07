////import java.sql.SQLException;
////import java.util.Scanner;
//
// package MenuDrivenProgrammingforemployeetable;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class validateprimarykey() {
///*	
//	public int validate(int eNo) {
//			try {
//				Scanner s;
//				Connection conn;
//				PreparedStatement pst;
//				ResultSet rs;
//				String sql;
//				s = new Scanner(System.in);
//				conn = DBConnection.createConnection();
//				sql = "select *from employee where eNo=?";
//				pst = conn.prepareStatement(sql);
//				eNo = s.nextInt();
//				pst.setInt(1, eNo);
//				rs = pst.executeQuery();
//				
//				while(rs.next()){
//					return eNo=1;
//				}
//				
//				rs.close();
//				pst.close();
//				conn.close();
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				try {
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			return eNo;
//	}
//*/	
//	
//	public int Recordvalidation(int eNo) {
//		try {
//			s = new Scanner(System.in);
//			conn = DBConnection.createConnection();
//			sql = "select *from employee where eNo=?";
//			pst = conn.prepareStatement(sql);
//			eNo = s.nextInt();
//			pst.setInt(1, eNo);
//			rs = pst.executeQuery();
//			while (rs.next()) {
//
//				validate = 1;
//			}
//
//			rs.close();
//			pst.close();
//			conn.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return validate;
//	}
//
//}
