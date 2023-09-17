import java.util.Properties;

public class SendMail {

    public boolean sendMail(String to, String from, String subject,  String text){
       boolean flag = false;
        
       Properties objp = new Properties();
       objp.put("mail.smtp.auth",true);
       objp.put("mail.smtp.starttls.enable",true);
       objp.put("mail.smtp.port","587");
       objp.put("mail.smtp.host","smtp.gmail.com");

       
        
        return flag;
    }

    public static void main(String[] args) {
        SendMail emailobj = new SendMail();

        String to = "ajmerada82@gmail.com";
        String from = "ajmeraaashu55@gmail.com";
        String subject = "Try mail send";
        String text = "This is demo mail send using java program ";

        boolean b = emailobj.sendMail(to, from, subject, text);

        if(b){
            System.out.println("mail send successfully");
        }else{
            System.out.println("Mail not send: ");
        }

    }
}
