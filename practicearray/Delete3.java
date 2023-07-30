import java.util.Scanner;

class Delete {
    int delete, size, size2, arr[] = new int[size], arr2[] = new int[size2];

    // input method
    public void input(Scanner sc) {
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr2[] = new int[size];
        this.arr = arr;
        this.arr2 = arr2;
        this.size = size;
        this.size2 = size;

        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("default array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // delete element:
    public void delete(Scanner sc) {
        System.out.println("Enter delete element: ");
        int delete = sc.nextInt();
        this.delete = delete;
    }

    // display method:
    public void display() {
        // check delete element:
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == delete)
            size2--;
            break;
        }

        for (int i = 0, j = 0; i <= size; i++) {
            if (arr[i] == delete) {
                arr2[i] = arr[i + 1];
                j++;
            } else if (arr[i] != delete && j == 0) {
                arr2[i] = arr[i];
            }
            else if(i != (size-1) && size == size2){
                arr2[i] = arr[i+1];
            } 
        }

        // for (int i = 0; i < arr.length; i++) {

        // if (arr[i] == this.delete) {

        // arr2[i] = arr[i + 1];
        // this.size2--;
        // i++;
        // }
        // else{
        // arr2[i]=arr[i];
        // }
        // }

        for (int i = 0; i < size2; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}

class Delete3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Delete obj = new Delete();
        obj.input(sc);
        obj.delete(sc);
        obj.display();
    }
}