
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q5AverageSize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Assignment\\IoPackageAssignment\\src\\average.txt");

        FileWriter fw = null;
        FileReader fr = null;

        try {

            if (!f.exists()) {
                f.createNewFile();
            }

//            String javaInfo = "java is very simple language";
            System.out.println("Enter string value: ");
            String javaInfo = sc.nextLine();
            byte javaInfoValue[] = javaInfo.getBytes();
            FileOutputStream fos = new FileOutputStream(f);

            fos.write(javaInfoValue);

            String splitJava[] = javaInfo.split(" ");
            int wordlength = splitJava.length;

            // character read 
            FileInputStream fis = new FileInputStream(f);

            int i = fis.read();
            int charLength = 0;
            while (i != -1) {
                if (i == 32) {

                } else {
                    charLength++;
                }
                i = fis.read();
            }
            System.out.println("Wordlength length: " + wordlength);
            System.out.println("Character length: " + charLength);
            int averageSize = charLength / wordlength;
            System.out.println("Average size: " + averageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
