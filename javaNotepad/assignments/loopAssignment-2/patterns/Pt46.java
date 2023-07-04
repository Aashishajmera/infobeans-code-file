/* 46)
	A
   AB 
  ABC
 ABCD 
ABCDE */ 

class Pt46{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			char z = 65;
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = r; c <= 5; c++){
				System.out.print(z);
				z++;
			}
			System.out.println();
		}
	}
}