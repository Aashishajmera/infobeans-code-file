package FINAL_JS_REVESION.JAVA.Patternnn;

public class Pt3 {
    public static void main(String[] args) {
        int k = 1 , print = 1;
        for(int row = 1; row <= 6; row++){
            for(int space = 1; space <= (3-k); space++){
                System.out.print(" ");
            }
            if(row % 2 != 0 && row != 1){
                print += 2;
            }else if(row % 2 == 0){
                k++;
            }
            for(int value = 1; value <= print; value++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
