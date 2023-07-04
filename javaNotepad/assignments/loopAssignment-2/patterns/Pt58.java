/* 58)
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5  */

class Pt58{
	public static void main(String[] args){
		// Not success
		/* for(int r = 5; r >= 1; r--){
			int c = 1;
			for(; c <= (r-1); c++){
				System.out.print(" ");
			} if(c == 1 && r == 1){
				c = 0;
			}
			for(int k = 1; k <= (5-c); k++){
				System.out.print(k+" ");
			}
			System.out.println();
		} */
		
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int k = 1; k <= r; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}