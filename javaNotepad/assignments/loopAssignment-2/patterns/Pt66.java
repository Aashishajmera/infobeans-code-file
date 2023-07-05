/* 66) 
    1 
   1*1 
  1***1 
 1*****1 
111111111 */


class Pt66{
	public static void main(String[] args){
		int k = 1; 
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				if(c == 1 || c == k || r == 5){
					System.out.print("1");
				}else{
					System.out.print("*");
				}
			}
			k+=2;
			System.out.println();
		}
	}
}