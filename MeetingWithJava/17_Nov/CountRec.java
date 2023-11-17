import java.util.Scanner;

public class CountRec {

  public static int countInc(int n) {
    // int a = 1;
    // System.out.println(a);
    // if (n == (n - a)) a++;

    if (n < 1) {
      return n;
    } else {
      n -= 1;
      countInc(n);
      System.out.println(n);
    }

    // int sum = 0;
    // int a = 0;
    // int b = 1;

    // if(n > 0){
    //     sum = a+b;
    //     a = b;
    //     b = sum;
    //     countInc(n-1);
    //     System.out.println(n);
    // }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    countInc(n);
  }
}
