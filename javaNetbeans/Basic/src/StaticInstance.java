
public class StaticInstance {

    int a = 10;

    public void m1() {
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }

    public void m2() {
        System.out.println(a);
    }

    public static void main(String[] args) {

        StaticInstance si = new StaticInstance();
        si.m2();
        si.m1();
    }
}
