public class Armstrong {
    public static void main(String... args){
        int n = 1634, count=0, temp = n, lastDigit, fact = 1, arm = 0;
        while(n != 0){
            lastDigit = n % 10;
            count++;
            n /= 10;
        }
        
        n = temp;
        
        while(n != 0){
            lastDigit = n % 10;
            for(int i = 1; i <= count; i++){
                fact *= lastDigit;
            }
            arm += fact;
            fact = 1;
            n /= 10;
        }
        
        if(arm == temp){
            System.out.println("Number is armstrong: ");
        }else{
            System.out.println("Number is not armstrong: ");
        }
    }
}
