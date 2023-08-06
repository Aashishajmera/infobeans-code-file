// 12) Input data exactly in the following format, and print sum of all integer values.
// 	Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)

class Q12Main {
    public static void main(String[] args) {
        String s1[] = { "23", "33", "66", "788" };
        // convert to integer method:
        int sum = 0;
        for (int i = 0; i < s1.length; i++) {
            int num = Integer.parseInt(s1[i]);
            sum += num;

        }
        System.out.println("total number sum is: " + sum);

    }

}