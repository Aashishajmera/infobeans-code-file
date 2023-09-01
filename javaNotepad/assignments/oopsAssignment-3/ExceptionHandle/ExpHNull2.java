public class ExpHNull2 {

  public static void main(String[] args) {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (Exception e) {
      if (e.getClass().getName().contains("NullPointerException")) {
        // System.out.println("This is null pointer exception: ");
        e.printStackTrace();
      }
    }
  }
}
