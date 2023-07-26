import java.util.Scanner;
class Prime{
	private int n ;
	private boolean flag;
	// create constructor: 
	public Prime(int n, boolean flag){
		this.n = n;
		this.flag = flag;
	}
	
	// default constructor:
	public Prime(){
		
	}
	
	//check prime method:
	public void checkPrime(){
		for(int i = 2; i <= n/2; i++){
			if(n%i == 0){
				flag = false;
				break;
			}
		}
		if(flag && n > 1){
			System.out.println("prime: ");
		}else{
			System.out.println("Not prime: ");
		}
	}
	
}
public class Q2PrimeOrNot2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
        //create object:
		Prime obj = new Prime(n, true);
		obj.checkPrime();
    }
}
