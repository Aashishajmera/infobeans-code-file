/* 49)
    1 	
   10 
  101 
 1010 
10101 */

class Pt49{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= r; c++){
				if(c%2 == 0){
					System.out.print("0");
				}else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}