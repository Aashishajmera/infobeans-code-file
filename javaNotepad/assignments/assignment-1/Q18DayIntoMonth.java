// 18. program to convert days into month , weeks and day

import java.util.Scanner;

public class Q18DayIntoMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any days: ");
        String days = sc.nextLine();
        if(days == "sunday" || days == "Sunday"){
            System.out.println("january");
        }
    }
}
