// package FINAL_JS_REVESION.JAVA.Arrayyyyy;

public class CheckDuplicate {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'a', 'a', 'c'};
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    if(j < i){
                        count = 0;
                        break;
                    }else{
                        count++;
                    }
                }x
            }
            if(count > 1){
                System.out.print(count+""+arr[i]);
            }
        }
    }
}
