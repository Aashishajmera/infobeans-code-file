import java.util.Scanner;
class PositiveNegative{
	public void positiveNegative(int n){
		if(n >= 0){
			System.out.println("Positive: ");
		}else{
			System.out.println("Negative: ");
		}
	} 
}

class Q4PositiveOrNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		PositiveNegative obj = new PositiveNegative();
		obj.positiveNegative(n);
	}
}