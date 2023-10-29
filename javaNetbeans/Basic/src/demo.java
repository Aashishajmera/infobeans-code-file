
interface I {

    private void m1() {
        System.out.println("I am m1");
    }

}

public class demo implements I {

    private void m1() {
        System.out.println("I am m1 of main class");
    }

    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = s1 + "world";
//
//        String s3 = "hello" + "world";
//        final String s4 = "hello";
//        String s = "";
//
//        System.out.println(s);
//        System.out.println(s1 == s4);
//        System.out.println(s2 == s3);
//
//        char i = 'a';
//        System.out.println(Character.isDigit(i));

        I i = new demo();
        I.i.m1();

    }
}
