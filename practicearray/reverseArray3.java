import java.util.Scanner;
class Reverse{

    int size;
    int arr1[] = new int[size];
    int arr2[] = new int[size];
    
    // default constructor: 
    public Reverse(){

    }

    // create constructor:
    public Reverse(int arr1[], int arr2[], int size){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.size = size;
    }

    // input method

    public void input(Scanner sc ){
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
    }

    // reverse 
    public void reverse(){
        for(int i = 0,j = 0; i < arr1.length; i++){
            arr2[size-1] = arr1[i];
            size--;
        }
        // print reverse array 
        System.out.println("Reverse array element is: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }

}
class reverseArray3{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        // create object:   
        Reverse obj = new Reverse(arr1, arr2, size);
        obj.input(sc);
        obj.reverse();
    }
}