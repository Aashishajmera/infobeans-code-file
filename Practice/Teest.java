public class Teest {

  public static void main(String[] args) {
    // 1st program :
    // for(int i = 1; i <= 5; i++){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // 2nd program
    // for(int i = 1; i <= 3; i++){
    //     for(int j= 1; j <= 3; j++){
    //         if(j >= (4-i)){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }

    //3rd program:
    // for(int i = 1; i <= 5; i++){
    //     for(int j = 1; j <= 5; j++){
    //         if(i == 5 || j == 1){
    //             System.out.print("*");
    //         }
    //         else
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }

    // 4th program
    // for(int i= 1; i <= 5; i++){
    //     for(int j = 1; j <= 5; j++){
    //         if(j >= (6-i))
    //         System.out.print("* ");
    //         else
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }

    // 4th program 2nd way:
    boolean flag = true;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 9; j++) {
        if (j <= (4 + i) && j >= (6 - i) && flag) {
          System.out.print("*");
          flag = false;
        } else {
          System.out.print(" ");
          flag = true;
        }
      }
      System.out.println();
    }
  }
}
