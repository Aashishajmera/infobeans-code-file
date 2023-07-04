//5 wap to find and print even numbers in given array

class Q5EvenNum{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int i;
		System.out.println("Even number is: ");
		for(i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				System.out.println(arr[i]);
			}
		}
	}
}