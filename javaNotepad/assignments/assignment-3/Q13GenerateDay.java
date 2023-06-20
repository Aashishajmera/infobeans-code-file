// 13. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday

import java.util.Scanner;
public class Q13GenerateDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between (1 to 7)");
        byte num = sc.nextByte();
        if(num == 1){
            System.out.println("Monday: ");
        }else if(num == 2){
            System.out.println("Tuesday: ");
        }else if(num == 3){
            System.out.println("Wednesday: ");
        }else if(num == 4){
            System.out.println("Thursday: ");
        }else if(num ==5){
            System.out.println("Friday: ");
        }else if(num ==6){
            System.out.println("Saturday: ");
        }else if(num == 7){
            System.out.println("Sunday: ");
        }else{
            System.out.println("Enter number is greaterthan 7: ");
        }
    }
}
