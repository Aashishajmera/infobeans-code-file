// 26)
// * 
// *# 
// *#* 
// *#*# 
// *#*#* 

class pt26{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (6-r); c++){
				if(c%2 == 0){
					System.out.print("#");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}