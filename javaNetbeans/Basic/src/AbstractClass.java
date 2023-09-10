
abstract class Outer {

    abstract public void m1();

    // local inner class: 
    class Inner {

        void m1() {
            System.out.println("i am m1 of inner class: ");
        }
    }

    public void m2() {
        // create object of inner class: 
        Inner objI = new Inner();
        objI.m1();
    }

}

public class AbstractClass extends Outer {
    
    public static void main(String[] args) {
        // create object of Outer class
        Outer objO = new AbstractClass();
        objO.m2();
        objO.m1();
    }

    @Override
    public void m1() {
        System.out.println("I am m1 but main method: ");
    }
}
