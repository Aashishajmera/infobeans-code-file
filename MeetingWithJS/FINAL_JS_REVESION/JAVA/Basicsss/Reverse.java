public class Reverse{
    public static void main(String[] args){
        int n = 123456, lastDigit , rev = 0;
        while(n != 0){
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("The reverse number is: "+rev);
    }
}