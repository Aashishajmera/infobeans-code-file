import java.util.Scanner;

class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String s1 = sc.nextLine();

        String arr[] = s1.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String s2 = "";
            char r =' ';
            for(int j = 0; j < arr[i].length(); j++){
                 r = arr[i].charAt(j);
                s2 = r + s2;
            }
            System.out.println(s2);
        }
    }
}

// for (int i = 0; i < arr.length; i++) {
// 			String value = " ";
// 			for (int j = 0; j < arr[i].length(); j++) {
// 				char r = arr[i].charAt(j);
// 				value = r + value;
// 			}
// 			System.out.print(" " + value);
// 		}