/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Printwriterrrrrr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class firstwriteob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\Printwriterrrrrr\\demo.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            System.out.println("method overloading: ");
            String s = sc.nextLine();
            pw.write("\n" + s);
            pw.write(22);
            pw.close();

            // read data into the file: 
            FileReader fr = new FileReader("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\Printwriterrrrrr\\demo.txt");
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
