// 2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.

public class PerimeterOfRactangle {
    public static void main(String[] args) {
        int area = 230;
        int breadth = 8;
        
        int length = (area/breadth);
        int perimeter = 2*(length+breadth);

        System.out.println("The length of ractangle is: " +length);
        System.out.println("The perimeter of ractangle is: " +perimeter);
    }
}
