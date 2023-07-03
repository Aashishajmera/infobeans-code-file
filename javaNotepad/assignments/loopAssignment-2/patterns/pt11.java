// A 
// AB 
// ABC 
// ABCD 
// ABCDE

class pt11{
	public static void main(String[] args){
		char c = 65;
		for(int r = 1; r <= 5; r++){
			char p = (char)(c+r);
			for(char z = c; z < p; z++){
				System.out.print(z);
			}
			System.out.println();
		}
	}
}