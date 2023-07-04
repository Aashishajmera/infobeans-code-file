// 30)
// ***** 
// **** 
// *** 
// ** 
// * 

class pt30{
	public static void main(String[] args){
		// for(int r = 5; r >= 1; r--){
			// for(int c = 1; c <= r; c++){
				// System.out.print("*");
			// }
			// System.out.println();
		// }
		
		// Second way
		int z = 6;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (z-r); c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}