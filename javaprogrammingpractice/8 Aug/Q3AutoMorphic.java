import java.util.Scanner;

class Q3AutoMorphic{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit: ");
        int n = sc.nextInt();

        int sqr = n*n;
        int rem = 0; 
        rem = sqr % 10;
        if(n == rem){
            System.out.println("automorphic number: ");
        }else{
            System.out.println("Not automorphic: ");
        }
        
    }
}