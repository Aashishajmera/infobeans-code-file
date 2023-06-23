import java.util.Scanner;
class Prime1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		boolean flag = true;
		for(int i = 2; i <= n/2; i++){
			if(n%i == 0){
				flag = false;
				break;
			}
		}
		if(flag == true && n > 1){
			System.out.println("prime: ");
		}else{
			System.out.println("Not prime: ");
		}
	}
}