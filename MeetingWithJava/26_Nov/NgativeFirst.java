public class NgativeFirst {
    public static void main(String[] args) {
        int arr[] = {2, -1, 3, -7, 5, -4, 7};

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j] < 0){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }    
}
