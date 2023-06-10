import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        if (salary > 10000) {
            float hra = (salary * 10) / 100.0f;
            float ta = (salary * 5) / 100.0f;
            float da = (salary * 3) / 100.0f;
            float GrossSalary = salary + hra + ta + da;
            System.out.println("HRA: " + hra);
            System.out.println("TA: " + ta);
            System.out.println("DA: " + da);
            System.out.println("Gross salary is: " +GrossSalary);

        }else{
            float hra = (salary * 5) / 100.0f;
            float ta = (salary * 3) / 100.0f;
            float GrossSalary = salary + hra + ta;
            System.out.println("HRA: " + hra);
            System.out.println("TA: " + ta);
            System.out.println("Gross salary is: " +GrossSalary);
        }
    }
}