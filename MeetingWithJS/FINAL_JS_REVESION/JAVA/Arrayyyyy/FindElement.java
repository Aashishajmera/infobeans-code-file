package FINAL_JS_REVESION.JAVA.Arrayyyyy;

public class FindElement {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,3,4,5};
        int n = 4;
        boolean flag = false;
        for(int i: arr){
            if(i == n){
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.println("find: "+n);
        }else{
            System.out.println("Not find"+n);
        }
    }
}
