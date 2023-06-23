import java.util.Scanner;

public class Q28Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%5 == 0){
                System.out.println("Hello");
            }else{
                System.out.println(i);
            }

        }
    }
}
