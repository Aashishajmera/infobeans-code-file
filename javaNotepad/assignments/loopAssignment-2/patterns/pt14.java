// 1 
// 23 
// 456 
// 78910

class pt14{
	public static void main(String[] args){
		int a = 1;
		for(int r = 1; r <= 4; r++){
			for(int c = 1; c <= r; c++){
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}