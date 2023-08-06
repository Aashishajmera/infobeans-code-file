class SortingCheck{
	public static void main(String[] args) {
        int arr[] = {2,35, 35, 77};


        // 1st way for incresed by one
        boolean flag = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("yes array is sorted of incresing order: ");
        }else{
            System.out.println("NOt sorted: ");
        }


        //  boolean flag = true;
        // for(int i = 1, j = i-1; i < arr.length; i++,j++){
        //     if(arr[i] < arr[j]){
        //         flag = false;
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("yes array is sorted of incresing order: ");
        // }else{
        //     System.out.println("NOt sorted: ");
        // }
    }
}