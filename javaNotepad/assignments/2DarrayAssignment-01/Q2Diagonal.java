/* 
10 20 30
40 50 60
70 80 90

i) 10 50 90

*/

class Q2Diagonal{
	public static void main(String[] args){
		int arr[][] = {{10,20,30}, {40,50,60},{70,80,90}};
		System.out.print("Diagonal matrix is: ");
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[r].length; c++){
				if(r == c){
					System.out.print(arr[r][c]+" ");
				}
			}
		}
	}
} 