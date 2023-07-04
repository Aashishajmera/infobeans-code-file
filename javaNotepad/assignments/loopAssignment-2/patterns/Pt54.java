/* 54)
ABCDE 
 A__D 
  A_C 
   AB 
    A  */
	
class Pt54{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			char z = 65;
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= r; c++){
				if(r == 5 || c == 1 || c == r){
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