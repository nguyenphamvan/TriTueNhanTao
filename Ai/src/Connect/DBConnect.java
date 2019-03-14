package Connect;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnect {

	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/picturefuzzy", "nguyen", "11041998");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());

	}

}