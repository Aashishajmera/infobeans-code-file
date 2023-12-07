public class Singleton {

  private static Singleton ref = null;

  // private constructor
  private Singleton() {
    System.out.println("Constructor called....");
  }

  public static synchronized Singleton createObj() {
    if (ref == null) {
      ref = new Singleton();
    }
    return ref;
  }

  public static void main(String[] args) {
    Singleton obj = Singleton.createObj();
    System.out.println(obj);
    Singleton obj1 = Singleton.createObj();
    System.out.println(obj1);
  }
}
