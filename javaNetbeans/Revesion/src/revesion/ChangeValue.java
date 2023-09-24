package revesion;

class A {

    static int a = 10;

    public void m1() {
        System.out.println("This is m1 of class A " + (a + 2));
    }
}

public class ChangeValue {

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        A.a = 20;
        a.m1();

    }
}
