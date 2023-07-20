public class Q15Lowercase2 {
    public void lowercase(char ch) {
        for (; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        char ch = 'a';

        Q15Lowercase2 obj = new Q15Lowercase2();
        obj.lowercase(ch);
    }
}