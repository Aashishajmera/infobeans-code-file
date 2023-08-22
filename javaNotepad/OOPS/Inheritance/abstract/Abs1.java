abstract class Abclass1 {
    public void m1() {
        System.out.println("only m1");
    }

    abstract public void m2();
}

class Abs1 extends Abclass1 {
    public void m1(){
        System.out.println("m1 - main class");
    }
    public void m2() {
        System.out.println("m2 - main class");
    }

    public static void main(String[] args) {
        // create a object of abstract class:
        Abs1 obj1 = new Abs1();
        obj1.m1();
        obj1.m2();
    }
}