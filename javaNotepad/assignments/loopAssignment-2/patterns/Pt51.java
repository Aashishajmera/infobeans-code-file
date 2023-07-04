/* 51)	
55555
 4444
  333 
   22 
    1  */
	
class Pt51{
	public static void main(String[] args){
		/* int k = 5; 
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}for(int c = 1; c <= (6-r); c++){
				System.out.print(k);
			}
			k--;
			System.out.println();
		} */
		
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}for(int c = 1; c <= r; c++){
				System.out.print(r);
			}
			System.out.println();
		}
	}
}