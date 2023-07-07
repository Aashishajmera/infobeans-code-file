/* 90)
     1
    101 
   10101 
  1010101 
 101010101 
10101010101  */

class Pt90{
	public static void main(String[] args){
		for(int r = 1; r <= 6; r++){
			for(int c = 1; c <= 11; c++){
				if(c >= (7-r) && c <= (5+r)){
					if(r%2 != 0){
						if(c%2 == 0){
							System.out.print("1");
						}else{
							System.out.print("0");
						}
					}else{
						if(c%2 != 0){
							System.out.print("1");
						}else{
							System.out.print("0");
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