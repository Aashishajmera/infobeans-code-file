import java.util.Scanner;

class UpperCase {
    char arr[];

    // default constructor:
    public UpperCase() {

    }

    // create constructor:
    public UpperCase(char arr[]) {
        this.arr = arr;
    }

    // convert array
    public char[] toUpperCase() {
        char arr2[] = new char[arr.length];
        char value = 97;
        // default array is:
        System.out.println("Default array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");;;;
        }
        System.out.println();

        // uppercase array is: first logic with 2 array:
        System.out.println("Uppercase array element is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= value && arr[i] <= 122) {
                arr2[i] = (char) (arr[i] - 32);
            } else {
                arr2[i] = arr[i];
            }
        }
        return arr2;

        // uppercase array is: second logic with 1 array:
        // System.out.println("Uppercase array element is: ");
        // for(int i = 0; i < arr.length; i++){
        // if(arr[i] >= value && arr[i] <= 122){
        // arr[i] = (char)(arr[i]-32);
        // }
        // }
        // for(int i = 0; i < arr.length; i++){
        // System.out.print(arr[i]+" ");
        // }
    }
}

class M2UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String st = sc.nextLine();

        // convert character type array:
        char arr[] = st.toCharArray();

        // create object:
        UpperCase obj = new UpperCase(arr);
        char arr2[] = obj.toUpperCase();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}