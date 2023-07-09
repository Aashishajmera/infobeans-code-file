/* 84)
    1 
   212 
  32123 
 4321234 
543212345 */

class Pt84{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 9; c++){
				if(c >= (6-r) && c <= (4+r)){
					if(c <= 5){
						for(int k = r; k >= 1; k--){
							System.out.print(k);
							break;
						}
					}else if(c >= 6 && c <= 9){
						for(int t = 2; t <= r; t++){
							System.out.print(t);
							break;
						}
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}