//3 wap to define an array of integer and assign value in program and print sum of all values

class Q3SumValue{
	public static void main(String[] args){
		int arr[] = new int[4];
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		int i, sum = 0;
		for(i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println("Array element sum is: " +sum);
	}
}