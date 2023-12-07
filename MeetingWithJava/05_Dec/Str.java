public class Str {

  public static void main(String[] args) {
    String s2 = new String("Infobeans");
    String s1 = "Infobeans";
    // s1 = "Info";
    String s3 = s1;
    System.out.println(s3);
    System.out.println(s1);
    System.out.println(s1.hashCode());
    System.out.println(s3.hashCode());

  }
}
