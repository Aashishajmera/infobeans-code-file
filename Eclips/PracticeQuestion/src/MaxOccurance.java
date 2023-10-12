import java.util.Scanner;

public class MaxOccurance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String string = scanner.nextLine();
		
		String arr[] = string.split(" ");
		
		String s = null;
		int count = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				count++;
			}
			if(count > max) {
				max = count;
				 s = arr[i];
			}
		}
		System.out.println(s);
	}
}
