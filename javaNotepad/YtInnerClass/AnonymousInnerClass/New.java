class Local {
    void m1() {
        System.out.println("I am m1 of local class");
    }
}

public class New {
    public static void main(String[] args) {
        int k = 11;

        // Create an anonymous class that extends Local and includes m2()
        Local objL = new Local() {
            void m2() {
                System.out.println("Hi, I am m2");
            }

            // @Override
            void m1() {
                System.out.println("I am overloaded m1");
            }
        };

        // Now you can access both m1() and m2() methods
        objL.m1();
        objL.m2();
    }
}
