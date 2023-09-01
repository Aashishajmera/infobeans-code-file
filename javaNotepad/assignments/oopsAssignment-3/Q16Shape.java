// 16. Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter,
//  and subclasses for "Rectangle", "Circle", and "Triangle".

import java.util.Scanner;

abstract class Shape {
    private float length;
    private float width;

  Shape(float length, float width) {
    this.length = length;
    this.width = width;
  }

  Shape(){

  }

  // setter method: 
  public void setLength(float length){
    this.length = length;
  }

  public void setWidth(float width){
    this.width = width;
  }

  // getter method: 
  public float getLength(){
    return this.length;
  }

  public float getWidth(){
    return this.width;
  }

  abstract void calculatArea();

  abstract void perimeter();
}

//-------------------------------------------------------------------------RACTANGLE-----------------------------------------------------------
class Ractangle extends Shape{

    // perameterized constructor: 
    Ractangle(float length, float width){
        super(length, width);
    }

    public void calculatArea(){
        System.out.println("Area of ractangle : "+(super.getLength() * super.getWidth()));
    }
    public void perimeter(){
        System.out.println("perimeter of ractangle: "+(2*(super.getLength()+super.getWidth())));
    }
}
//-------------------------------------------------------------------------CIRCLE-----------------------------------------------------------


class Circle extends Shape{

    // perameterized constructor: 
    Circle(float length, float width){
        super(length, width);
    }

    public void calculatArea(){
        System.out.println("Area of Circle : "+(super.getLength() * super.getWidth()));
    }
    public void perimeter(){
        System.out.println("perimeter of Circle: "+(2*(super.getLength()*super.getWidth())));
    }
}



public class Q16Shape {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length:");
    float length = sc.nextFloat();
    System.out.println("Enter width: ");
    float width = sc.nextFloat();

    // create object of ractangle class: 
    Ractangle objR = new Ractangle(length, width);
    objR.calculatArea();
    objR.perimeter();

    // create object of Circle class: 
    Circle objC = new Circle(length, width);
    objC.calculatArea();
    objC.perimeter();
  }
}
