
import java.util.Scanner;

public class ArrayOfObject {

    String name;
    int roll_n;

    public void m1(Scanner sc) {
        System.out.println("Enter name:");
        this.name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter roll_number: ");
        this.roll_n = sc.nextInt();
    }

    public void m2() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll_n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        ArrayOfObject objA[] = new ArrayOfObject[size];
        ArrayOfObject obj;
        // set value: 
        for (int i = 0; i < size; i++) {
            
        }

        // print value: 
        for (int i = 0; i < size; i++) {
            
        }
    }
}
