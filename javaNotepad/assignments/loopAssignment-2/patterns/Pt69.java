/* 69)
*********
 ******* 
  ***** 
   *** 
    *  */
	

class Pt69{
	public static void main(String[] args){
		/* int k = 9;
		for(int r = 1; r <= 5; r++,k-=2){
			for(int c = 1; c <=(r-1); c++){
				System.out.print(" ");
			}for(int c = 1; c <= k; c++){
				System.out.print("*");
			}
			System.out.println();
		} */
		
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 9; c++){
				if(c >= r && c <= (10 - r)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}