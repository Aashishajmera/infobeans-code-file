import java.util.Scanner;

class M5IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strign value: ");
        String s = sc.nextLine();

        // convert string to character array:
        char arr[] = s.toCharArray();
        System.out.println("Enter value:");
        char  value = sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println(value + " index is: "+i);
                break;
            }
        }
    }
}