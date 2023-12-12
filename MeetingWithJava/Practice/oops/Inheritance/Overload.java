public class Overload {

  // m1 of 0 argument's
  public static void m1() {
    System.out.println("m1 default argument's: ");
    // m1();
  }

  public static void m1(int a, double b) {
    System.out.println("I am int double");
  }

  public static void m1(float a, int b) {
    System.out.println("I am float int");
  }

//   public static void m1(int a) {
//     System.out.println("I am int");
//   }

  public static int m1(int a) {
    System.out.println("I am int");
    // return 100;
  }

  public static void main(String[] args) {
    // m1();
    // m1(12, 12);

    // System.out.println("I am main method: ");
  }
}
