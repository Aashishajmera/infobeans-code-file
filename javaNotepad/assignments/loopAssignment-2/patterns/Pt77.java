/* 77)
1 
12 
123 
1234 
123 
12 
1 */

class Pt77{
	public static void main(String[] args){
		int k = 2;
		for(int r = 1; r <= 7; r++){
			if(r >= 5){
				for(int c = 1; c <= (r-k); c++){
					System.out.print(c);
				}
				k+=2;
			}else{
				for(int c = 1; c <= r; c++){
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}