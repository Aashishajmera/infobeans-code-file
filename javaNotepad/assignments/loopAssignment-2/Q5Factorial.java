// 5) WAP to find out the factorial of a number.

public class Q5Factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 5; i >= 2; i--) {
            fact *= i;
        }
        System.out.println("5 factorial is: " + fact);
    }
}
