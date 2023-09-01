import java.util.Scanner;

class pt1 {

  public static void main(String[] args) {
    System.out.println("Enter row: ");
    int row = new Scanner(System.in).nextInt();

    int col = row + (row - 1);

    // for (int i = 1; i <= row; i++) {
    //   for (int j = 1; j <= col; j++) {
    //     if ((row + 1) - i <= j && (row - 1) + i >= j) {
    //       if (i % 2 != 0 && j % 2 != 0) {
    //         System.out.print(i);
    //       } else if (i % 2 == 0 && j % 2 == 0) {
    //         System.out.print(i);
    //       } else {
    //         System.out.print(" ");
    //       }
    //     } else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }


// for(int i = 1; i <= row; i++){
//     for(int j = 1; j <= (row-i); j++){
//         System.out.print(" ");
//     }
//     for(int k = 1; k <= i; k++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }


for(int i = 1; i <= row; i++){
    int j = 1;
    for(; j <= (row-i); j++){
        System.out.print(" ");
    }
    int z = i + (i-1);
    for(int k = 1; k <= z; k++){
      if(k%2 != 0){
        System.out.print(i);
      }else{
        System.out.print(" ");
      }
    }
    System.out.println();
}



    // for (int i = 1; i <= row; i++) {
    //   for (int j = 1; j <= row; j++) {
    //     if (j >= (row + 1) - i) {
    //       System.out.print(i + " ");
    //     } else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }


  }
}
