
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, File Input
//Stream).
public class Q1InputOutput {

    public static void main(String[] args) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Assignment\\IoPackageAssignment\\src\\StoreData.txt");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(f);
            String s = "Java is very simple language ";
            
            byte arr[] = s.getBytes();
            fos.write(arr);
            fos.close();

            FileInputStream fis = new FileInputStream(f);

            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }

        } catch (Exception e) {
            System.out.println("something went wrong: ");
        }
    }
}
