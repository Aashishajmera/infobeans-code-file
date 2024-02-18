public class FindNum {

  public static void main(String[] args) {
    String s1 = "Aas0hi23sh89";
    String s2 = "";

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) >= 48 && s1.charAt(i) <= 57) {
        s2 += s1.charAt(i);
      }
    }
    System.out.println(s2);
  }
}
