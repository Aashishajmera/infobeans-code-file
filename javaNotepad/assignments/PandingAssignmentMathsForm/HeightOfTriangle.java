// 7. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².

public class HeightOfTriangle {
    public static void main(String[] args) {
        float base = 50;
        float area = 500;

        float height = 2*(area/base);
        System.out.println("The height of a triangle is: " +height);
    }
}
