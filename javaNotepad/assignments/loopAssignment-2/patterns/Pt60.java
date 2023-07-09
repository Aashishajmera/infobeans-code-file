/* 60)
    X 
   X X 
  X___X
 X_____X  
X X X X X */

class Pt60{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 9; c++){
				if(c >= (6-r) && c <= (4+r)){
					if(r <= 2 || r == 5){
						if(r%2 != 0  && c%2 != 0){
							System.out.print("X");
						}else{
							System.out.print(" ");
						}
					}else if(r >= 3 && r <= 4){
						if(r%2 != 0  && c%2 != 0){
							System.out.print("X");
						}else{
							System.out.print("_");
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