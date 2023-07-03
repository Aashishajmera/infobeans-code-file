// 22)
// A
// AB
// A C
// A  D
// ABCDE

class pt22{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				char p = 65;
				char z = (char)(p+r);
				for(char k = p; k < z; k++){
					if(3 <= r && r < 5){
						if(c == 1 || c == r){
							System.out.print(k);
						}else{
							System.out.print(" ");
						}
					}else{
						System.out.print(k);
					}
				}
			}
			System.out.println();
		}
	}
}