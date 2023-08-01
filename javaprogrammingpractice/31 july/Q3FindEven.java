import java.util.Scanner;

// class FindEven {
//     int arr[] = new int[50], size;

//     // input method:
//     public void input(Scanner sc) {
//         System.out.println("Enter size of array: ");
//         int size = sc.nextInt();
//         this.arr = new int[size];
//         System.out.println("Enter "+size +" element: ");
//         for(int i = 0; i < size; i++){
//             arr[i] = sc.nextInt();
//         }
//     }

    
//     public void FindEven() {
//         for(int i = 0; i <= size; i++){
//             if(arr[i] % 2 == 0){
//                 System.out.println("Even number is: ");
//                 break;
//             }
//             if(arr[i] % 2 == 0){
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }


// }

class Q3FindEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }




        // FindEven obj =  new FindEven();
        // obj.input(sc);
        // obj.FindEven();
    }
}