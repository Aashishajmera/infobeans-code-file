/* 85)
___________
|          |
|          |
|          |
|          |
|          |
|          |
|__________| */

class Pt85 {
	public static void main(String[] args) {
		for (int r = 1; r <= 10; r++) {
			for (int c = 1; c <= 10; c++) {
				if(r == 1 || r == 10 || c == 1 || c == 10 || c == r || c == (11-r)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}