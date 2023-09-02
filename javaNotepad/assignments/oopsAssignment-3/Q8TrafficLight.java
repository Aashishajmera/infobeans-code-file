// 8. Write a Java program to create class called "TrafficLight" with attributes for color and duration,
// and methods to change the color and check for red or green.

import java.util.Scanner;

class TrafficLight {

  private String color;
  private int duration;

  TrafficLight(String color, int duration) {
    this.color = color;
    this.duration = duration;
  }

  // getter method:
  public String getColor() {
    return this.color;
  }

  public int duration() {
    return this.duration;
  }

  // display method:
  public void display() {
    System.out.println("Color : " + color);
    System.out.println("Duration: " + duration);
  }
}

public class Q8TrafficLight {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter color: ");
    String color = sc.nextLine();
    System.out.println("Duration: ");
    int duration = sc.nextInt();

    // create object:
    TrafficLight objT = new TrafficLight(color, duration);

    if (objT.getColor().equals("red") || objT.getColor().equals("Red")) {
      objT.display();
    } else if (
      (objT.getColor().equals("green")) || (objT.getColor().equals("Green"))
    ) {
      objT.display();
    } else {
      System.out.println("color not metch: ");
    }
  }
}
