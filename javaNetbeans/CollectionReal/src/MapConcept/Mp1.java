package MapConcept;

import java.util.HashMap;
import java.util.Iterator;

public class Mp1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new<Integer, String> HashMap();
        hm.put(1, "Aashish");
        hm.put(2, "Ankit");
        hm.put(3, "Raj");
        hm.put(1,"Raju");
//        hm.put(4, "Aashish");
//        System.out.println(hm);

        System.out.println(hm.get(2));
        
//        hm.get(hm);
    }
}
