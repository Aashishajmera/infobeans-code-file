class Local{
    void m1(){
        System.out.println("I am m1 of local class: ");
    }
	void m2(){
		
	}
}

public class FirstInner {
    public static void main(String[] args) {
        int k = 11;
        // create a anonymous class
        Local objL = new Local(){
            void m2(){
                System.out.println("Hii i am m2 ");
            }
            void m1(){
                System.out.println("I am overload m1");
                // m2();
            }
        };
        objL.m1();
        objL.m2();
        // objL.m1(22);
    }
}
