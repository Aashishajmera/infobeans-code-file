//    1    
//   1*3   
//  1***5  
// 1*****7 
//123456789

package LoopQues;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int count = 1;
			for (int j = 1; j <= 9; j++) {
				if (j >= (6 - i) && j <= (4 + i)) {
					if ((j == (6 - i) || j == (4 + i)) || i == 5) {
						System.out.print(count);
					} else {
						System.out.print("*");
					}
					count++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
