import java.util.Scanner;
class Practice{
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
		
		int arr[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{3,3,3,1}};
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
		}
	}
}