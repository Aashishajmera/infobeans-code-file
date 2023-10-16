package ArrayListTestDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++Enter customer data:+++++++++++++ ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter customer name: ");
		String name = scanner.nextLine();
		System.out.println("Enter age");
		int age = scanner.nextInt();
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		System.out.println("Enter salary: ");
		double salary = scanner.nextDouble();
		
		// write data in file using object
		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Infobeans_Foundation\\Eclips\\PracticeQuestion\\src\\ArrayListTestDemo\\demo.txt", true);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			
			objectOutputStream.writeObject(new Customer(name,age,id,salary));
			objectOutputStream.flush();
			objectOutputStream.close();
			
			System.out.println("Data successfull store......");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong......");
		}
		
		
		
		// read data in file using arraylist object
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Infobeans_Foundation\\Eclips\\PracticeQuestion\\src\\ArrayListTestDemo\\demo.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			objectInputStream.readObject();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
