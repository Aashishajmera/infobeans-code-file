package revesion;

public class InstanceStatic {

    int a = 10;

    public static void m1(InstanceStatic is) {
        System.out.println("This is m1 of main class " + is.a);
    }

    public static void main(String[] args) {
        InstanceStatic is = new InstanceStatic();

        is.m1(is);
    }
}
