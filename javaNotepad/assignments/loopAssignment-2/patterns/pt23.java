// 23)
// a 
// bc 
// d f
// g  j
// klmno 

class pt23{
	public static void main(String[] args){
		char z = 97;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(c == 1 || r == 5 || c == r){
					System.out.print(z);
					z++;
				}else{
					System.out.print(" ");
					z++;
				}
			}
			System.out.println();
		}
	}
}