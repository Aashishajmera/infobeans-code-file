import java.util.Scanner;

public class febonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0, sum = 0;
        while (n != 0) {
            a = b;
            b = sum;
            System.out.println(sum);
            sum = a + b;
            n--;
        }

    }
}
