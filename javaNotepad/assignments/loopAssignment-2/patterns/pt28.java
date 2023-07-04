// 28)
// 1 
// 123 
// 12345 
// 1234567 
// 123456789

class pt28{
	public static void main(String[] args){
		int k = 6;
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (k-r); c++){
				System.out.print(c);
			}
			k++;
			System.out.println();
		}
	}
}