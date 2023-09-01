import java.util.Scanner;

class PracticeArr{
	public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = new Scanner(System.in).nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Default array element is: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}