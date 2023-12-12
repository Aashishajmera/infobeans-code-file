public class MainMethodExample {
    public static void main(String[] args) {
        System.out.println("Inside the main method");
        anotherMethod();
    }

    public static void anotherMethod() {
        System.out.println("Inside another method");

        // Calling the main method explicitly
        main(new String[]{"arg1", "arg2"});
    }

    public static void main(String arg) {
        System.out.println("Inside the overloaded main method");
    }
}