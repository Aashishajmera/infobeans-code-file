// 34)
// EEEEE 
// DDDD 
// CCC 
// BB 
// A 

class pt34{
	public static void main(String[] args){
		char z = 69;
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= r; c++){
				System.out.print(z);
			}
			System.out.println();
			z--;
		}
	}
}