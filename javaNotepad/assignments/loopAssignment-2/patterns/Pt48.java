/* 48)
	A
   AB 
  A_C 
 A__D 
ABCDE */

class Pt48{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			char z = 65;
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = r; c <= 5; c++){
				if(r == 5 || c == 5 || c == r){
					System.out.print(z);
					z++;
				}else{
					System.out.print("_");
					z++;
				}
			}
			System.out.println();
		}
	}
}