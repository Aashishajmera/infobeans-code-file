/* 16) Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
 */
import java.util.Scanner;
class Person{
	private String name ;
	private int age ;
	
	// default constructo:
	public Person (){
		
	}
	
	// create constructo: 
	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//display method: 
	public void display(){
		System.out.println("Name: "+ name +"\n" +"age: "+ age);
	}
}
class Q16Person{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		// create object: 
		Person obj = new Person(name, age);
		
		
		// call display method:
		obj.display();
	}
}