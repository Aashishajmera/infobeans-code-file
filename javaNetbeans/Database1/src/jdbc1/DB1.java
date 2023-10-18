package jdbc1;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Connection con;
//        String path = "jdbc:mysql://localhost:3306/college";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class Load successfully....");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
            System.out.println("Database connected: ");

            String sql = "select * from student";
            
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rsm = (ResultSetMetaData) rs.getMetaData();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
