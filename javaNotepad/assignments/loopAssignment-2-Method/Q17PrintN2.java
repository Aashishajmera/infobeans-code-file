// 17) 1 2 4 7 11 16 …… n terms

import java.util.Scanner;

public class Q17PrintN2 {
    //create method:
    public void increment(int n){
       if(n >= 1){
         System.out.print("Print number: ");
       }
        int ans = 1;
        for(int i = 0; i < n; i++){
            ans += i;
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        //create object:
        Q17PrintN2 obj = new Q17PrintN2();
        obj.increment(n);
    }
}
