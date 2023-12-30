public class Boxing{

    // Boxing is the process of converting a value type into a reference type. Unboxing is the process of converting a reference type back into a value type.


    public static void main(StringCls[] args) {
        // BOXING ==> convert primitive into object

        // primitive int value
        int a = 10;
        System.out.println(a);
        
        Integer iobj = new Integer(a);  //  BOXING
        System.out.println(iobj);


        // AUTO BOXING ==> convert primitive into object
        // int type value
        int b = 20;
        System.out.println(b);
        Integer iobj2 = b;  // AUTO-BOXING  bydefault compiler use valueOf method 
        System.out.println(iobj2);

    }
}