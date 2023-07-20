// 14) WAP to print alphabets in uppercase

import java.util.Scanner;

public class Q14Uppercase2 {

    //create method:
    public void uppercase(char ch){
        for(; ch <= 90; ch++){
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        char ch = 65;

        Q14Uppercase2 obj = new Q14Uppercase2();
        obj.uppercase(ch);

    }
}
