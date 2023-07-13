class Q1ShortArray{
	public static void main(String[] args){
		int arr[][] = {{6,8,0},{5,7,3},{3,7,6}};
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c <arr[r].length; c++){
				for(int j = c+1; j < arr[r].length; j++){
					if(arr[r][c] > arr[r][j]){
						arr[r][c] = arr[r][c]+arr[r][j];
						arr[r][j] = arr[r][c]-arr[r][j];
						arr[r][c] = arr[r][c]-arr[r][j];
						
					}
					
				}System.out.print(arr[r][c]+" ");
				
			}System.out.println();
		}
	}
}