// A B C D E D C B A
//   B C D E D C B
//     C D E D C
//       D E D
//         E

public class Pt1 {
    public static void main(String[] args) {
        int k = 10;
        char a = 64;
        for(int r = 1; r <= 5; r++){
            for(int s= 1; s < r; s++){
                System.out.print("  ");
            }
            for(int c = 1; c < k; c++){
                a = (c <= (6-r)) ? ++a : --a;
                System.out.print(a+" ");
            }
            System.out.println();
            k -= 2;
        }
    }
}
