// 30) 1+11+111+1111+11111+….

import java.util.Scanner;

public class Q30OnlyOne {

    //create method: 
    public void one(int n){
        int ans = 0;
        for(int i = 1; i <= n; i++){
            ans = ((ans * 10)+1);
            if(i == n){
                System.out.println(ans);
            }else{
                System.out.print(ans +"+");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        //create object:
        Q30OnlyOne obj = new Q30OnlyOne();
        obj.one(n);
    }
}
