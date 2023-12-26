

public class CheckDefault implements InnerCheckDefault {
    

        public void m1(){

            System.out.println("hello m1 ");
        }

        public static void main(String[] args) {
            
            InnerCheckDefault ob1 = new CheckDefault();
            ob1.m1();

        }
}
/**
 * InnerCheckDefault
 */
 interface InnerCheckDefault {


//  we can not creat default final method 
default void m1(){

    System.out.println("hello default");
}

    
    
}
