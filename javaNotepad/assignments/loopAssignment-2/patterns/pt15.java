// 15)
// A

// BB

// CCC

// DDDD

// EEEEE

class pt15{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			char p = 64;
			char z = (char)(p+r);
			for(int c = 1; c <= r; c++){
				for(char k = z; k <= z; k++){
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}
}