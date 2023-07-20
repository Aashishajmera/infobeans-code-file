// 7)
// 1 
// 00 
// 111 
// 0000 
// 11111

import java.util.Scanner;

public class Q7Pt {
    // create method:
    public void pt7(int row){
        for(int r = 1; r <= row; r++){
            for(int c = 1; c <= r; c++){
                if(r%2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        
        // create object:
        Q7Pt obj = new Q7Pt();
        new Q7Pt().pt7(row);

    }
}
