/* 52)	
12345 
 1__4 
  1_3 
   12 
    1  */
	
class Pt52{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			/* for(int c = 1; c <= (6-r); c++){
				if(r >= 2 && r <= 3){
					if(c == 1 || c == (6-r)){
						System.out.print(c);
					}else{
						System.out.print("_");
					}
				}else{
					System.out.print(c);
				}
			}
			System.out.println(); */
			
			for(int c = 1; c <= (6-r); c++){
				if(c == 1 || r == 1 || c == (6-r)){
					System.out.print(c);
				}else{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}