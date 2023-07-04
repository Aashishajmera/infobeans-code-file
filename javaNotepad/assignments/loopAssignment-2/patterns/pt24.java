// 24)
// * 
// ** 
// *@* 
// *@@* 
// *****

class pt24{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(c == 1 || r == 5 || c == r){
					System.out.print("*");
				}else{
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}
}