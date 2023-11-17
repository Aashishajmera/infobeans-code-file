
import com.bankproject01.service.DatabaseConnect;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;

public class DatewithTime {

    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
        String date = dateFormat.format(currentDate);

        System.out.println(date);
        Connection con = null;
        int x = -1;

        try {
            con = DatabaseConnect.getConnection();
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();
            java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime());
            String sql = "insert into timedate (dateeee) values(?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setTimestamp(2, new Timestamp(time));
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
