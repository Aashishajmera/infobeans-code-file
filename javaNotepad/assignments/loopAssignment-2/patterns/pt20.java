// 20)
// 1 
// 12 
// 1 3
// 1  4 
// 12345 

class pt20{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(3 <= r && r < 5){
					if(c == 1 || c == r){
						System.out.print(c);
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}