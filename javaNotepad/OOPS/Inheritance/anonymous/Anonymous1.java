 class A{
     public void m1(){
        System.out.println("Demo - m1 method: ");
     }
}

class Anonymous1{
	public static void main(String[] args) {
        A obj = new A() {
            // public void m1(){
            //     System.out.println("m1 - innner class: ");
            // }
        };
        obj.m1();
    }
}