// 42)
// 54321 
// 5432 
// 543 
// 54 
// 5

class Pt42{
	public static void main(String[] args){
		for(int r = 5; r >= 1; r--){
			int k = 5;
			for(int c = 1; c <= r; c++){
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
	}
}