import java.util.Scanner;
class Practice{
	
	// Create methods for find maximum element :
	void maxFind(){
		int[] arr = {0,-4,2,6,45,99,1};
		int max = arr[0];
		for(int r = 0; r < arr.length; r++){
			if(max < arr[r]){
				max = arr[r];
			}
		}
		System.out.println("The max value is : " +max);
	}
	
	// Create methods for find minimum element :
	void minFind(int size,Scanner sc){
		
		int[] arr1 = new int[size];
		System.out.println("Enter " +size +" element: ");
		for(int r = 0; r < arr1.length; r++){
			arr1[r] = sc.nextInt();
		}
		
		System.out.println("Print the value: ");
		for(int r = 0; r < arr1.length; r++){
			System.out.println(arr1[r]);
		}
		
		// find the value: 
		int min = arr1[0];
		for(int r = 0; r < arr1.length; r++){
			if(min > arr1[r]){
				min = arr1[r];
			}
		}
		System.out.println("minimum value is: " +min);
	}
	
	public static void main(String[] args){
		
		
		// ----------------------------------------------------------------------------------
		// Take a input for 1D array
		
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		// defined array 
		int arr[] = new int[size];
		// take input
		System.out.println("Enter " +size +" element: ");
		for(int r = 0; r < arr.length; r++){
			arr[r] = sc.nextInt();
		}
		// print array
		for(int r = 0; r < arr.length; r++){
			System.out.println(r +" index value is: " +arr[r]);
		} */
		
		
		// ----------------------------------------------------------------------------------
		// Take a input for 2D array 
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = sc.nextInt();
		System.out.println("Enter column: ");
		int column = sc.nextInt();
		
		int arr[][] = new int[row][column];
		
		System.out.println("Enter " +(row*column) +" element: ");
		// Take input
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[r].length; c++){
				arr[r][c] = sc.nextInt();
			}
		}
		//Print output
		System.out.println("Entered array is: ");
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[r].length; c++){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		} */
		
		
		// ----------------------------------------------------------------------------------
		// Class work on 2D array 
		/*
			1 1 1 1
			2 2 2 2
			3 3 3 3
			3 3 3 1
		*/
		
		/* int arr[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{3,3,3,1}};
		System.out.println("Given array is: ");
		
		//Print value 
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[r].length; c++){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		
		//sum element of each row and stor new array
		
		int arr2[] = new int[arr.length];
		for(int r = 0; r < arr.length; r++){
			int sum = 0;
			for(int c = 0; c < arr[r].length; c++){
				sum += arr[r][c];
			}
			arr2[r]=sum;
			System.out.print(r +" row element sum is: " +sum +"\n");
		}
		
		System.out.println("Element sum array is: ");
		for(int r = 0; r < arr2.length; r++){
			System.out.print(arr2[r]+" ");
		} */
		
		//----------------------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		Practice obj = new Practice();
		// obj.maxFind();
		obj.minFind(size,sc);
		
	}
}