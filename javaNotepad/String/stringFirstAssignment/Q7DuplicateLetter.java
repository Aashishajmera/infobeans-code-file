// 7)WAP to remove the duplicate letters from given String.
// 	Sample Input: “aabbccddd”
// 	Output: “abcd”

import java.util.Scanner;

class Q7DuplicateLetter {
	public static void main(String[] args) {

		String s1 = "aabbccddd";
		// convert string to array:
		// char arr[] = s1.toCharArray();
		String s2 = " ";
		// for (int i = 0; i < arr.length; i++) {
		// boolean flag = false;

		// for (int j = i + 1; j < arr.length; j++) {
		// if (arr[i] == arr[j]) {
		// flag = true;
		// break;
		// }
		// }
		// if (flag == false) {
		// s2 = s2 + arr[i];
		// }
		// }
		// System.out.print(s2 + " ");

		for (int i = 0; i < s1.length(); i++) {
			boolean flag = false;

			for (int j = i + 1; i < s1.length(); i++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				s2 += s1.charAt(i);
			}
		}

		for (int i = 0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i));
		}

	}
}