/* 76)
x 
xx 
xxx 
xxxx 
xxx
xx 
x */

class Pt76{
	public static void main(String[] args){
		int k = 2;
		for(int r = 1; r <= 7; r++){
			for(int c = 1; c <= r; c++){
				if(r >= 5){
					for(int d = 1; d <= (r-k); d++){
						System.out.print("X");
					}
					k+=2;
				}else{
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}
}