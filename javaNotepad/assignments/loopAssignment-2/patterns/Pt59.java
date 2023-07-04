/* 59)
A
A B 
A B C 
A B C D 
A B C D E  */

class Pt59{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			char z = 65;
			for(int c = 1; c <= r; c++){
				System.out.print(z+" ");
				z++;
			}
			System.out.println();
		}
	}
}