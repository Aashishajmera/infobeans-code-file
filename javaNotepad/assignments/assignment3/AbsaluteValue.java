import java.util.Scanner;

public class AbsaluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        if(num1 > 0){
            System.out.println(+num1);
        }else{
            System.out.println((-num1));
        }
    }
}
