// a 
// ab 
// abc 
// abcd 
// abcde

class pt12{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			char z = 97, p = (char)(z+r);
			for(char c = z; c < p; c++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}