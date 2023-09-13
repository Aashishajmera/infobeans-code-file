package Demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class DemoLocal {

    String name;
    String number;

    public DemoLocal(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter number: ");
        String number = sc.nextLine();

        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\Demo\\test.txt");

        // create a object of demolocal: 
        DemoLocal dl = new DemoLocal(name, number);
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dl);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
