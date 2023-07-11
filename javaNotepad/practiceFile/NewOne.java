class NewOne{
	public static void main(String[] args){
		int k = 9, l = 12; 
		for(int r = 1; r <= 6; r++){
			for(int c = 1; c <= r; c++){
				if(r >= 2 && r <= 6){
					if(c%2 == 0 && c >= 2){
						System.out.print(r+k+" ");
						k-=2; l-=2;
					}else if(c % 2 != 0 && c >= 2){
						System.out.print(r+l +" ");
						k-=2; l-=2;
					}else{
						System.out.print(r+" ");
					}
				}else{
					System.out.print(r +" ");
				}
			}
			System.out.println();
		}
	}
}