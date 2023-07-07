/* Q89)
    1 
    2 
    3 
    4 
123454321 
    4
	3 
	2 
	1  */
	
class Pt89{
	public static void main(String[] args){
		for(int r = 1; r <= 9; r++){
			for(int c = 1; c <= 9; c++){
				if(r <= 4 && c == 5){
					System.out.print(r);
				}else if(r == 5 && c <= 5){
					System.out.print(c);
				}else if( r == 5 && c >= 6){
					System.out.print((10-c));
				}else if(r >= 6 && c == 5){
					System.out.print((10-r));
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}