package LoopUpdate;

public class Pattern2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int k = 0;
			for (int j = 1; j <= 9; j++) {
				if (i <= 5) {
					if (j >= (6 - i) && j <= (4 + i)) {
						k = (j <= 5 ? ++k : --k);
						System.out.print(k);
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= (i-4) && j <= (14-i)) {
						k = (j <= 5 ? ++k : --k);
						System.out.print(k);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
