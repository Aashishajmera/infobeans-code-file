// 9) WAP to find word of maximum length in given String.
// 	Sample Input: “Dear Student ,You have need to work hard”
// `	Output: “Student”

import java.util.Scanner;

class MaxLength {
    public String maxLength(String arr[]) {
        String max = arr[0];
        for (String value : arr) {
            if (max.length() < arr.length) {
                max = value;
            }
        }
        return max;
    }

    public String minLength(String arr[]) {
        String min = arr[0];
        for (String i : arr) {
            if (min.length() > arr.length) {
                min = i;
            }
        }
        return min;
    }
}

class Q9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and your friend name: ");
        String name = sc.nextLine();

        // use split method:
        String arr[] = name.split(" ");
        // create object:
        MaxLength obj = new MaxLength();

        // calling max value of index
        String max = obj.maxLength(arr);
        System.out.println("Max index of: " + max);

        // calling min value of index
        String min = obj.minLength(arr);
        System.out.println("min index of: " + min);
    }
}