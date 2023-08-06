import java.util.Scanner;

class M7CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        char arr[] = name.toCharArray();
        
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                c = i;
                System.out.println(arr[i]);
            }
        }
        if (c == 0)
            System.out.println("-1");

    }
}