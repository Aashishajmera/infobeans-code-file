import java.util.Scanner;

class Employee {
	String name, address;
	int year;

	// create default constructor:
	public Employee() {

	}

	// create constructor:
	public Employee(String name, String address, int year) {
		this.name = name;
		this.year = year;
		this.address = address;
	}

	// formate:
	public void formate() {
		System.out.println("Name: \t\t\t\tAddress: \t\t\tYear:");

	}

	// display the output:
	public void display() {
		System.out.println(this.name + "\t\t\t\t" + this.address + "\t\t\t\t" + this.year);

	}
}

class Q1Information2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first employee name , address, year of joining,  ");
		String name1 = sc.nextLine();
		String address1 = sc.nextLine();
		int year1 = sc.nextInt();
		sc.nextLine();
		Employee obj1 = new Employee(name1, address1, year1);
		System.out.println("Enter first employee name , address, year of joining,  ");
		name1 = sc.nextLine();
		address1 = sc.nextLine();
		year1 = sc.nextInt();
		sc.nextLine();
		Employee obj2 = new Employee(name1, address1, year1);

		System.out.println("Enter first employee name , address, year of joining,  ");
		name1 = sc.nextLine();
		address1 = sc.nextLine();
		year1 = sc.nextInt();
		Employee obj3 = new Employee(name1, address1, year1);

		obj1.formate();
		obj1.display();
		obj2.display();
		obj3.display();
	
	}
}