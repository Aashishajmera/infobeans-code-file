// 11)
// A 
// AB 
// ABC 
// ABCD 
// ABCDE 

import java.util.Scanner;

public class Q11Pt {
    // create method:
    public void pt11(char ch) {
        if (ch <= 'Z' && ch >= 'A') {
            for (char i = 65; i <= ch; i++) {
                for (char j = 'A'; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word in uppercase: ");
        char ch = sc.next().charAt(0);

        // create object:
        Q11Pt obj = new Q11Pt();
        obj.pt11(ch);
    }
}
