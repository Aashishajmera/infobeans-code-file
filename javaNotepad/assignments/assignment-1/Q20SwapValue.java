public class Q20SwapValue {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // a = a-b;
        // b = a+b;
        // a = b-a;

        // int c = a;
        // a = b;
        // b = c;

        System.out.println(a);
        System.out.println(b);
    }
}