// 27)
// 1 
// 10 
// 1 1 
// 1  0 
// 10101

class pt27{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(r >= 3 && r < 5){
					if(c == 1 || c == r){
						if(c%2 == 0){
							System.out.print("0");
						}else{
							System.out.print("1");
						}
					}
					else{
						System.out.print(" ");
					}
				}else{
					if(c%2 == 0){
							System.out.print("0");
						}else{
							System.out.print("1");
						}
				}
			}
			System.out.println();
		}
	}
}