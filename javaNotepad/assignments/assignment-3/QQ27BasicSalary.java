// 27. Write a Java program to input basic salary of an employee and calculate
//  its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic Salary <= 20000 : HRA = 25%, DA = 90% 
// Basic Salary > 20000 : HRA = 30%, DA = 95% 

import java.util.Scanner;

public class QQ27BasicSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        int basicSalary = sc.nextInt();
        int HRA = 0;
        int DA = 0;
        int grossSalary = 0;
        if (basicSalary <= 10000) {
            HRA = (basicSalary * 20) / 100;
            DA = (basicSalary * 80) / 100;
            grossSalary = basicSalary + HRA + DA;
            System.out.println("HRA is " + HRA + " and DA is " + DA);
            System.out.println("your gross Salary is: " + grossSalary);

        } else if (basicSalary <= 20000) {
            HRA = (basicSalary * 25) / 100;
            DA = (basicSalary * 90) / 100;
            grossSalary = basicSalary + HRA + DA;

            System.out.println("HRA is " + HRA + " and DA is " + DA);
            System.out.println("your gross Salary is: " + grossSalary);

        } else if (basicSalary > 20000) {
            HRA = (basicSalary * 30) / 100;
            DA = (basicSalary * 95) / 100;
            grossSalary = basicSalary + HRA + DA;

            System.out.println("HRA is " + HRA + " and DA is " + DA);
            System.out.println("your gross Salary is: " + grossSalary);

        }
    }
}
