package revesion;

class SignleTon {

    private static SignleTon ref = null;

    private SignleTon() {

    }

    public void m1(){
        System.out.println("This is m1 of class singleton");
    }
    
    public static synchronized SignleTon cons() {
        if (ref == null) {
            ref = new SignleTon();
        }
        return ref;
    }
    
}

public class SingleTonClasssss {

    public static void main(String[] args) {
//        SignleTon s = new SignleTon();
//        s.m1();
         SignleTon obj=  SignleTon.cons();
         obj.m1();
    }
}
