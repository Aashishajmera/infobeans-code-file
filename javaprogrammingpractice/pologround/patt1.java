import java.util.Scanner;

class patt1 {

  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 5; j++) {
        // if (6 - i >= j && i <= 5) {
        //   System.out.println("*");
        // }
        // if (i >= 6 && i - (i - 2) >= j) {
        //   System.out.println("*");
        // } else {
        //   System.out.print(" ");
        // }

        //     if(i <= 4 && 6-i <= j){
        //         System.out.print("*");
        //     }if(i >= 6 && (i-4) <= j){
        //         System.out.print("*");
        //     }else{
        //         System.out.println(" ");
        //     }
        //   }
        //   System.out.println();

        if (i <= 4 && (5 - i) >= j) {
          System.out.print(" ");
        } else if (i >= 6 && (i - 5) >= j) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
