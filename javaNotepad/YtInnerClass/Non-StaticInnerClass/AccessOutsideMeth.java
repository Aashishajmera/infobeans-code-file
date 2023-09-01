class Outer{
    private int a = 10;

    void m1(){
        // create object of inner class: 
        Inner objIn = new Inner();
        System.out.println("I am m1 of outerClass: ");
        objIn.m2();
    }

    // inner class 
    class Inner{
        void m2(){
            // access m1 
            // m1();
            System.out.println("I am m2 of innerClass: ");
        }
    }
}

public class AccessOutsideMeth {
    public static void main(String[] args) {
        // create object of inner class 
        Outer.Inner objI = new Outer().new Inner();

        // create object of outer class: 
        Outer objO = new Outer();
        objO.m1();
        objI.m2();
    }
}
