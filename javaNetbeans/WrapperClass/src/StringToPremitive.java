
import java.util.Scanner;

public class StringToPremitive {

    public static void main(String[] args) {
//        String bs1 = "128";
//        
//        //string convert to byte
//        byte b = Byte.parseByte(bs1);

//        String bs2 = "129";
//        byte b2 = Byte.parseByte(bs2);
        String s = "14";

//        byte s2 = (byte) s;
        byte s2 = Byte.parseByte(s);
        System.out.println(s);

//        String sf = "3.13f";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float value: ");
//        float f = sc.nextFloat();
        double f = sc.nextDouble();

        System.out.println("Float value is: " + f);
        
        
        
        // change to string to long: 
        String ls = "123456789876l";
        
        long l = Long.parseLong(ls);
        System.out.println("Long value is: "+ls);
    }
}
