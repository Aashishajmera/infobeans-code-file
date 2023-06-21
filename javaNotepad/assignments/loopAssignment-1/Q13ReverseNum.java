import java.util.Scanner;

public class Q13ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int lastDigit = 0, reverse = 0;

        while (n != 0) {
            lastDigit = n % 10;
            reverse = reverse*10+lastDigit ;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
