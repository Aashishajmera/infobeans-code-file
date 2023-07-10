/* 15)
A

BB

CCC

DDDD

EEEEE */

class Pt15{
	public static void main(String[] args){
		char r = 65;
		while(r <= 69){
			int c = 65;
			while(c <= r){
				System.out.print(r);
				c++;
			}
			r++;
			System.out.println();
		}
	}
}