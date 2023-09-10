//Que. 2 What is Serialization ? Write a java program to store the object into the file.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.crypto.spec.OAEPParameterSpec;
import javax.tools.FileObject;

public class Q2Serialization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number: ");
        String number = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter id");
        int id = sc.nextInt();

        //create a object of file class: 
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Assignment\\IoPackageAssignment\\src\\objStor.txt");

        try {
            if (!f.exists()) {
                f.createNewFile();
            }

            // create object of Employee class: 
            Employee e = new Employee(number, name, id);

            // create object of fileOutputStream
            FileOutputStream fos = new FileOutputStream(f);
            // create object of objectOutputstream: 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.close();

            // create object of fileInputStream: 
            FileInputStream fis = new FileInputStream(f);
            // create object of objectinputstream class: 
            ObjectInputStream ois = new ObjectInputStream(fis);

            // read value: 
            Employee emp = (Employee) ois.readObject();
            System.out.println("Name: " + emp.getName() + " Mobile Nu: " + emp.getMo_number() + " Id: " + emp.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
