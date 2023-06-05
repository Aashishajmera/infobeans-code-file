public class IncDecOperator {
    public static void main(String[] args) {

        byte num1 = 2;
        // post increment
        System.out.println(num1++);
        System.out.println(num1);

        byte num2 = 8;
        // pre increment
        System.out.println(++num2);
        System.out.println(num2);

        byte num3 = 9;
        // post decrement
        System.out.println(num3--);
        System.out.println(num3);

        byte num4 = 4;
        // pre decrement 
        System.out.println(--num4);
        System.out.println(num4);
    }
}