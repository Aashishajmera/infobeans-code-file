package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderPerticular {

    public static void main(String[] args) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\FileReader\\read.txt");

        try {

            FileWriter fw = new FileWriter(f);
            String s = "java is simple";
            // convert to char arrr
            char arr[] = s.toCharArray();
            fw.write(arr, 2, 12);
            fw.close();

            FileReader fr = new FileReader(f);
            int i = fr.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
