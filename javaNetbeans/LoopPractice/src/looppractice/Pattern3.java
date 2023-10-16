//	  1
//      1 2
//    1 2 3
//  1 2 3 4
//1 2 3 4 5
package looppractice;

public class Pattern3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int c = 1; 
            for (int j = 1; j <= 5; j++) {
                if(j >= (6-i)){
                    System.out.print(c);
                    c++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
