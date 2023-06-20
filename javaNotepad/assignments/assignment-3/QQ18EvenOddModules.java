import java.util.Scanner;

public class QQ18EvenOddModules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(((num / 2)+(num / 2)) == num){
            System.out.println("Given number is even:");
        }else{
            System.out.println("Given number is odd: ");
        }
    }
}