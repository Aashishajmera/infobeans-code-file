class A {
    public void m1() {
        System.out.println("m1 - class A");
    }
}

class B extends A {
    public int m1() {
        int c = 4 + 5;
        System.out.println("m1 - class B");
        return c;
    }
}

class MethodOverriddingPractice {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
    }
}