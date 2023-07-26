// Q4) Write a program to check wheter alphabet is vowel or consonant
import java.util.Scanner;
class Alphabet{
	public void alphabet(int n){
	if(n == 65 || n == 97 || n == 69 || n == 101 || n == 105 || n == 111 || n == 117 || n == 73 || n == 79 || n == 85){
			System.out.println("Entered alphabet is vowel: ");
		}else{
			System.out.println("Not alphabet: ");
		}
	}
}
class Q4Alphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet: ");
		int n = sc.next().charAt(0);
		
		// create object: 
		Alphabet obj = new Alphabet();
		obj.alphabet(n);
		
		
		
	}
}