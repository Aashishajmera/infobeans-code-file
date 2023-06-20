// 16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. 
// For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’
//  then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ 
// then convert Celsius to Fahrenheit. 

import java.util.Scanner;

public class QQ16ConvertTempFah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "you have to take choice. If you entered ('C'/'c') then convert Fahrenheit to Celsius. If you entered ('F'/'f') then convert Celsius to Fahrenheit. ");
        char ch = sc.next().charAt(0);

        if (ch == 'c' || ch == 'C') {
            System.out.println("Enter fahrenheit ");
            double fahrenheit = sc.nextFloat();
            double celcius;
            celcius = (fahrenheit - 32) / 1.8000;
            System.out.println(celcius + " celcius: ");
        } else if (ch == 'f' || ch == 'F') {
            System.out.println("Enter celcius ");
            double celcius = sc.nextFloat();
            double fahrenheit;
            fahrenheit = ((celcius * 1.8000) + 32.00);
            System.out.println(fahrenheit + " fahrenheit: ");
        }else{
            System.out.println("Please Enter right choice: (('C'/'c')('F'/'f')) ");
        }
    }

}
