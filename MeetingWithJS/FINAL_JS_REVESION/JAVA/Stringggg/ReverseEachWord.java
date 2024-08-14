package FINAL_JS_REVESION.JAVA.Stringggg;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Aashish Ajmera";
        String arr[] = s.split(" ");
        String newStr = "";
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length()-1; j >= 0; j--){
                newStr += arr[i].charAt(j);
            }
            newStr += " ";
        }
        System.out.print(newStr);
    }
}
