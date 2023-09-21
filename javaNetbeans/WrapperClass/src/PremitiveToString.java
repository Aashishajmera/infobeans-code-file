
public class PremitiveToString {
    public static void main(String[] args) {
        Integer x = 100;
        
        // convert to string: 
        
        String s = x.toString();
        
        System.out.println("integer is: "+(s+2));
        System.out.println("string is :"+(x+2));
        
        
        
        int y = 100;
        Integer i = new Integer(y); 
        Integer x2 = y;
        
//         Integer x2 = 100;
        
        // convert to string: 
        
        String s2 = x2.toString();
        
        System.out.println("integer is: "+(s2+2));
        System.out.println("string is :"+(x2+2));
    }
}
