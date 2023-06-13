//1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
class AreaOfRactangle {
    public static void main(String[] args) {
        float perimeter = 230;
        float length = 70;

        float breadth = (perimeter - length) /2 ;
        float area = (length * breadth);
        System.out.println("The breadth of ractange is: " + breadth);
        System.out.println("The are of ractangle is: " + area);
    }
}