/* 75) 
123456789
 1+++++7 
  1+++5 
   1+3 
    1 */
	
class Pt75{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			int k = 1; 
			for(int c = 1; c <= 9; c++){
				if(c >= r && c <= (10 - r)){
					if(r == 1 || c == r || c == (10 - r)){
						System.out.print(k);
						k++;
					}else{
						System.out.print("+");
						k++;
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}