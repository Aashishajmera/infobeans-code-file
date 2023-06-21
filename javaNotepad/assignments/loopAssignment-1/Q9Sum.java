import java.util.Scanner;

public class Q9Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of total n number is: " + sum);
    }
}
