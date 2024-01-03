// package 2024.January.2_jan;

public class Exception1 {

  public static int m1() {
    try {
        // int z = 88 / 0;
      //   System.out.println(100);
    //   return 100;
    } catch (Exception e) {
      //   System.out.println(200);
      // System.out.println(e);
      //   return 200;
    } finally {
      //   System.out.println(300);
      //   return 300;
    }
    // return 400;
  }

  public static void main(String[] args) {
    System.out.println(m1());
  }
}
