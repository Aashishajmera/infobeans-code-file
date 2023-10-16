package LoopUpdate;

public class Pattern1 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			int count = i, rev = 5;
//			for (int j = 1; j <= 9; j++) {
//				if (j >= (i) && j <= (10 - i)) {
//					if (j <= 5) {
//						System.out.print(count);
//					} else {
//						rev--;
//						System.out.print(rev);
//					}
//					count++;
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

//		for(int i = 1; i <= 5; i++) {
//			int k = 0;
//			for(int j = 1; j <= 9; j++) {
//				k = (j <= 5 ? ++k : --k);
//				if(j >= (i) && j <= (10-i)) {
//					System.out.print(k);
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		System.out.println("j9999");
		for (int i = 1; i <= 5; i++) {
			int k = 0;
			for (int j = 1; j <= (10 - i); j++) {
				k = (j <= 5 ? ++k : --k);
				if (j >= i) {
					System.out.print(k);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
