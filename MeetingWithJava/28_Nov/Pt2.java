// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1

public class Pt2 {
    public static void main(String[] args) {
        int k = 0; 
        for(int r = 1; r <= 9; r++){
            k = (r <= 5) ? ++k : --k;
            for(int c = 1; c <= k; c++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }    
}
