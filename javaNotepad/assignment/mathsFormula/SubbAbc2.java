public class SubbAbc2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 1;
        int d = ((a * a) + (b * b) + (c * c) - (2 * a * b) + (2 * b * c) - (2 * c * a));
        System.out.println("(a+b+c)^2 value is: " + d);
    }
}
