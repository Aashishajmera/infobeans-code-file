// 38)
// 55555 
// 4  4
// 3 3
// 22 
// 1

class pt38{
	public static void main(String[] args){
		int z = 6; 
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (z-r); c++){
				if(r == 1 || c == 1 || c == (z-r)){
					System.out.print(z-r);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}