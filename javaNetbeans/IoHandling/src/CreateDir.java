
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateDir {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            //create a object of file class
            File f1 = new File("D:\\Infobeans_Foundation\\javaNetbeans\\MyIntro");
            System.out.println(f1.exists());

            // create directory 
            f1.mkdir();
            System.out.println(f1.exists());

            // create file: 
            File f2 = new File(f1, "Intro2.txt");
            System.out.println(f2.exists());

            // check file and folder name: 
            System.out.println("Folder name: " + f1.getName());
            System.out.println("File name: " + f2.getName());

            // input 
            FileOutputStream fos = new FileOutputStream(f2);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your number: ");
            int n = sc.nextInt();

        } catch (Exception e) {
            System.out.println("something went wrong: ");
        }

//        //convert to byte array: 
//        byte n[] = name.getBytes();
//        fos.write(n);
//        fos.close();
//        System.out.println("End...");
    }
}
