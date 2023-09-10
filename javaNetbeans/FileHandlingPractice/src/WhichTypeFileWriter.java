
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WhichTypeFileWriter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        // create object of file class
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\FileHandlingPractice\\src\\Writer.txt");

        //create object of fileWriter class
        try {
            FileWriter fw = new FileWriter(f,true);
            fw.write(n);
            fw.close();

            FileReader fr = new FileReader(f);
            int i;
            for (; (i = fr.read()) != -1;) {
                System.out.print(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
