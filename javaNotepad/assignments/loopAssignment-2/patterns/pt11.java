// A 
// AB 
// ABC 
// ABCD 
// ABCDE

class pt11{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
				for(char c = 65; c < (char)(c+r); c++){
					System.out.print(c);
				}
			System.out.println();
		}
	}
}