/* 71)
123456789

 1234567

  12345

   123

    1 */
	
class Pt71{
	public static void main(String[] args){
		int k = 9;
		for(int r = 1; r <= 5; r++,k--){
			int z = 1;
			for(int c = 1; c <= k; c++){
				if(c >= r && c <= k){
					System.out.print(z);
					z++;
 				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}