package JAVA.OOPS;
class Inner{
    public void m1(){
        System.out.println("I am inner m1");
    }
}

public class AnonymousInner {


    public void m1(){
        System.out.println("I am outer m1");
    }


    public static void main(String[] args) {

        // Inner class object
        // AnonymousInner.Inner obj = new AnonymousInner().new Inner();
        // obj.m1();

        Inner obj = new Inner(){
            
        };
        obj.m1();


        // Outer class object
        AnonymousInner obj2 = new AnonymousInner();
        obj2.m1();
    }
}
