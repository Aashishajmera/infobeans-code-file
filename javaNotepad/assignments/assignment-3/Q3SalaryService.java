// 3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.

import java.util.Scanner;
class Q3SalaryService{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter year of service: ");
		int year = sc.nextInt();
		float bonus = 0;
		if(year > 5){
			bonus = (salary * 5) / 100;
			float bonusSalary = salary + bonus;
			System.out.println("Add bonus " +bonus +" and your total salary is: "+bonusSalary);
		}else{
			System.out.println("your service year is lessthan 6 : " +salary);
		}
	}
}