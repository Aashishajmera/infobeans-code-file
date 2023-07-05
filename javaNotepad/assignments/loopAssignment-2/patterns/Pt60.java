/* 60)
    X 
   X X 
  X___X
 X_____X  
X X X X X */

class Pt60{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= r; c++){
				if(r == 3){
					if(c == 1 || c == r){
						System.out.print("X");
					}else{
						System.out.print("___");
					}
				}
				else if(r == 4){
					if(c == 1 || c == r){
						System.out.print("X");
					}else{
						System.out.print("_____");
					}
				}
				else if(r ==1 || r == 2 || r == 5){
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
}