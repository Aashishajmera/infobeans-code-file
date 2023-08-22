import java.util.Scanner;

class DuplicateElementStr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string value: ");
        String s1 = sc.nextLine();

        // convert to array:
        char arr[] = s1.toCharArray();
        int size = s1.length();
        // size =
        char arr2[] = new char[size];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (i == j) {
                        flag = true;
                        arr2[index] = arr[i];
                        index++;
                    }
                    if (i != 0 && flag == true) {
                        size--;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr2[i]);
        }

    }
}