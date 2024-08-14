public class Injava {

  public static void main(String[] args) {
    String s = "abc123jkl344xyz988";
    String word = "";
    int k = 0;

    for (int i = 0; i < s.length()-1; i++) {
      if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
        word += s.charAt(i);
        k = i + 1;
      }
      if (s.charAt(k) <= 48 && s.charAt(k) >= 57) {
        word += " ";
        System.out.println('j');
      }else if(s.charAt(k) >= 48 && s.charAt(k) <= 57){
          word += s.charAt(k);
      }
    }
    System.out.println(word);
  }
}
