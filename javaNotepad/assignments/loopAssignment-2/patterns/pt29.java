// 29)
// 1

// 222

// 33333

// 4444444

// 555555555 

class pt29{
	public static void main(String[] args){
		int k = 0;
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (r+k); c++){
				System.out.print(r);
			}
			System.out.println();
			System.out.println();
			k++;
		}
		
	}
}