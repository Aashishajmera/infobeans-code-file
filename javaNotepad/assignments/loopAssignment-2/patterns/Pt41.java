// 41)
// A 
// BCD 
// EFGHI 
// JKLMNOP 

class Pt41{
	public static void main(String[] args){
		char z = 65;
		int k = 1;
		for(int r = 1; r <= 4; r++){
			for(int c = 1; c <= k; c++){
				System.out.print(z);
				z++;
			}
			System.out.println();
			k+=2;
		}
	}
}