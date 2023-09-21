
public class PremitiveToObject {

    public static void main(String[] args) {

        //premitive to object
        int x = 100;

        Integer iobj = new Integer(x);  // Boxing 

        System.out.println("Integer value is " + iobj);

        Integer iobj2 = x;  // Auto boxing 

        System.out.println("Auto boxing integer value: " + iobj2);

        //Unboxing 
        //object to premitive: s
        Float f = new Float("boxing  " + 3.14f);
        System.out.println("float value is: " + f);

        float f2 = f.floatValue(); // unboxing

        float f1 = f; // Auto unboxing
        System.out.println("auto unboxing : " + f1);

    }
}
