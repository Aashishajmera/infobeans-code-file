class Pt3{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= r; c++){
				if(c == r){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}	
			System.out.print("\n");
		}
	}
}