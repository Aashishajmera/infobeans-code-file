/* 80)
1 
12 
1 3 
1  4 
1 3 
12 
1   */

class Pt80{
	public static void main(String[] args){
		int z = 2;
		for(int r = 1; r <= 7; r++){
			if(r <= 4){
				for(int c = 1; c <= r; c++){
					if(c == 1 || c == r){
						System.out.print(c);
					}else{
						System.out.print(" ");
					}
				}
			}else{
				for(int c = 1; c <= (r-z); c++){
					if(c == 1 || c == (r-z)){
						System.out.print(c);
					}else{
						System.out.print(" ");
					}
				}
				z+=2;
			}
			System.out.println();
		}
		
		
		// Wrong
		/* int z = 1;
		for(int r = 1; r <= 7; r++){
			for(int c = 1; c <= 4; c++){
				if((c == 1 || c == r ) && (r <= 4)){
					System.out.print(c);
				}else if(r >= 5){
					for(int k = 1; k <= (r-z); k++){
						if(k == 1||k == (r-z)){
							System.out.print(r-z);
						}else{
							System.out.print(" ");
						}
					}z+=2;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		} */
	}
}