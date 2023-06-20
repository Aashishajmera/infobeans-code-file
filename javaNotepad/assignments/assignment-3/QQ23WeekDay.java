// 23. Write a Java program to input day number and print week day. 

import java.util.Scanner;

// BUG 

public class QQ23WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week day:");
        char weekDay = sc.next().charAt(0);
        if(weekDay == 'M' || weekDay == 'm'){
            System.out.println("1");
        }else if(weekDay == 'T' || weekDay =='t'){
            System.out.println("2");
        }else if(weekDay == 'W' || weekDay =='w'){
            System.out.println("3");
        }else if(weekDay == 'T' || weekDay =='t'){
            System.out.println("4");
        }else if(weekDay == 'F' || weekDay =='f'){
            System.out.println("5");
        }else if(weekDay == 'S' || weekDay =='s'){
            System.out.println("6");
        }else if(weekDay == 'S' || weekDay =='s'){
            System.out.println("7");
        }else{
            System.out.println(weekDay +" not a week day: ");
        }
    }
}
