/* 73)
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1  */
	
class Pt73{
	public static void main(String[] args){
		int k = 9;
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				if(c%2 != 0){
					System.out.print(r);
				}else{
					System.out.print(" ");
				}
			}
			k-=2;
			System.out.println();
		}
	}
}