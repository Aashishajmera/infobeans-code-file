// 15. program to check whether entered character is in uppercase

public class Q15CheckUpperCase {
    public static void main(String[] args) {
        char ch = 'a';
        if(ch >= 65 && ch <= 90){
            System.out.println("Uppercase: ");
        }else{
            System.out.println("Lowercase: ");
        }
    }
}
