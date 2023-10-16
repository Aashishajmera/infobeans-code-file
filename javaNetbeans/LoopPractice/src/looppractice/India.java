package looppractice;

public class India {

    public static void main(String[] args) {
//        char ch = 65;
//        int ch = 'a';
        char ch[] = {'I', 'N', 'D', 'I', 'A'};
        int count = 0;
        for (int i = 0; i < ch.length << 1; i++) {
            count = (i < 5 ? ++count : --count);
            for (int j = 0; j < count; j++) {
                System.out.print(ch[j]);    
            }
            System.out.println();
        }
    }
}
