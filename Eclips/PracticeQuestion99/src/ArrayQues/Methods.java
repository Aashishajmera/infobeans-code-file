package ArrayQues;

import java.util.Scanner;

public class Methods {
	public void takeInput(int arr[], Scanner scanner) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
	}
	public void displayArr(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
