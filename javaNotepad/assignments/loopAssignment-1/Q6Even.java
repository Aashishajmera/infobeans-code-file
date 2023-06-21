import java.util.Scanner;

public class Q6Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
