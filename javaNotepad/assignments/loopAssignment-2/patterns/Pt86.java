/* 86)
*         *
**       ** 
***     *** 
****   **** 
***** ***** */

class Pt86{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 11; c++){
				if(c > r && c <= (11-r)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}