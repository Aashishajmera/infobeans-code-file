/* 57)
    *

   * *

  * * *

 * * * *

* * * * * */

class Pt57{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= (5-r); c++){
				System.out.print(" ");
			}
			for(int c = 1; c <= r; c++){
				System.out.print("* ");
			}
			System.out.println();
			System.out.println();
		}
	}
}