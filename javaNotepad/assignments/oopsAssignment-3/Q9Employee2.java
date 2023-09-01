// 9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, 
// and a method to calculate years of service.

import java.util.Scanner;

class Employee{
    private String name ;
    private float salary;
    private int hireDate;

    Employee(String name,float salary,int hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void display(){
        System.out.println("year of service: "+(2023 - hireDate));
    }
}

public class Q9Employee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        System.out.println("Enter hire year");
        int hireDate = sc.nextInt();



        // create object of Employee class: 
        Employee objE = new Employee(name, salary , hireDate);
        objE.display();
    }
}
