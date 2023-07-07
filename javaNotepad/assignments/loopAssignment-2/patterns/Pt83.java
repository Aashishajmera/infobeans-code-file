/* 83)
   * 
  *_* 
 *___* 
*_____* 
 *___* 
  *_* 
   *  
*/
   
class Pt83{
	public static void main(String[] args){
		for(int r = 1; r <= 7; r++){
			for(int c = 1; c <= 7; c++){
				if(((c >= (5-r) && c <= (3+r)) && (r <= 4)) || ((c >= (r-3) && c <= (11-r)) && (r >= 5))){
					if(((c == (5-r) || c == (3+r)) && (r <= 4)) || ((c == (r-3) || c == (11-r)) && (r >= 5))){
						System.out.print("*");
					}else{
						System.out.print("_");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}