/* 72)
A B C D E
 A B C D 
  A B C 
   A B 
    A  */
	
class Pt72{
	public static void main(String[] args){
		int k = 9;
		for(int r = 1; r <= 5; r++,k-=2){
			char z = 65;
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				if(r%2 != 0){
					if(c%2 != 0){
						System.out.print(z);
						z++;
					}else{
						System.out.print(" ");
					}
				}else{
					if(c%2 != 0){
						System.out.print(z);
						z++;
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}