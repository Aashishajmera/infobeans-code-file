package FINAL_JS_REVESION.JAVA.Patternnn;

public class Pt4 {
    public static void main(String[] args) {
        int n = 9, i = 2;
        for(int row = 1; row <= n; row++){
            if(row <= (n/2)+1){
                for(int col = 1; col <= row; col++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int col = 1; col <= (row-i); col++){
                    System.out.print("*");
                }
                i += 2;
                System.out.println();
            }
        }
    }
}
