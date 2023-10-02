
public class CommonDigit {

    public static void main(String[] args) {
        int arr1[] = {1, -1, 3, 4, 5};
        int arr2[] = {2, -1, 7,3, 8, 9};
        int arr3[] = {0, -1, 3};

        for (int i = 0; i < arr1.length; i++) {
            int j,temp = arr1[i];
            for (j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    temp = arr2[j];
                    break;
                }
            }
            for (int k = 0; k < arr3.length; k++) {
                if(temp == arr3[k]){
                    System.out.println(arr3[k]);
                    break;
                }
            }
        }
    }
}
