/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {

    public static void main(String[] args) {

        // create obejct of file: 
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\FileReader\\read.txt");

        try {
            
            FileWriter fw = new FileWriter(f);
//            byte arr[] = {22,66};
            fw.write(33);
            String s = "java is simple";
            fw.write(s);
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
