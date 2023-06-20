// 11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.
// if employee is a male and age is in between 20 to 40 then he may work in anywhere
// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
// And any other input of age should print "ERROR".  

import java.util.Scanner;

public class Q11Service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
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
