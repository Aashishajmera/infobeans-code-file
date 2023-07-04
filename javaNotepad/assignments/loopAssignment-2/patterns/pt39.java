// 39)
// 123456 
// 54321 
// 1234 
// 321 
// 12 
// 1 

class pt39{
	public static void main(String[] args){
		for(int r = 6; r >= 1; r--){
				if(r%2 == 0){
					for(int k = 1; k <= r; k++){
						System.out.print(k);
					}
				}else{
					for(int k = r; k >= 1; k--){
						System.out.print(k);
					}
				}			
			System.out.println();
		}
	}
}