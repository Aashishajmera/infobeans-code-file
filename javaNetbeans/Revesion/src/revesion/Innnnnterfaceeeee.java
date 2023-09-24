package revesion;

interface I1 {

    void m1();
}

interface I2 {

    void m1();
}

public class Innnnnterfaceeeee implements I1, I2 {

    public void m1() {
        System.out.println("This is m1 ");
    }

    public static void main(String[] args) {
        Innnnnterfaceeeee obji1 = new Innnnnterfaceeeee();

        obji1.m1();
    }
}
