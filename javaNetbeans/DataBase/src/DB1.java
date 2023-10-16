
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/college";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from user";
        st = con.prepareStatement(sql);
        rs = st.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
        con.close();

    }
}
