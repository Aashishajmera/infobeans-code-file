import java.util.Scanner;

class Search{
    int arr[];
    int search;

    // create method:
    public void input(Scanner sc){
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        // create array: 
        int arr[] = new int[size];
        this.arr = arr;
        System.out.println("Enter " +size +" element: ");
        
        // input array element:
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    // searching method: 
    public void search(Scanner sc){
        System.out.println("Enter search element: ");
        int search = sc.nextInt();
        this.search = search;
    }
	
	// print array method: 
	public void output(){
		System.out.println("array element is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

    public void searchOutput(){
        int f = 0;
		for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println("found: ");
                f++;
                break;
            }
        }
        if(f == 0){
            System.out.println("not found");
        }
	}
}

class LinearSer1{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create object:
        Search obj = new Search();
        obj.input(sc);
        obj.search(sc);
		obj.output();
        obj.searchOutput();
    }
}