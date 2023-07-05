/* 74)
123456789
 1     7 
  1   5 
   1 3 
    1  */
	
class Pt74{
	public static void main(String[] args){
		int k = 9;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				if(r == 1 || c == 1 || c == k){
					System.out.print(c);
				}else{
					System.out.print(" ");
				}
			}
			k-=2;
			System.out.println();
		}
	}
}