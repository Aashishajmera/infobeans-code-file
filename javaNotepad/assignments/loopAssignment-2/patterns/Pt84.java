/* 84)
    1 
   212 
  32123 
 4321234 
543212345 */

class Pt84{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = r; c >= 1; c--){
				System.out.print(c);
			}
			for(int c = 2; c <= r; c++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}