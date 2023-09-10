/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferReaddddd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferRe1st {
    
    public static void main(String[] args) {

        // sortcut: 
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\BufferReaddddd\\demo.txt"));
        try {
            FileWriter fw = new FileWriter("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\BufferReaddddd\\demo.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hii i am aashish....\n");
            bw.write("I am aashish" + 23);
            bw.close();

            //sortcut: 
            BufferedReader br = new BufferedReader(new FileReader("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\BufferReaddddd\\demo.txt"));
            String ans = br.readLine();
            while (ans != null) {
                System.out.println(ans);
                ans = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
