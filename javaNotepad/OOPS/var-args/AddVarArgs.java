// var- args
import java.util.Scanner;
class Add{
	
	
	public int add(){
		
	}
	
	
	public int[] setValue(Scanner sc, int x[]){
		
	}
	
	
}
class AddVarArgs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number positive number: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		Add obj = new Add();
		int result[] = obj.setValue(sc, arr);
		System.out.println(result);
	}
}