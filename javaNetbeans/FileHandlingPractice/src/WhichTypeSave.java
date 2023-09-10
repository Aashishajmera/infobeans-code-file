
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WhichTypeSave {

    public static void main(String[] args) {
        // create object of file class
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Basic\\src\\SaveDer.txt");

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);
            String s = "java is simple";
            byte arr[] = s.getBytes();
            fos.write(arr);
            fos.close();

            FileInputStream fis = new FileInputStream(f);
            int i;

            for (; (i = fis.read()) != -1;) {
                System.out.print((char) i);
            }

//            String s = "";
//            while(i != -1){
//                s = s+ (char)i;
//                i = fis.read();
//            }
//            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
