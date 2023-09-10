package FileOutputStrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteAndRead {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create a object of file class: 
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\FileOutputStrm\\WriteRead.txt");

        FileOutputStream fos = null;
        try {
            if (!f.exists()) {
                f.createNewFile();
            }

            System.out.println("file path: " + f.getAbsolutePath());

            // write some statement: 
            fos = new FileOutputStream(f, true);

            // only byte input 
            byte arr[] = {12, 55, 77, 88, 99};
            String s = "\n Java is simple";

            byte arr2[] = s.getBytes();

            fos.write(333);
            fos.write(arr2);
            fos.write(arr);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Write successful....");
            }
        }

        try {
            //read value: 
            FileInputStream fis = new FileInputStream(f);
            int i;
            for (; (i = fis.read()) != -1;) {
                System.out.print(i);
//                i = fis.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
