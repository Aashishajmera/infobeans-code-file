import java.util.Scanner;

public class EvenOddSwit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("given number is Even: ");
                break;
            case 1:
                System.out.println("given number is Odd: ");
                break;
            default:
                System.out.println("case not match: ");
        }
    }
}
