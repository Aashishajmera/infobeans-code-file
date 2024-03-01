package Practice.array;

public class RemoveDuplicate {

    public static void removeEle(int arr[]){
        int arr2[] = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i == j){
                    arr2[index++] = arr[i];
                }
            }
        }

        System.out.println("Updated array: ");
        for(int i = 0; i < index; i++){
            System.out.print(arr2[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,2,3,5,6,9};
        removeEle(arr);
    }
}
