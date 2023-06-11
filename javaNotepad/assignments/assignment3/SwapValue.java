public class SwapValue {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
