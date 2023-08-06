// 13)WAP check if two Strings are anagrams of each other?
// (Hint Anagram words: LISTEN - SILENT 
// 				  TRIANGLE - INTEGRAL)

class Q13Main {
    public static void main(String[] args) {
        String s1 = "AASHISH";
        String s2 = "SHIAASH";
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if (count == s1.length()) {
            System.out.println("Anagrame String");
        }else{
            System.out.println("not Anagrame String");
        }
    }
}