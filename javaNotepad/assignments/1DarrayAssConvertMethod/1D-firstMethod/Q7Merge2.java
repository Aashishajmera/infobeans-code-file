// 7. Merge two array
import java.util.Scanner;
class Merge{
	public void merge(int arr1[] , int arr2[], int arr3[], int size){
		int k = 0;
		for(int i = 0 ; i < arr3.length; i++){
			if(i < size){
				arr3[i] = arr1[i];
			}else{
				arr3[i] = arr2[k];
				k++;
			}
		}
		System.out.println("Merge array is: ");
		for(int i = 0; i < arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
	}
}
class Q7Merge2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size: ");
		int size = sc.nextInt();
		// create first array: 
		int arr1[] = new int[size];
		//input first array element:
		System.out.println("Enter "+size +" element: ");
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		// second array:
		System.out.println("Enter second array size: ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		// input second array element:
		System.out.println("Enter "+size2 +" element: ");
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		//third array: 
		int arr3[] = new int[size+size2];
		
		// create object:
		Merge obj = new Merge();
		obj.merge(arr1,arr2,arr3,size);
	}
}