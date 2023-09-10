
import java.util.Scanner;

public class WithoutModuls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int temp = (n/2);
        int ans = (n)-(temp*2);
        if(ans == 1){
            System.out.println("given number is odd:");
        }else{
            System.out.println("Given number is even: ");
        }
    }
}
