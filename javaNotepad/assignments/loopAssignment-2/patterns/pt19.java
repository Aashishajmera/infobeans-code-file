// 19)
// *
// ** 
// * * 
// *  *
// *   *
// ****** 

class pt19{
	public static void main(String[] args){
		for(int r = 1; r <= 6; r++){
			for(int c = 1; c <= r; c++){
				if(3 <= r && r < 6){
					if(c==1 || c == r){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}