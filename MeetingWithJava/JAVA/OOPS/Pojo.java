package JAVA.OOPS;

class InnerPojo {

  private long a;

  InnerPojo() {
    System.out.println("I am parent constructor....");
  }

  public void setA(long a) {
    this.a = a;
  }

  public long getA() {
    return this.a;
  }

  public void printData() {
    System.out.println(a);
  }
}

public class Pojo {

  public static void main(String[] args) {
    InnerPojo obj = new InnerPojo();
    obj.printData();
  }
}
