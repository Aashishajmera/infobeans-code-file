/* 61)
    * 
   *** 
  ***** 
 ******* 
*********  */

class Pt61{
	public static void main(String[] args){
		int z = 1;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int k = 1; k <= z; k++){
				System.out.print("*");
			}
			z+=2; 
			System.out.println();
		}
	}
}