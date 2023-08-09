// 2. spy number 
// Ex. = 1124

import java.util.Scanner;

class Q2SpyNumber{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        int rem = 0, mul = 1, add = 0;
        while(n != 0){
            rem = n % 10;
            mul = mul * rem;
            add = add + rem;
            n = n/10;
        }
        if(mul == add){
            System.out.println("Number are spy: ");
        }else{
            System.out.println("not spy: ");
        }
        
    }
}