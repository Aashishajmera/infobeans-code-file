//     1
//    21
//   321
//  4321
// 54321
public class Pt5 {
    public static void main(String[] args) {
        
        // for(int r = 1; r <= 5; r++){
        //     int k = r; 
        //     for(int c = 1; c <= 5; c++){
        //         if(c >= (6-r)){
        //             System.out.print(k);
        //             k--;
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        for(int r = 1; r <= 5; r++){
            for(int s = 1; s <= (5-r); s++){
                System.out.print(" ");
            }
            for(int c = r; c >= 1; c--){
                System.out.print(c);
            }
            System.out.println();
        }

        
    }
}
