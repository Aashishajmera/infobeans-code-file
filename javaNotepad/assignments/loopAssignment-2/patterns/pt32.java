// 32)
// 55555 
// 4444 
// 333 
// 22 
// 1

class pt32{
	public static void main(String[] args){
		// for(int r = 5; r >= 1; r--){
			// for(int c = 1; c <= r; c++){
				// System.out.print(r);
			// }
			// System.out.println();
		// }
		int z = 6;
		for(int r = 1; r <= 5; r++){
			int sub = z-r;
			for(int c = 1; c <= sub; c++){
				System.out.print(sub);
			}
			System.out.println();
		}
	}
}