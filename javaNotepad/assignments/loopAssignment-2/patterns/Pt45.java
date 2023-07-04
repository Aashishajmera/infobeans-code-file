/* 45)
	5 
   44
  333
 2222
11111  */

class Pt45{
	public static void main(String[] args){
		int k = 5;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= r; c++){ 
				System.out.print(k);
			}
			k--;
			System.out.println();
		}
	}
}