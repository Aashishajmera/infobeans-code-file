/* 70)
* * * * *
 * * * *
  * * *
   * *
    *
 */	
class Pt70{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = r; c <= (2*5-r); c++){
				if(r%2 != 0){
					if(c%2 != 0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					if(c%2 == 0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}