/* 81)
   * 
  *_*
 *_*_* 
*_*_*_* 
 *_*_* 
  *_* 
   *  
*/
	
class Pt81{
	public static void main(String[] args){
		for(int r = 1; r <= 7; r++){
			for(int c = 1; c <= 7; c++){
				if((c >= (5-r) && c <= (3+r) && r <= 4) || (c >= (r-3) && c <= (11-r)&& (r >= 5))){
					if(r%2 != 0){
						if(c%2 == 0){
							System.out.print("*");
						}else{
							System.out.print("_");
						}
					}else{
						if(c%2 != 0){
							System.out.print("*");
						}else{
							System.out.print("_");
						}
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}