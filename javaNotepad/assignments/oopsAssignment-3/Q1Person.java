//1. Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, 
//and print their name and age.

import java.util.Scanner;

class Person{
    private String name ;
    private int age;

    // default constructor: 
    Person(){

    }

    // perameterized constructor: 
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
}

public class Q1Person {
    public static void main(String[] args) {

    // create object of person class: 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    
    Person objP = new Person(age, name);
    objP.display();
    }
}
