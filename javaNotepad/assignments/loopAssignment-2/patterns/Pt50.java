/* 50)
12345 
 1234
  123
   12 
    1  */
	
class Pt50{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}for(int c = 1; c <= (6-r); c++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}