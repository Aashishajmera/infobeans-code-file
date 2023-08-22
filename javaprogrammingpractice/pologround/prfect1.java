import java.util.Scanner;

class A{
	public void inputArray(int n,Scanner sc){
		int temp=0;
		for(int i=1;i<n; i++){
		if(n%i==0){
		temp=temp+i;
		}

		}
	if(temp==n)
		System.out.print("per");
	else
		System.out.print("not");
		}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enternum ");
		int n= sc.nextInt();
		
		A obj = new A();
		obj.inputArray(n,sc);
		
	}

}