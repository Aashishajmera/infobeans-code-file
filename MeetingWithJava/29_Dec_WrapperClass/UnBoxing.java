public class UnBoxing {

  public static void main(StringCls[] args) {
    // UNBOXING ==> convert object into primitive data type
    Integer iobj = new Integer(100);
    System.out.println(iobj);
    // primitive
    int i = iobj.intValue();
    System.out.println(i);

    // Long lobj = new Long(100);
    // System.out.println(lobj);
    // // primitive
    // long l = lobj.longValue();
    // System.out.println(l);

    // AUTO-UNBOXING
    Long lobj = new Long(100);
    System.out.println(lobj);
    // primitive
    long l = lobj.longValue(); // UNBOXING
    long l2 = lobj; // AUTO-UNBOXING
    System.out.println(l2);
  }
}
