import java.util.Scanner;
 
class DeleteElementReal{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("default arrray element is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // input delete element: 
        System.out.println("Enter delete element: ");
        int delete = sc.nextInt();

        for(int i = 0; i< size; i++){
            if(delete == arr[i]){
                for(int j = i+1; j < size; j++){
                    arr[j-1] = arr[j];
                }
                size--;
                i--;
                break;
            }
        }

        // print array 
        for(int i = 0; i< size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}