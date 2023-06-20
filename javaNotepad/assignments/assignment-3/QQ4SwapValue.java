// 4. WAP to exchange value to two variable with third variable and without third variable

public class QQ4SwapValue {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println(a);
        System.out.println(b);

    }
}
