// 16. Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter,
//  and subclasses for "Rectangle", "Circle", and "Triangle".

import java.util.Scanner;

abstract class Shape {

  abstract void calculatArea(Scanner sc);

  abstract void perimeter();
}

//-------------------------------------------------------------------------RACTANGLE-----------------------------------------------------------
class Ractangle extends Shape {

  float length;
  float width;

  public void calculatArea(Scanner sc) {
    System.out.println("--------------RACTANGLE---------------");
    System.out.println("Enter length: ");
    length = sc.nextFloat();
    System.out.println("Enter width: ");
    width = sc.nextFloat();

    System.out.println("Area of ractangle: " + (length * width));
  }

  public void perimeter() {
    System.out.println("perimeter of ractangle: " + (2 * (length + width)));
  }
}

//-------------------------------------------------------------------------CIRCLE-----------------------------------------------------------

class Circle extends Shape {

  float radius;

  public void calculatArea(Scanner sc) {
    System.out.println("--------------CIRCLE---------------");

    System.out.println("Enter raduis: ");
    radius = sc.nextFloat();

    System.out.println("Area of circle: " + (22 / 7 * (radius * radius)));
  }

  public void perimeter() {
    System.out.println("perimeter of Circle: " + (2 * (22 / 7 * radius)));
  }
}

//-------------------------------------------------------------------------Triangle-----------------------------------------------------------

class Triangle extends Shape {

  Scanner sc = new Scanner(System.in);
  float perpendicular;
  float base;
  float hypotenuse ;
  float height;

  public void calculatArea(Scanner sc) {
    
    height = ((2)*(perpendicular *base));
    System.out.println("Area of Triangle: " + (((1/2.0f)*(base *height))));

  }

  public void perimeter() {

    System.out.println("--------------CIRCLE---------------");


    System.out.println("Enter perpendicular ");
    perpendicular = sc.nextFloat();
    System.out.println("Enter base");
    base = sc.nextFloat();
    System.out.println("Enter hypotenuse");
    hypotenuse  = sc.nextFloat();

    System.out.println("perimeter of Triangle: " + (perpendicular + base + hypotenuse ));
  }
}

public class Q16Shape {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // create object of Circle class:
    Circle objC = new Circle();
    objC.calculatArea(sc);
    objC.perimeter();

    Ractangle objR = new Ractangle();
    objR.calculatArea(sc);
    objR.perimeter();

    Triangle objT = new Triangle();
    objT.perimeter();
    objT.calculatArea(sc);
  }
}
