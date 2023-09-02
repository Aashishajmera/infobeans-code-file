import java.util.Random;
import java.util.Scanner;

interface Shape {
  void area(Scanner sc);
}

class Circle implements Shape {

  public void area(Scanner sc) {
    System.out.println("-----------CIRCLE-------------");
    System.out.println("Enter radius: ");
    float radius = sc.nextFloat();

    System.out.println("Area of circle is: " + (22 / 7 * radius * radius));
  }
}

class Ractangle implements Shape {

  public void area(Scanner sc) {
    System.out.println("-----------RACTANGLE-------------");
    System.out.println("Enter length: ");
    float length = sc.nextFloat();
    System.out.println("Enter width: ");
    float width = sc.nextFloat();

    System.out.println("Area of ractangle: " + (length * width));
  }
}

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // object of circle class:
    Circle objC = new Circle();
    objC.area(sc);
    Ractangle objR = new Ractangle();
    objR.area(sc);
  }
}
