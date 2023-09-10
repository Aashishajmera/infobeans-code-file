
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

//Que
//
//. 7 Write a program to store your shopping details in a binary file(shopping.dat) with
//information itemName, price, quantity. (Use ObjectOutputStream to store Item class object 
class Demo implements Serializable {

    String itemName;
    float price;
    int quantity;
    float totalAmount;

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Demo(String itemName, float price, int quantity, float totalAmount) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    // override tostring: 
    public String toString() {
        return ("Iteam name: " + itemName + " Price: " + price + " quantity: " + quantity + " Total amount: " + totalAmount);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class ShopingQ10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.println("Price: ");
        float price = sc.nextFloat();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        float totalAmount = price * quantity;

        // create a object of demo class
        Demo d = new Demo(itemName, price, quantity, totalAmount);
//        System.out.println(d);

        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Assignment\\IoPackageAssignment\\src\\StoreData.txt");

        try {

            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(d);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));

            Demo dans = (Demo) ois.readObject();
            System.out.println(dans);

//            System.out.println("Item name: " + dans.getItemName() + " price: " + dans.getPrice() + " quantity: " + dans.getQuantity() +" total amount: "+totalAmount);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input: ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
