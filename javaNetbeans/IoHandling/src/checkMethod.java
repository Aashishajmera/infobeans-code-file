
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class checkMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Java features' ");
            String s = sc.nextLine();
            System.out.println("Your information: ");
            String name = sc.nextLine();

            File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\MethodPra");
            File f1 = new File(f, "Demo1.txt");
            if (!f1.exists()) {
                f.mkdir();
                f1.createNewFile();
            } else {
                // file for java 
                FileWriter fr = new FileWriter(f1, true);
                fr.write("\n" + s);
                fr.close();
            }

            // file for Introduction
            File f2 = new File("D:\\Infobeans_Foundation\\javaNetbeans\\MyIntro");
            File f3 = new File(f2, "Intr1222221.txt");
            FileWriter fr2 = new FileWriter(f3);
            if (!f3.exists()) {
//                f2.mkdir();
//                f3.createNewFile();
//                FileWriter fr2 = new FileWriter(f3);
                System.out.println("Not found ");
            } else {
                System.out.println("Found...");
//                fr2.write(name);
//                fr2.close();
                fr2.write(s);
                f3.canWrite();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: ");
        }
    }
}
