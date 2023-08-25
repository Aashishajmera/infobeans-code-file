interface Local3{
    void m1();
}

class LamdaExp3{
	public static void main(String[] args) {
        Local3 obj = () -> {
            System.out.println("main class m1 method: ");
        };
        obj.m1(); 
    }
}