/* 5) Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”
	Output: “avaJ sI mrofetalP tnednepednI” */

import java.util.Scanner;

class Reverse {

	public void reverse(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			String value = " ";
			for (int j = 0; j < arr[i].length(); j++) {
				char r = arr[i].charAt(j);
				value = r + value;
			}
			System.out.print(" " + value);
		}
	}
}

class Q5Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String s1 = sc.nextLine();

		// split method:
		String arr[] = s1.split(" ");

		// create object:
		Reverse obj = new Reverse();

		obj.reverse(arr);

	}
}