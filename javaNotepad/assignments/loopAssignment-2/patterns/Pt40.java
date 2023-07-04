// 40)
// * 
// ** 
// **** 
// ******* 
// *********** 

class Pt40{
	public static void main(String[] args){
		int k = 1, n = 0;
		for(int r = 1; r <= 5; r++){
			k += k+n;
			n++;
			for(int c = 1; c <= (k-n); c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}