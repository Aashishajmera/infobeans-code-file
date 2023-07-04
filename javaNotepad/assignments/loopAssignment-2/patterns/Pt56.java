/* 56)	
11111 
 2222 
  333 
   44 
    5 */
	
class Pt56{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int k = 1; k <= (r-1); k++){
				System.out.print(" ");
			}
			for(int c = r; c <= 5; c++){
				System.out.print(r);
			}
			System.out.println();
		}
	}
}