// *			
// * * *				   
// * * * * *			
// * * * * * * *			    
// * * * * * * * * *             	     
// * * * * * * *		              
// * * * * *
// * * *
// *


public class P1{
    public static void main(String[] args) {
        int k = 0;
        for(int i = 1; i <= 9; i++){
            k = (i <= 5) ? k+2 : k-2;
            for(int j = 1; j < k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}