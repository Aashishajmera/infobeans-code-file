package ArrayListTestDemo;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name;
	private int age;
	private int id;
	private double salary;
	
	// default constructor
	public Customer() {
		super();
	}
	
	//parameterized constructor
	public Customer(String name, int age, int id, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	
	
	// getter and setter method
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
}
