import java.util.Scanner;
class Search{
    int arr[], size;
    
    // default constructo: 
    public Search(int arr[], int size){
        this.arr = arr;
        this.size = size;
    }

    // input array element: 
    public void input(Scanner sc){
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    // display default array: 
    public void output(){
        System.out.println("Default array element is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // search element: 
    public void Search(Scanner sc){
        int count = 0;
        System.out.println("Enter find element: ");
        int find = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == find){
                System.out.println("Find element "+ find +" and index is: "+i);
                count ++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Not found: ");
        }
    }
}
class Q5SearchNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        Search obj = new Search(arr, size);
        obj.input(sc);
        obj.output();
        obj.Search(sc);
    }
}