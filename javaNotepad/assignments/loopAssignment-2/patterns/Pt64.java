/* 64)
    *

   *_*

  *___*

 *_____*

********* */

class Pt64{
	public static void main(String[] args){
		int k = 1;
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				if(c == 1 || r == 1 || c == k){
					System.out.print("*");
				}else{
					System.out.print("_");
				}
			}
			k+=2;
			System.out.println();
		}
	}
}