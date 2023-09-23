package revesion;

public class RevesionConstructor {

    public RevesionConstructor() {
        this(100);
        System.out.println("Default constructor: ");
    }

    public RevesionConstructor(int x) {
        System.out.println("Parametereized constructor: ");
    }
    
    static int x = 10;

    public static void main(String[] args) {
        RevesionConstructor rc = new RevesionConstructor();
        RevesionConstructor.x = 20;
        System.out.println(RevesionConstructor.x);
    }
}
