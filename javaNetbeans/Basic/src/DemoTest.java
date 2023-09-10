
abstract class I {

    abstract void m1();
}

class DemoTest {

    public static void main(String[] args) {
        int i = 1;
        for (; i <= 5; i++);
        System.out.println(i);
        
        System.out.println("------------------");
        if(1 == i)
            System.out.println("");
        System.out.println("else block: ");
    }
}

//interface Demo{
//    void m1();
//    default void m2(){
//        System.out.println("I am default m2");
//    }
//}
//
//class DemoTest{
//    public static void main(String[] args) {
//        Demo obj = ()->{
//            System.out.println("I am m1");
////            public void m2(){
////                System.out.println("I am m2 of lamda ex...");
////            }
//        };
//        obj.m1();
//        obj.m2();
//    }
//}
//class Outer {
//
//    public Outer() {
//        System.out.println("Outer");
//    }
//
//
//}
//
//class Outer2 extends Outer {
//
//    public Outer2(int x) {
////        super(20);
//        System.out.println("Outer2");
//    }
//}
//
//class Test extends Outer2{
//    
//    public Test(){
//        System.out.println("c...");
//    }
//}
//class DemoTest{
//    public static void main(String[] args) {
//        new Outer2(100);
//    }
//}
//class Outer {
//
//    void m2() {
//        System.out.println("M1");
//    }
//}
//
//class Outer2 extends Outer {
//
//    void m2() {
//        System.out.println("M2");
//    }
//}
//
//class DemoTest extends Outer2 {
//
//    public static void main(String[] args) {
//        Outer objA = new Outer2();
//        objA.m2();
//    }
//}
