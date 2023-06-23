// 7 wap to search a particular number in given array and print its position

class Q7Position{
	public static void main(String[] args){
		int arr[] = {2,3,4,5,4,4,3,77};
		int index = -1;
		int i;
		for(i = 0; i < arr.length; i++){
			if(4==arr[i]){
				index = i;
				System.out.println("index is: "+index);
				break;
			}
		}
		
	}
}