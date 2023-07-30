import java.util.Scanner;
class Employee{
	String name,address;
	int year;
	public void firstEmployee(String name, String address ,int year){
		this.name = name;
		this.year = year;
		this.address = address;
	}
	public void secondEmployee(String name1, String address1, int year1){
		this.name = name1;
		this.year = year1;
		this.address = address1;
	}
	public void thirdEmployee(String name2, String address2, int year2){
		this.name = name2;
		this.year = year2; 
		this.address = address2;
	}
	
	public void display(){
		
	}
}

class Q1Information2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first employee name , address, year of joining,  ");
		String name1 = sc.nextLine();
		String address1 = sc.nextLine();
		int year1 = sc.nextInt();
		
		System.out.println("Enter second employee name , address, year of joining,  ");
		String name2 = sc.nextLine();
		String address2 = sc.nextLine();
		int year2 = sc.nextInt();
		
		System.out.println("Enter third employee name , address, year of joining,  ");
		String name3 = sc.nextLine();
		String address3 = sc.nextLine();
		int year3 = sc.nextInt();
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();	
		Employee obj3 = new Employee();

		
		// first employee:
		obj1.firstEmployee(name1, address1, year1);
		obj2.secondEmployee(name2, address2, year2);
		obj3.thirdEmployee(name3, address3, year3);
	}
}