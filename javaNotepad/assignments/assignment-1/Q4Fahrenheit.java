// 4. Write a program to Convert temperature from fahrenheit to celcius.

import java.util.Scanner;

public class Q4Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        double fahrenheit = sc.nextFloat();
        double celcius;

        celcius = (fahrenheit - 32)/1.8000;
        System.out.println(celcius+" celcius: ");

    }
}
