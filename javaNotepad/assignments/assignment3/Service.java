import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Gender: (m/f) ");
        char gender = sc.next().charAt(0);
        System.out.println("Merital status: (y/n)");
        char MeritalStatus = sc.next().charAt(0);

        if ((gender == 'f' || gender == 'F') && (age >= 20 && age <= 60)) {
            System.out.println("You will work only in urban areas: ");
        } else if ((gender == 'm' || gender == 'M') && (age >= 20 && age < 40)) {
            System.out.println("You may work in anywhere");
        } else if ((gender == 'm' || gender == 'M') && (age >= 40 && age <= 60)) {
            System.out.println("You will work in urban areas only.");
        } else {
            System.out.println("ERROR");
        }
    }
}
