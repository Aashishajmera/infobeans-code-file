
import com.bankproject01.service.DatabaseConnect;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;

public class CheckDate {

    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(currentDate);

//        System.out.println(date);
        Connection con = null;
        int x = -1;

        try {
            con = DatabaseConnect.getConnection();
//            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            java.util.Date date1 = dateFormat.parse(date);
            java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime());
            String sql = "insert into datee (dateeee) values(?)";

            PreparedStatement ps = con.prepareStatement(sql);

//            ps.setDate(1, (java.sql.Date) date1);
            ps.setDate(1, sqlStartDate);
            x = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();;
                if (x != -1) {
                    System.out.println("send successfully");
                } else {
                    System.out.println("cant");
                }
            } catch (Exception e) {
                e.printStackTrace();;
            }
        }

    }
}
