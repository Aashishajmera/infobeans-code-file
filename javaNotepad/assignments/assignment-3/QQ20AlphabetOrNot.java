// 20. W.A.P to check whether a charachter is an alphabet or not.


import java.util.Scanner;

public class QQ20AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet: (a to z)");
        char alphabet = sc.next().charAt(0);

        if((alphabet >= 65 && alphabet <= 90 )||(alphabet >= 97 && alphabet <= 122)){
            System.out.println(alphabet +" is alphabet: ");
        }else{
            System.out.println(alphabet +" is not alphabet: ");
        }
    }
}