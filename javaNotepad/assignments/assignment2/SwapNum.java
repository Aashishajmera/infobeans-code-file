public class SwapNum {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 45;
        byte c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);
    }
}
