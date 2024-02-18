package JAVA.WRAPPER;

public class Check {
    public static void main(String[] args) {

        // Integer i = 10;
        // System.out.println(i.getClass());


        // BOXING
        int i = 100;
        Integer iobj = new Integer(i); // its called boxing

        // UNBOXING
        int j = iobj.intValue();  // its called unboxing

        // AUTO-BOXING
        Integer k = j;  // its called autoboxing

        // AUTO-UNBOXING
        int l = k;   // its called autoUnboxing


        // valueOf and intValue()
        Integer integer = 100;
        int ii = 200;

        int jj = integer.intValue();   // to convert the object as a primitive

        Integer iiijj = Integer.valueOf(ii);  // to convert the primitive as a object
        
    }
}
