import java.util.Scanner;

class MagicalOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int lastWord = 0 , store = 0;
        int sum = 0, rSum = 0;

       do{
        while(n != 0){
            lastWord = n % 10;
            sum += lastWord;
            n = n / 10;
        }
        n = sum;
       }while(sum <= 9);

       if(sum == 1){
        System.out.println("magical number: ");
       }else{
        System.out.println("Not magical ");
       }
    }
}