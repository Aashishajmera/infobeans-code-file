
package revesion;

public class RevesionMethodOverLoading {
    public static final void m1( double y, int... x){
        System.out.println("This is m1");
    }
    
    public static final void m1(byte x){
        System.out.println("This is m2");
    }
    
    public static void main(String[] args) {
        RevesionMethodOverLoading.m1(1.8,23,45,67,8);
        RevesionMethodOverLoading.m1(12);
        int x = 'a';
        char ch = 97;
        System.out.println(x);
        System.out.println(ch);
        
        
        
    }
}
