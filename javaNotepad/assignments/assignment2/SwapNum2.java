public class SwapNum2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        // a = b + a - b;
        // System.out.println(a);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
