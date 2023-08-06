// 10) WAP to count the word whose first letter is  vowel.

import java.util.Scanner;

class CheckVowelN {
    public void checkVowelN(String x[]) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length(); j++) {
                if ((char) x[i].charAt(0) == 'a' || (char) x[i].charAt(0) == 'e' || (char) x[i].charAt(0) == 'i'
                        || (char) x[i].charAt(0) == 'o' || (char) x[i].charAt(0) == 'u' || (char) x[i].charAt(0) == 'A'
                        || (char) x[i].charAt(0) == 'E' || (char) x[i].charAt(0) == 'I' || (char) x[i].charAt(0) == 'O'
                        || (char) x[i].charAt(0) == 'U') {
                    count++;
                    break;
                }
            }
        }
        System.out.println("name word : " + count);

    }
}

class Q10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and friend name: ");
        String name = sc.nextLine();

        String x[] = name.split(" ");
        // create object:
        CheckVowelN obj = new CheckVowelN();
        obj.checkVowelN(x);
    }
}