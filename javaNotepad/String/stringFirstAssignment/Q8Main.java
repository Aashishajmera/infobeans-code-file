/* 8) WAP to find out total occurrence of each letter in string.
	 Sample Input: “aabbccddd”
	 Output:   a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times */

import java.util.Scanner;

class Q8Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			int count = 1, value = 0;
			for (int a = i-1; a >= 0; a--) {
				if (arr[i] == arr[a]) {
					value++;
					// break;
				}
			}
			if (value == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println(arr[i] + " count is: " + count);
			}
		}
	}
}