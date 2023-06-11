import java.util.Scanner;

public class LowestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter 4th number: ");
        int num4 = sc.nextInt();

        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println(num1 + " is lowest number: ");
        } else if (num2 < num3 && num2 < num4 && num2 < num1) {
            System.out.println(num2 + " is lowest number: ");
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println(num3 + " is lowest number: ");
        } else {
            System.out.println(num4 + " is lowest number: ");
        }
    }
}
