package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class RealDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter id: ");
        String id = sc.nextLine();

//        String[] arr = {name, id};
        try {
//            PrintWriter pw = new PrintWriter("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\Demo\\real.txt");
            File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\Demo\\real.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name+" ");
            bw.write(id+" ");
            bw.write("\n");
            bw.close();

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Enter id: ");
            String id2 = sc.nextLine();
           

        } catch (Exception e) {
        }
    }
}
