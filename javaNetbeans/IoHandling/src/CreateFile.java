
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFile {

    public static void main(String[] args) {
        // create a file inside a MyIntro directory: 
        File f1 = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Demo");
        File f2 = new File(f1, "Test1.txt");
        File f3 = new File("D:\\Infobeans_Foundation\\javaNetbeans");
        try {
            FileWriter fr = new FileWriter(f2);

            if (!f1.exists()) {
                f1.mkdir();
                f2.createNewFile();
            }
            // check method details: 
            System.out.println("Name: " + f2.getName());
            System.out.println("Path: " + f2.getPath());
            System.out.println("can write: " + f2.canWrite());
            System.out.println("can read: " + f2.canRead());
            System.out.println("can execute: " + f2.canExecute());
            System.out.println("{Parent: " + f2.getParent());
            System.out.println("Directory: " + f2.isDirectory());
            System.out.println("File: " + f2.isFile());
            System.out.println("Hidden: " + f2.isHidden());
            System.out.println("Absolute: " + f2.isAbsolute());
            System.out.println("Length: " + f2.length());

            // Date formate: 
            long lastTime = f2.lastModified();
            SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            String formattedDate = sd.format(new Date(lastTime));
            System.out.println("lastModified : " + formattedDate);
            System.out.println("Size : " + f2.length());
            fr.write("Hii guys i am aashish...");
            fr.close();

            // file reader : 
            FileReader frr = new FileReader(f2);
//            System.out.println(frr.read());
//            System.out.println(frr.ready());

            int f = frr.read();
            while (f != -1) {
                System.out.print((char)(f));
                f = frr.read();
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
    }
}
