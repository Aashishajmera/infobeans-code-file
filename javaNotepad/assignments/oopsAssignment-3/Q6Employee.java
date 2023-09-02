// 6. Write a Java program to create a class called "Employee" with a name, job title,
//  and salary attributes, and methods to calculate and update salary.

import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Employee{
    private String name;
    private String jobTitle;
    private float salary;
    private float updateSal;

    Employee(String name, String jobTitle, float salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //  update salary: 
    public void updateSalary(){
        if(salary >= 2000){
            updateSal = ((salary/100)*20);
            salary += updateSal;
            display();
        }else{
            updateSal = ((salary/100)*10);
            salary += updateSal;
            display();
        }
    }

    //display details: 
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Salary: "+salary);
    }
}

public class Q6Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Job title: ");
        String jobTitle = sc.nextLine();
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();

        Employee objE = new Employee(name, jobTitle, salary);

        objE.display();
        
        System.out.println("Update salary: ");
        objE.updateSalary();
    }
}