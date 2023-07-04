// 36)
// ABCDE

// A  D

// A C 

// AB

// A

class pt36{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			char z = 65;
			for(int c = 1; c <= r; c++){
				if(c == 1 || r == 5 || c == r){
					System.out.print(z);
					z++;
				}else{
					System.out.print(" ");
					z++;
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}