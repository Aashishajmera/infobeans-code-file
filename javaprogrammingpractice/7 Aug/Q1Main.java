// 1. Define a class employee having fields like empNO, empName, Salary, Phone

import java.util.Scanner;

class Employee {
    private int employeeNumber;
    private String name;
    private int salary;
    private String phonenumber;

    // create default constructor:
    public Employee() {

    }

    // create constructor:
    public Employee(int employeeNumber, String name, int salary, String phonenumber) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
        this.phonenumber = phonenumber;
    }

    // Display method:
    public void Display() {
        System.out.println("employeeNumber: " + employeeNumber + " name: " + name + " salary: " + salary
                + " Phonenumber: " + phonenumber);
    }

    public void sortArry(Employee obj[]) {
        for (int i = 0; i < obj.length; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                if (obj[i].employeeNumber > obj[j].employeeNumber) {
                    Employee obj1 = new Employee();
                    obj1 = obj[i];
                    obj[i] = obj[j];
                    obj[j] = obj1;
                }
            }
            obj[i].Display();
        }
       
    }
}

class Q1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee number:
        System.out.println("Enter Employee number: ");
        int n = sc.nextInt();

        int empNO;
        String name;
        int salary;
        String number;
        Employee obj[] = new Employee[n];

        for (int i = 0; i < n; i++) {

            // Employee number:
            System.out.println("Enter employee number: ");
            empNO = sc.nextInt();

            // Employee name:
            System.out.println("Enter employee name: ");
            name = sc.nextLine();
            sc.nextLine();

            // salary:
            System.out.println("Enter emoloyee salary: ");
            salary = sc.nextInt();

            // phone number:
            System.out.println("Enter phone number: ");
            number = sc.nextLine();
            sc.nextLine();
            obj[i] = new Employee(empNO, name, salary, number);

        }

        for (int i = 0; i < n; i++) {
            obj[i].Display();
        }

    }
}