import java.util.Scanner;
class Ractangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		System.out.println("Enter breadth: "); 
		int breadth = sc.nextInt();
		if(length == breadth){
			System.out.println("This is square: ");
		}else{
			System.out.println("Not square: ");
		}
	}
}