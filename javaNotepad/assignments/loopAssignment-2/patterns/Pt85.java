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
			for (int c = 1; c <= 20; c++) {
				if(r == 1){
					System.out.print("_");
				}else if (r == 10){
					if(c == 1 || c == 20){
						System.out.print("|");
					}else{
						System.out.print("_");
					}
				}else if(r >= 2 && 9 >= r){
					if(c == 1 || c == 20){
						System.out.print("|");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}