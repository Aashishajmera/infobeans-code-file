/*
47) 
    1
   11 
  1*1 
 1**1 
11111 
*/

class Pt47{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= r; c++){
				if(c == 1 || r == 5 || c == r){
					System.out.print("1");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}