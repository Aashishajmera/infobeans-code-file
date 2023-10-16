package LoopUpdate;

public class Pascals {
	public static void main(String[] args) {
		boolean flag = true;
		int mul = 1, temp, lastDigit;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j >= (6-i) && j <= (4+i)) {
					if(flag) {
						System.out.print("1");
						flag = false;
					}else {
						mul *= 11;
						temp = mul;
						while(temp != 0) {
							lastDigit = temp % 10;
							System.out.print(lastDigit+" ");
							temp /= 10;
						}
					
					}
//				System.out.println();
				}else {
					System.out.println();
				}
			}
		}
	}
}
