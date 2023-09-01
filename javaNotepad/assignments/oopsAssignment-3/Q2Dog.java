// 2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//  Create two instances of the "Dog" class, set their attributes using the constructor and modify
//   the attributes using the setter methods and print the updated values.

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

class Dog{
    private String name;
    private String breed;

    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    // setter method: 
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    // display output: 
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
    }

}

public class Q2Dog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Breed: ");
        String breed = sc.nextLine();

        // create constructor of Dog class: 
        Dog objD = new Dog("Raj", "Dog");

        objD.setBreed(breed);
        objD.setName(name);

        objD.display();
        
    }
}
