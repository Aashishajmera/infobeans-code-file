public class OuterCls {
    private int a = 10;
   static class Inner{
        public void m1(){
            OuterCls ob = new OuterCls();
            System.out.println("I am m1 of inner class "+ob.a);
        }
    }

    static class Inner2{
        public void m1(){
            OuterCls ob = new OuterCls();
            System.out.println("I am m1 of inner class "+ob.a);
        }
    }

    public static void main(String[] args) {
        System.out.println("I am main method of main class");
        OuterCls.Inner obj = new OuterCls.Inner();
        obj.m1();
        System.out.println(obj);
        OuterCls obj2;
        System.out.println(obj2);
    }
}