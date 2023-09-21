
public class BooleanToObject {
    public static void main(String[] args) {
        boolean flag = true;
        
        // auto - unboxing
        Boolean iflag = flag;
        
        System.out.println("boolean object is: "+iflag);
//        System.out.println(iflag);
        
        // boolean to string: 
        String s = Boolean.toString(flag);
        
        System.out.println("Boolean string is: "+s);
        
    }
}
