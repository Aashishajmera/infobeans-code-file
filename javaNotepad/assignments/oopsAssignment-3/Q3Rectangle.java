// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. 
// Calculate the area and perimeter of the rectangle.

import java.util.Scanner;

class Rectangle{
    private float width;
    private float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

  public  void calculatArea(){
        System.out.println("Area of ractangle: "+(width*height));
    }

    public void PerimeterOfRact(){
        System.out.println("Perimeter of the rectangle: "+((height+width)*2));
    }
}

public class Q3Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        float width = sc.nextFloat();
        System.out.println("Enter height: ");
        float height = sc.nextFloat();

        // create object of rectangle class: 
        Rectangle objR = new Rectangle(width, height);
        objR.calculatArea();
        objR.PerimeterOfRact();
    }
}
