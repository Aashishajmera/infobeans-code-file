package JAVA.OOPS;

class InnerOverride {

  public InnerOverride() {
    System.out.println("I am parent defautl constructor....");
  }

  public void m1() {
    System.out.println("I am parent m1");
  }
}

public class Override extends InnerOverride {

  public void m1() {
    System.out.println("I am child m1");
    super.m1();
  }

  public Override() {
    System.out.println("I am child cunstroctor...");
  }

  public static void main(String[] args) {
    InnerOverride obj = new Override();
    obj.m1();
  }
}
