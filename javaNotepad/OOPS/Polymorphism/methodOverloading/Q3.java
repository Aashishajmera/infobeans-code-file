class Test{
    public void m1(int x){
        System.out.println("Integer version...");
    }
    public void m1(byte x){
        System.out.println("Byte version...");
    }
    public void m1(short x){
        System.out.println("Short version...");
    }
    public void m1(long x){
        System.out.println("Long version....");
    }
}
class Q3{
    public static void main(String args[]){
        Test obj = new Test();
        byte a = 1;
        obj.m1(a);
    }
}