// 2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.

public class PerimeterOfRactangle {
    public static void main(String[] args) {
        float area = 96;
        float breadth = 8;
        
        float length = (area/breadth);
        float perimeter = 2*(length+breadth);

        System.out.println("The length of ractangle is: " +length);
        System.out.println("The perimeter of ractangle is: " +perimeter);
        
    }
}
