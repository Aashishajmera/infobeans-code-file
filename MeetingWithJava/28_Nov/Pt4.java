// 123454321
//  2345432
//   34543
//    454
//     5

public class Pt4 {
    public static void main(String[] args) {
        // int k = 10, a = 0;
        // for(int r = 1; r <= 5; r++){
        //     for(int s = 1; s < r; s++){
        //         System.out.print(" ");
        //     }
        //     for(int c = 1; c < k; c++){
        //         a = (c <= (6-r)) ? ++a :--a;
        //         System.out.print(a);
        //     }
        //     System.out.println();d
        //     k-=2;
        // }

        int k = 0;
        for(int r = 1; r <= 5; r++){
            for(int c = 1; c <= 9; c++){
                if(c >= r && c <= (10-r)){
                    k = (c <= 5) ? ++k : --k;
                    System.out.print(k);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
