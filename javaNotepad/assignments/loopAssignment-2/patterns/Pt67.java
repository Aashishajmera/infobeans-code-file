/* 67)
    A 
   B B 
  C   C 
 D     D 
EEEEEEEEE */


class Pt67{
	public static void main(String[] args){
		char ch = 'A';
		for(int r = 1; r <= 5; r++,ch++){
			for(int c = 1; c <= 9; c++){
				if(c == (6-r)||c == (4+r)||r == 5){
					System.out.print(ch);
				}
				else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		// Second way
		/* char z = 65;
		int k = 1;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= k; c++){
				if(c == 1 || c == k || r == 5){
					System.out.print(z);
				}else{
					System.out.print(" ");
				}
			}
			k+=2; z++;
			System.out.println();
		} */
		
		
	}
}