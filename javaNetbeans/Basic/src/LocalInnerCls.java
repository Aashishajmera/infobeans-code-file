class Outer{
    public void m1(){
        class Inner{
            void show(){
                System.out.println("Gm...");
            }
        }
        // create object of inner class
        Inner objI = new Inner();
        objI.show();
    }
}

public class LocalInnerCls {
    public static void main(String[] args) {
        // create a object of outer class
        Outer objO = new Outer();
        objO.m1();
    }
}
