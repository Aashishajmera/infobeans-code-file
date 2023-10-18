package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TakeInput {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class Load successfully....");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop", "root", "root");
            System.out.println("Database connected....");
        } catch (ClassNotFoundException | SQLException e) {
            
        } finally {
        }
    }
}
