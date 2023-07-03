// 21)
// 1 
// 22 
// 3 3
// 4  4
// 55555

class pt21{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(r==c||r==5||c==1){
					System.out.print(r);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}