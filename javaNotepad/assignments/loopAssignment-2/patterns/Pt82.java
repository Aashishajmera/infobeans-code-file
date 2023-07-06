/* 82)
   * 
  *** 
 ***** 
******* 
 ***** 
  *** 
   * 
*/ 
   
class Pt82{
	public static void main(String[] args){
		int k  = 0;
		for(int r = 1; r <= 7; r++){
			k = (r <= 4) ? ++k : --k;
			for(int c = 1; c <= 7; c++){
				if(c >= 5-k && c <= 3+k){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}