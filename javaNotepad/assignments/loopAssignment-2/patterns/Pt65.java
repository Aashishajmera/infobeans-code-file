/* 65)
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 */

class Pt65 {
	public static void main(String[] args) {
		int sum = 1;
		int temp = 0;
		int lastDigit = 0;
		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= (5 - r); c++) {
				System.out.print(" ");
			}

			sum *= 11;
			temp = sum;

			if (r == 1) {
				sum = 1;
				System.out.print(r);
			}

			if (r >= 2 && r <= 5) {
				while (temp != 0) {
					lastDigit = temp % 10;
					System.out.print(lastDigit + " ");
					temp /= 10;
				}
			}

			System.out.println();
		}
	}
}