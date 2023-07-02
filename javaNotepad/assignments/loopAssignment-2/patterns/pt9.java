// 1 
// 12 
// 123 
// 1234 
// 12345

class pt9{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}