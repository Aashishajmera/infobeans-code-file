//4 wap to print max and minimum value in given array

class Q4MaxMin{
	public static void main(String[] args){
		int arr[] = {3,45,6,7,89,7};
		System.out.println("Array element is: ");
		int i, max = arr[0], min = arr[0];
		for(i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		for(i = 0; i < arr.length; i++){
			if(max < arr[i]){
			max = arr[i];
			}
		}
		System.out.println("Max element is: " +max);
		
		for(i = 0; i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("Min element is: " +min);
	}
}