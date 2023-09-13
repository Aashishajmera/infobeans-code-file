/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

import com.sun.source.tree.TryTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class M implements Serializable {

    String name;
    String moNumber;

    public M(String name, String moNumber) {
        this.name = name;
        this.moNumber = moNumber;
    }

    public String toString() {
        return ("Name: " + this.name + " Mobile number: " + this.moNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber;
    }

}

public class BufferCls {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\Demo\\tex.txt");

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter mobile Number: ");
        String mobileNumber = sc.nextLine();

        // create a object of m class 
        M m = new M(name, mobileNumber);
        try {
            FileWriter fw = new FileWriter(f, true);

            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(m);

            FileInputStream fis = new FileInputStream(f);

            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("Enter mobile number: ");
            String mNumber = sc.nextLine();
//            System.out.println(obj)
            M obj = (M) ois.readObject();
            while (obj != null) {
                if (obj.moNumber.equals(mNumber)) {
                    System.out.println(obj);
                }
               obj = (M) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
