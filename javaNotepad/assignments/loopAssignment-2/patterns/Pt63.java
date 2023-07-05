/* 63)
    A 
   ABC 
  ABCDE 
 ABCDEEF 
ABCDEFGHI */

class Pt63{
	public static void main(String[] args){
		int k = 1; 
		for(int r = 1; r <= 5; r++){
			char z = 65;
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				System.out.print(z);
				z++;
			}
			k+=2;
			System.out.println();
		}
	}
}