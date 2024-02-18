package P1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        System.out.println("Enter something...");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File("./Demo.txt");
        try {
            if (!f.exists()) {
                f.createNewFile();
            } else {
                FileWriter fw = new FileWriter(f, true);
                fw.write("\n"+s);
                fw.close();
                System.out.println("Data write successfull...");
                
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
