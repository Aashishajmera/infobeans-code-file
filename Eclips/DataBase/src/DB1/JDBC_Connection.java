package DB1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.management.loading.PrivateClassLoader;

public class JDBC_Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String DB_URL = "jdbc:mysql://localhost:3306/college";
		String USER = "root";
		String PASS = "root";
		String DRIVER = "com.mysql.cj.jdbc.Driver";

		Class.forName(DRIVER);
		Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connection successfull.....");
	}
}
