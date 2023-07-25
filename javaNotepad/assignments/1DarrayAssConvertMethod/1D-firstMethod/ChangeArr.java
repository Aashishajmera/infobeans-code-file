import java.util.Scanner;

class A{
	
	private int arr[] = {3,45,67,8,3};
	
	
	public void m1(){
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void setArray(Scanner sc){
		System.out.println("Enter 5 element: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
}

class ChangeArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		A obj = new A();
		obj.m1();
		obj.setArray(sc);
		obj.m1();
	}
}