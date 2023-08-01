// ===11. Remove the duplicate element

import java.util.Scanner;

class Remove {
    int size;
    int arr[], arr2[], n;

    // input array element:
    public void input(Scanner sc) {
        int arr[] = new int[50];
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
		this.n = size;
		int arr2[] = new int[n];
		this.arr2 = arr2;
        this.arr = arr;
        this.size = size;
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // print array element:
    
    public void output() {
        System.out.println("default array element is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
		System.out.println();
    }

    // remove duplicate element:
    public void duplicateElement(int delete) {
		int k = 0;
        for(int i = 0; i < size; i++){
            if(delete != arr[i]){
				arr2[k] = arr[i];
				k++;
			}
			if(delete == arr[i]){
				n--;
			}
        }
		for(int i = 0; i < n; i++){
			System.out.print(arr2[i]+" ");
		}
    }
}

class DeleteEleReal2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remove obj = new Remove();
        obj.input(sc);
		obj.output();
		System.out.println("Enter delete element: ");
		int delete = sc.nextInt();
		obj.duplicateElement(delete);

    }
}