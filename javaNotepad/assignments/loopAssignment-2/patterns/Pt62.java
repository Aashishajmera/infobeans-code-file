/* 62)
    1 
   123 
  12345 
 1234567 
123456789  */

class Pt62{
	public static void main(String[] args){
		int z = 1;
		for(int r = 5; r >= 1; r--){
			for(int c = 1; c <= (r-1); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= z; c++){
				System.out.print(c);
			}
			z+=2;
			System.out.println();
		}
	}
}