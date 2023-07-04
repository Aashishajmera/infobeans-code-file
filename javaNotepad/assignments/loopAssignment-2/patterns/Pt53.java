/* 53)
55555 
 4__4 
  3_3 
   22 
    1 */
	
class Pt53{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}for(int c = 1; c <= r; c++){
				if(r == 5 || c == r || c == 1){
					System.out.print(r);
				}else{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}