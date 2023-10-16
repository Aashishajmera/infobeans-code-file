//EDCBA
//DCBA
//CBA
//BA
//A
package looppractice;

public class Alphabet2 {

    public static void main(String[] args) {
        int n = 0; 
        for(int i = 5; i >= 1; i--){
            char ch = (char)(69-n);
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
            n++;
        }
    }
}
