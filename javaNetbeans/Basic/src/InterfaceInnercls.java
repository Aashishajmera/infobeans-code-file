
interface I {

//    void m3();

    class A {

        void m1() {
            System.out.println("I am m1 of interface: ");
        }

        public void m3() {
            System.out.println("I am m3 of inner class: ");
        }
    }

    default void m2() {
        A objA = new A();
        objA.m1();
        objA.m3();
    }
}

public class InterfaceInnercls implements I {

    public static void main(String[] args) {
        I objI = new InterfaceInnercls();
        objI.m2();
    }

}
