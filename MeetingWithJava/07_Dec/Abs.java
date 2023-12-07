class A{
    int number;

    // public A(){
    //     System.out.println("default constructor of class A");
    // }

    public A(int number){
        this.number = number;
        System.out.println("perameterized constructor called....");
    }
}

class B  extends A{

    // public B(){
    //     System.out.println("default constructor of class B");
    // }

    public B(int number){
        super(number);
    }

}



public class Abs extends B {
    public static void main(String[] args) {
        
        // OBJECT OF B CLASS
        B objb = new B(22);


        // PCHC
        // Abs obja = new B(23);
    }
}
