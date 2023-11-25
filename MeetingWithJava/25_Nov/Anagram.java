/*

s1 = "abc"
s2 = "abc"

s1 = "abc"
s2 = "bac"

s1 = "aab"
s2 = "bba"

s1 = "abca"
s2 = "bca"

*/

public class Anagram {

  public static void main(String[] args) {
    String s11 = "abca";
    String s22 = "bAca";

    // convert into lowerCase
    String s1 = s11.toLowerCase();
    String s2 = s22.toLowerCase();

    /*
        abca ==> a 
        a == a
        t = 0
        et = 0 1 2 3 4
        s1.length() = 4
        count1 = 1 2
        count2 = 
    */
    int count1 = 0;
    int count2 = 0;
    if (s1.length() == s2.length()) {
      for (int t = 0; t < s1.length(); t++) {
        count1 = 0;
        count2 = 0;
        for (int et = 0; et < s1.length(); et++) {
          if (s1.charAt(t) == s1.charAt(et)) {
            count1++;
          }
        }

        for (int set = 0; set < s2.length(); set++) {
          if (s1.charAt(t) == s2.charAt(set)) {
            count2++;
          }
        }

        if (count1 != count2) {
          break;
        }
      }

      if (count1 != count2) {
        System.out.println("Not anagram");
      } else {
        System.out.println("Anagram");
      }
    } else {
      System.out.println("Not anagram:");
    }
  }
}
