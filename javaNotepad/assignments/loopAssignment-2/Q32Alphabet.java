// 32) A b C d E f G h …… n terms

import java.util.Scanner;
class Q32Alphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet: ");
		char ch = sc.next().charAt(0);
		for(int i = 65; i <= ch; i++){
			if(ch >= 65 && ch <= 90){
				System.out.println(ch);
				
			}
		}
		
	}
}