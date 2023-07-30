
// ===6. Delete the element froam an array 
import java.util.Scanner;

class DeleteElement {

	// input element:
	public void inputElement(Scanner sc, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	// print element:
	public void printElement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void deleteElement(int delete, int arr[], int arr2[], int size, int size2) {
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == delete){
				size2--;
				break;
			}
		}
		
		// for(int i = 0; i < arr.length; i++){
			// if(arr[size-1] == delete){
				// size++;
			// }
		// }
		
		
		for (int i = 0, j = 0; i < size; i++) {
			
			//first logic
			
			if (delete == arr[i]) {
				arr2[i] = arr[i + 1];
				j++;
			} else if (delete != arr[i] && j == 0) {
				arr2[i] = arr[i];
			}
			else {
				arr2[i] = arr[i + 1];
			}
			
			
			
			
			/* // second logic
			if(delete == arr[i]){
				for(int j = i+1; j < arr.length; j++){
					arr2[j-1] = arr[j];
				}
				size2--;
				i--;
				break;
			} */
		}

		// print array:
		for (int i = 0; i < size2; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}

class Q6DeleteElement2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input array element:
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int size2 = size;
		int arr[] = new int[size];
		int arr2[] = new int[size2];
		System.out.println("Enter " + size + " element: ");
		// create object:
		DeleteElement obj = new DeleteElement();
		// call input element:
		obj.inputElement(sc, arr);
		// call print element:
		System.out.println("Input array is: ");
		obj.printElement(arr);
		// input delete element:
		System.out.println("Enter delete element: ");
		int delete = sc.nextInt();
		// calling delete method:
		obj.deleteElement(delete, arr, arr2, size, size2);

	}
}