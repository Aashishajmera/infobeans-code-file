// 33)
// ABCDE 
// ABCD 
// ABC 
// AB 
// A 

class pt33{
	public static void main(String[] args){
		// int k = 6;
		// for(int r = 1; r <= 5; r++){
			// char z = 65;
			// for(int c = 1; c <= (k-r); c++){
				// System.out.print(z);
				// z++;
			// }
			// System.out.println();
		// }
		
		for(int r = 5; r >= 1; r--){
			char z = 65;
			for(int c = 1; c <= r; c++){
				System.out.print(z);
				z++;
			}
			System.out.println();
		}
	}
}