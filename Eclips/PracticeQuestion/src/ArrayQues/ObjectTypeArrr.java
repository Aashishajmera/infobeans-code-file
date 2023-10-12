package ArrayQues;

import java.util.Scanner;

class Customer {
	private String name;
	private int age;

	public Customer() {
		super();
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Name: " + getName() + " Age " + getAge();
	}

}

public class ObjectTypeArrr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of customer: ");
		int size = scanner.nextInt();
		System.out.println("Enter " + size + " customer details: ");

		// create object of customer class:
		Customer customer[] = new Customer[size];
		for (int i = 0; i < customer.length; i++) {
			System.out.println("Enter name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter age: ");
			int age = scanner.nextInt();

			customer[i] = new Customer(name, age);

		}

		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i]);
		}

	}
}
