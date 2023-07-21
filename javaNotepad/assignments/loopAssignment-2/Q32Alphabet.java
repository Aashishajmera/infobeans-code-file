	// 32) A b C d E f G h …… n terms

	import java.util.Scanner;
	class Q32Alphabet{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any alphabet: ");
			char ch = sc.next().charAt(0);
			char n;
			
			if(ch >= 'A' && ch <= 'Z'){
				n = 'A';
				for(; n <= ch; n++){
					if(n%2 != 0){
						System.out.println(n);
					}else{
						char z = (char)(n+32);
						System.out.println(z);
					}
				}
			}else{
				n = 'a';
				for(; n <= ch; n++){
					if(n%2 != 0){
						char z = (char)(n-32);
						System.out.println(z);
					}else{
						System.out.println(n);
					}
				}
			}
			
		}
	}