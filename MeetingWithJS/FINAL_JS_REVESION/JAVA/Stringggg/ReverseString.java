package FINAL_JS_REVESION.JAVA.Stringggg;

public class ReverseString {
    public static void main(String... args){
        String s = "Aashish Ajmera";
        String newStr = "";
        for(int i = s.length()-1; i >= 0; i--){
            newStr += s.charAt(i);
        }
        System.out.println(newStr);
    }
}
