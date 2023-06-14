import java.util.Scanner;

public class Q16Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int count = 1;
        int i = 2;
        while (i <= num) {
            if (num % num == 0 && num % i == 0) {
                count ++;
            }
            i++;
        }
        if(count >=3){
            System.out.println("Not prime:");
        }else{
            System.out.println("prime: ");
        }
    }
}
