package JAVA.LOOPS;

import java.util.Scanner;

public class FindStringSum {
    public static void main(String[] args) {
        System.out.println("Please enter something...");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String number = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                number+=s.charAt(i);
            }
        }

        System.out.println("Numeric string is: "+number);
        int length = number.length();
        int n = Integer.parseInt(number);
        int sum = 0;
        for(int i = 1; n!=0; i++){
            sum += n%10;
            n/=10;
        }

        System.out.println("String sum is: "+ sum);
    }
}
