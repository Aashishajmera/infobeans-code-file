class Q1Pattern {
	public static void main(String[] args) {
		// for(int i = 4; i >= 1; i--){
		// for(int j = 1; j <= 9; j++){
		// if( )
		// }
		// }

		// for (int r = 1; r <= 4; r++) {
		// char a = 'A';
		// for (int c = 1; c <= 8; c++) {
		// if (c >= (6 - r) && c <= (3 + r) && r > 1) {
		// System.out.print(" ");
		// } else {
		// System.out.print(a);
		// a++;
		// }
		// }
		// System.out.println();
		// }


		// for (int i = 4; i >= 1; i--) {
		// char a = 'A';
		// for (int j = 1; j <= i; j++) {
		// System.out.print(a);
		// a++;
		// }
		// for(int j = 1; j <= )
		// a--;
		// for(int j = 1; j <= i; j++){
		// System.out.print(a);
		// a--;
		// }
		// System.out.println();
		// }

		// only two loop 
		for (int i = 4; i >= 1; i--) {
			char a = 'A';
			for (int j = 1; j <= 8; j++) {
				if (j <= i) {
					System.out.print(a);
					a++;
				} else if (i < 4 && j >= (i + 	1) && j <= (8 - i)) {
					System.out.print(" ");
				} else {
					a--;
					System.out.print(a);
				}
			}

			System.out.println();
		}

	}
}