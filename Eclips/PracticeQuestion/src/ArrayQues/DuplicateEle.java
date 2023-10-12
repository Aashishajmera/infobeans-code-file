package ArrayQues;

public class DuplicateEle {
	public static void main(String[] args) {
		int arr[] = { 1, 23, 3, 5, 7, 5, 99, 3 };
		int size = arr.length;
		int arr2[] = new int[size];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			for (; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					size--;
					break;
				}
			}
			if(i == j) {
				size++;
				arr2[index] = arr[i];
				index++;
			}
		}
	
		for(int i = 0; i < size; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
