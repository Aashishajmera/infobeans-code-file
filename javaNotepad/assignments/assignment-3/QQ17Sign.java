// 17. W.A.P to check the sign of given number. 


import java.util.Scanner;

public class QQ17Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Positive number: ");
        }else{
            System.out.println("Negative number: ");
        }
    }
}
