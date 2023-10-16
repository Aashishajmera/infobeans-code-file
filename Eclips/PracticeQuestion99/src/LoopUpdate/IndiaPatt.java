package LoopUpdate;

public class IndiaPatt {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		char arr[] = { 'I', 'N', 'D', 'I', 'A' };
////		char arr[] = {65,66,67,68,69};
//		int n = 2;
//		for (int i = 1; i <= 9; i++) {
//			if (i <= 5) {
//				for (int j = 0; j < i; j++) {
//					System.out.print(arr[j]);
//				}
//			}else {
//				for (int j = 0; j < i-n; j++) {
//					System.out.print(arr[j]);
//				}
//				n+=2;
//			}
//			System.out.println();
//		}
		
		char arr[] = {'I','N','D','I','A'};
		int x = 0;
		for(int i = 0; i < arr.length << 1; i++) {
			x = (i < arr.length ? ++x : --x);
			for(int j = 0; j < x; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
	}
}
