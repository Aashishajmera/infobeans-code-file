public class Strong {
    public static void main(String... agrs){
        int n = 145, lastDigit, mul = 1, strong = 0, temp = n;
        while(n != 0){
            lastDigit = n % 10;
            while(lastDigit != 1){
                mul *= lastDigit;
                lastDigit--;
            }
            strong += mul;
            mul = 1;
            n /= 10;
        }
        
        if(temp == strong){
            System.out.println("Number is strong: "+strong);
        }else{
            System.out.println("Number is not strong: ");
        }
    }
}
