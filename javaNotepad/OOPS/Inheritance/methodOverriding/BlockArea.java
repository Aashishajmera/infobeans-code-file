// CLASS - A ------------------------------
class A{

    //static block:
    static{
        System.out.println("Class A-static block: ");
    }

    // initial block: 
    {
        System.out.println("Class A-Initial block: ");
    }

    // default constructor: 
    public A(){
        System.out.println("Class A-Default constructor: ");
    }

    public A(int a){
        System.out.println("parameterized constructor: ");
    }


}

// CLASS - B -----------------------------
class B extends A{

    //static block:
    static{
        System.out.println("Class B-static block: ");
    }

    // initial block: 
    {
        System.out.println("Class B-Initial block: ");
    }

    // default constructor: 
    public B(){
        System.out.println("Class B-Default constructor: ");
    }
}

// MAIN-CLASS ------------------------------
class BlockArea{
	public static void main(String[] args) {
        
        // create object: 
        A obj = new B();
    }
}