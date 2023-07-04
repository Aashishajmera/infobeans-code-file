// 25)
// 5 
// 54 
// 543 
// 5432 
// 54321 

class pt25{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			int k = 5;
			for(int c = 1; c <= r; c++){
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
	}
}