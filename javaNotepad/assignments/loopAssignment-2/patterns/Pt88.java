/* Q88)
***** ***** 
****   **** 
***     ***
**       ** 
*         *
*         *
**       ** 
***     *** 
****   **** 
***** ***** */

class Pt88{
	public static void main(String[] args){
		for(int r = 1; r <= 10; r++){
			for(int c = 1; c <= 11; c++){
				if(((7-r) <= c && (5+r) >= c && r <= 5) || ( r >= 6 && c > (r-5) && c <= (16-r))){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}