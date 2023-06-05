public class A8B8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = (((a * a * a * a) + (b * b * b * b)) * ((a * a) + (b * b)) * (a + b) * (a - b));
        System.out.println("(a^8 + b^8) value is: " + c);
    }
}
