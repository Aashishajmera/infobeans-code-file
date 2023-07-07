/* 91)
*     *
 *   *
  * *
   * 
  * * 
 *   * 
*	  * */

class Pt91{
	public static void main(String[] args){
		for(int r = 1; r <= 7; r++){
			for(int c = 1; c <= 7; c++){
				if(c == r || c == (8-r)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}