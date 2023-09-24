package revesion;

class A {

    public void m1() {
        System.out.println("This is m1 of class A ");
    }
}


class B extends A {

    public void m1() {
        System.out.println("This is m1 of class B");
        this.m1();
    }
}

public class RevesionAnonyClass extends A {

//    public void m1(){
//        System.out.println("This is m1 of main calss");
//    }
    public static void main(String[] args) {
//        super.m1();

        B b = new B();
        b.m1();

//        A obj = new A(){
//            public void m1(){
//                System.out.println("This is override m1");
//            }
//        };
//        obj.m1();
    }
}
