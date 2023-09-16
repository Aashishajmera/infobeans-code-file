//package Demo;
//
//import com.email.durgesh.Email;
//import java.net.PasswordAuthentication;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//public class SendMail {
//
//    public static void main(String[] args) {
//        String to = "mohanmaali144@gmail.com";
//        String from = "ajmeraaashu55@gmail.com";
//        String password = "cqponcbythxmqpqn";
//        char pass[] = password.toCharArray();
//        try {
//
//            Properties properties = new Properties();
//            properties.put("mail.smtp.auth", true);
//            properties.put("mail.smtp.ssl.enable", true);
//            properties.put("mail.smtp.host", "smtp.mail.gmail.com");
//            properties.put("mail.smtp.port", "465");
//          
//            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication (){
//                    return new PasswordAuthentication("ajmeraaashu55@gmail.com",pass);
//                }
//            });
//           
//            MimeMessage msg = new MimeMessage(session);
//            msg.setFrom(new InternetAddress(from));
//            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            msg.setSubject("This is subject line: ");
//            msg.setText("you account is created: ");
//            Transport.send(msg);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
