package OrderCus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import cus.register.DBConnect;

public class OrderCusDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess = false;
	
	public static boolean insertordercus(String pname, int quantity, String username, String phone) {
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into ordercus values(0, '"+pname+"', '"+quantity+"', '"+username+"', '"+phone+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
