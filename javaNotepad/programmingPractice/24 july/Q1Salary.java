import java.util.Scanner;
class Employee{
	public void salary(float basicSalray, char grade){
		float HRA = (basicSalray * 20)/100;
		float DA = (basicSalray * 50)/100;
		float PF = (basicSalray * 11)/100;
		int allow=0;
		
		if(grade == 'A'){
			allow = 1700;
			float grossSalary = (basicSalray+HRA+DA+allow-PF);
			System.out.println("Gross salary is: "+grossSalary);
		}else if(grade == 'B'){
			allow = 1500;
			float grossSalary = (basicSalray+HRA+DA+allow-PF);
			System.out.println("Gross salary is: "+grossSalary);
		}else if(grade == 'C'){
			allow = 1300;
			float grossSalary = (basicSalray+HRA+DA+allow-PF);
			System.out.println("Gross salary is: "+grossSalary);
		}else {
			System.out.println("grad not found : ");
		}
	}
}
class Q1Salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter final salary: ");
		float basicSalray = sc.nextFloat();
		System.out.println("Enter grade: ");
		char grade = sc.next().charAt(0);
		
		// create object
		Employee obj = new Employee();
		obj.salary(basicSalray, grade);
	}
}