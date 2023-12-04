// I
// IN
// IND
// INDI
// INDIA
// INDIA
// INDI
// IND
// IN
// I


public class Pt3 {
    public static void main(String[] args) {
        char arr[] = {'I', 'N', 'D', 'I', 'A'};
        int k = -1; 
        for(int r = 1; r <= 10; r++){
            k = (r <= 5) ? ++k : (r == 6) ? k : --k;
            for(int c = 0; c <= k; c++){
                System.out.print(arr[c]);
            }
            System.out.println();
        }
    }
}
