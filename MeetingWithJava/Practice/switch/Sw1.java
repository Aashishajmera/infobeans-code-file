public class Sw1 {

  public static void main(String[] args) {
    byte b = 10;

    switch (b) {
      case 10:
        System.out.println("case match: ");
        break;
      default:
        System.out.println("case not match: ");
        break;
    }
  }
}
