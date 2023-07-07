/* 87)
***** ***** 
****   **** 
***     ***
**       ** 
*         *  */

class Pt87{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 11; c++){
				if(c >= (7-r) && c <= (5+r)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}