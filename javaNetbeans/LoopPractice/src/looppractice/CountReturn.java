//9
//0 1
//2 3 4
//5 6 7 8
//9 0 1 2 3
package looppractice;

public class CountReturn {

    public static void main(String[] args) {
        int n = 9;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(n);
                if(n == 9){
                    n = -1;
                }
                n++;
            }
            System.out.println();
        }
    }
}
