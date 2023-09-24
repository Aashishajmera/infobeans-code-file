package revesion;
class A{
    public static void m1(){
        System.out.println("This is m1 of class A");
    }
}
public class OverrideStatic extends A{
    public static void m1(){
        System.out.println("This is m1 of main class: ");
    }
    public static void main(String[] args) {
        A a = new OverrideStatic();
        a.m1();
        
//        OverrideStatic os = new OverrideStatic();
//        os.m1();;
        
    }
}
