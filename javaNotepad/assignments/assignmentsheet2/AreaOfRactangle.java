// The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
class AreaOfRactangle {
    public static void main(String[] args) {
        int perimeter = 230;
        int length = 70;

        int breadth = (perimeter / 2) - length;
        int area = (length * breadth);
        System.out.println("The breadth of ractange is: " + breadth);
        System.out.println("The are of ractangle is: " + area);
    }
}