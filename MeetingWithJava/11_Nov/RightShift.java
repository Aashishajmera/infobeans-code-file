public class RightShift {

  public static void main(String[] args) {
    int n = 83;

    System.out.println(n << 2); // n * 2 ^2

    // right shift is used for divide by it's power

    // left shift only signed but right shift both signed and unsigned

    // signed ==> >>  only two time
    // unsigned ==> >>> threee time but only right shift

    System.out.println(n >>> 4); // n / 2^4  => 83 / 16 == 5

    System.out.println(n >>> 2); // n / 2^2  => 83 / 4 == 20

    System.out.println(3 >> 1); // n / 2^1  => 3 / 2 ==  1
  }
}
