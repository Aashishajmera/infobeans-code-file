// 4) WAP to print table of a number.

import java.util.Scanner;

public class Q4Table2 {

    // create method:
    public void table(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n +" * " +i +" = " +(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        Q4Table2 obj = new Q4Table2();
        obj.table(n);
    }
}
