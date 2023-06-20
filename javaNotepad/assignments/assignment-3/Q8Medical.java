// 8. Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

import java.util.Scanner;
public class Q8Medical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("medical cause or not ( 'y' or 'n' )");
        char medical = sc.next().charAt(0);
        if(medical == 'y'){
            System.out.println("you can sit: ");
        }else{
            System.out.println("you can't sit: ");
        }
    }
}
