// 2. Write A Java Program to Find Out the smallest between 3 distinct number

public class Q2SmallNum {
    public static void main(String[] args) {
        byte num1 = 3;
        byte num2 = 8;
        byte num3 = 6;

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println(num1 + " is smallest: ");
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println(num2 + " is smallest: ");
        } else {
            System.out.println(num3 + " is smallest: ");
        }
    }
}
