/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferReaddddd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // without sortcut: 
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\BufferReaddddd\\demo2.txt");

        try {
            FileWriter fw = new FileWriter(f, true);

            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter sting value");
            String s1 = sc.nextLine();
            bw.write("\n" + s1);
            bw.close();

            // read data
            BufferedReader br = new BufferedReader(new FileReader(f));

            // character wise
//            int i = br.read();
//            while(i != -1){
//                System.out.print((char)i);
//                i = br.read();
//            }

//            line wise
            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
