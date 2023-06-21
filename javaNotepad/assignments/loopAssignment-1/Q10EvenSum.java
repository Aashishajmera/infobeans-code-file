import java.util.Scanner;

public class Q10EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int i = 2, sum = 0;
        while(i <= n*2){
            sum += i;
            i += 2;
        }
        System.out.println("sum of even numbers is: "+sum);
    }
}
