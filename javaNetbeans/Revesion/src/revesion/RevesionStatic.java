package revesion;
class A{
    static{
        System.out.println("Class A static block: ");
    }
}
class B{
    static{
        System.out.println("Class B static block: ");
    }
    B(){
        System.out.println("Constuctor of class B");
    }
    {
        System.out.println("Initializer block of class B");
    }
}
public class RevesionStatic {
    public static void main(String[] args) {
        System.out.println("Main method: ");
        
        //create a object of class B

        B b = new B();
    }
    
    static{
        System.out.println("Class main satatic block: ");
    }
}
