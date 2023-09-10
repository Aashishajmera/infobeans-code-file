/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileOutputStrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {

    String id;
    float salary;

    public A(String id, float salary) {
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "A{" + "id=" + id + ", salary=" + salary + '}';
    }
    
    

}

public class FileObjectReader {

    public static void main(String[] args) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\IoHandling\\src\\FileOutputStrm\\obj.txt");

        // create a object of A class
        A a = new A("101", 30000);

        try {
            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(a);
            oos.close();
            
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            
            A obja = (A)ois.readObject();
            
            System.out.println(obja);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
