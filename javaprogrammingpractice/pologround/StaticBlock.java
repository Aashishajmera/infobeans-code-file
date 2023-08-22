class Test {
    static {
        System.out.println("test class static block: ");
    }
}

class StaticBlock {
    public static void main(String[] args) {
        // create object of test class:
        Test objt = new Test();
    }

    static {
        System.out.println("Static block of static main class: ");
    }

}