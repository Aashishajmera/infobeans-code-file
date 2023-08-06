import java.util.Scanner;

class CheckVowel {
    public void checkVowel(String s1){
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'a' ||s1.charAt(i) == 'e'||s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u'||
            s1.charAt(i) == 'A'||s1.charAt(i) == 'E'||s1.charAt(i) == 'I'||s1.charAt(i) == 'O'||s1.charAt(i) == 'U'){
                count++;
            }
        }
        System.out.println("Vowel is: " +count);
    }
}

class Q11Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        // create object:
        CheckVowel obj = new CheckVowel();
        obj.checkVowel(name);
    }
}