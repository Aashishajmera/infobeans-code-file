// 11) Create an Abstract class Processor with int member variable data and method showData to display data value.
// Create abstract method process() to define processing of member data.
// Create a class Factorial using abstract class Processor to calculate and 
// print factorial of a number by overriding the process method.
// Create a class Circle using abstract class Processor to calculate and print area of a circle by 
// overriding the process method Ask user to enter choice (factorial 	or circle area).
//  Also ask data to work upon; Use Processor class reference to achieve this mechanism.

import java.util.Scanner;

abstract class Processor {
    private int num;

    // default constructor:
    public Processor() {

    }

    // getter method for num:
    public int getterNum() {
        return num;
    }

    // parameterized constructor:
    public Processor(int n) {
        num = n;
    }

    // show data method:
    public void show() {
        System.out.println("Enter data value is: " + num);
    }

    // abstract method process:
    abstract public void process();
}

// FACTORIAL - CLASS -----------------------------------------------------------

class Factorial extends Processor {
    private int n = getterNum();

    // default constructor:
    public Factorial() {

    }

    // parameterized constructor:
    public Factorial(int n) {
        super(n);
    }

    // process the data:
    public void process() {
        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact *= i;
        }
        System.out.println("factorial is: " + fact);
    }
}

// CIRCLE - CLASS---------------------------------------
class Circle extends Processor {

    private int r = getterNum();

    // default constructor:
    public Circle() {

    }

    // parameterized constructor:
    public Circle(int r) {
        super(r);
    }

    // process method show area of circle:
    public void process() {
        // area of circle:
        double area = 3.14 * (r * r);
        System.out.println("Area of circle is: " + area);
    }
}

class Q11Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n 1) factorial: \n 2) area of circle: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter number: ");
                int n = sc.nextInt();
                Factorial obj = new Factorial(n);
                obj.show();
                obj.process();
                break;

            case 2:
                System.out.println("Enter radius: ");
                int r = sc.nextInt();
                Circle obj1 = new Circle(r);
                obj1.show();
                obj1.process();
                break;

            default:
                System.out.println(" case not found: ");

        }
    }
}