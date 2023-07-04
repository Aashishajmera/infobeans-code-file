// 35)
// ***** 
// *  *
// * *
// ** 
// *

class pt35{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			for(int c = r; c >= 1; c--){
				if(r == 5 || c == 1|| c == r){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}