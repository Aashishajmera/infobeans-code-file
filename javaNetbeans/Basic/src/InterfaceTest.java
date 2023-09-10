interface I{
    void m1();

    default void m2(){
        
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        
//        with the help of lamda expression
        I objI = ()->{
            System.out.println("I am override m1");
        };
        objI.m1();

// with the help of anonymous inner class: 
    I objI2 = new I(){
        @Override
        public void m1(){
            System.out.println("I am override m1 of interface: ");
        }
        public void m2(){
            System.out.println("I am m2 ");
        }
    };objI2.m1();
    objI2.m2();
    }
}
