// 4. Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.

import java.util.Scanner;

class Circle {

  private float radius;

  // setter method:
  public void setRadius(float radius) {
    this.radius = radius;
  }

  // getter method:
  public float getRadius() {
    return this.radius;
  }

  public void AreaOfCircle() {
    System.out.println("Area of circle : " + (22 / 7 * radius * radius));
  }

  public void circumferenceOfCircle() {
    System.out.println("circumference of the circle: "+(2*22/7*radius));
  }
}

public class Q4Circle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius: ");
    float radius = sc.nextFloat();

    // create object of circle class:
    Circle objC = new Circle();
    objC.setRadius(radius);

    objC.AreaOfCircle();
    objC.circumferenceOfCircle();
}
}
