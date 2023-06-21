import java.util.Scanner;

public class Q12Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        int mul = 1;
        while(n>=2){
            mul *= n;
            n--;
        }
        System.out.println("Factorial is: "+mul);
    }

}
