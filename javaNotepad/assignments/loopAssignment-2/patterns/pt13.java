// 1 
// 01 
// 101 
// 0101 
// 10101

class pt13{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(r%2 != 0){
					for(int a = 1; a <= c; a++){
						int p = 1;
						System.out.print(p);
					}
					System.out.println();
				}else{
					for(int a = 0; a < c; a++){
						int p = 0;
						System.out.print(p);
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}