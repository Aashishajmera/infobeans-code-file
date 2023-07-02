	// 32) A b C d E f G h …… n terms

	import java.util.Scanner;
	class Q32Alphabet{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any alphabet: ");
			char ch = sc.next().charAt(0);
			
			/* for(int i = 65; i <= ch; i++){
				if(i%2 != 0){
					for(char j = 65; j <= ch; j += 2){
						System.out.println(j);
						int s = ch + 32;
						for(char k = 97; k <= s; k++){
							System.out.println(++k);
						
						}
					}
				}
			} */
			
			int n=0;
			int v = 'A';
			
			for(; v <= ch; v++){
				if(v%2 != 0){
					n = 'A';
					System.out.println(n);
				}else{
					char z = (char)(n+32);
					for(; v <= z; v++){
						System.out.println(z);
					}
					
				}
			}
			
		}
	}