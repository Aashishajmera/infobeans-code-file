package altopic;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiteratorrrrr {   

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        
        al.add("Aashish");
        al.add("ajmera");
        al.add("From aamla");
//        al.set(0, 101);
        System.out.println(al);
//        remove(al.remove());
        System.out.println(al);
        ListIterator li = al.listIterator();
        li.remove();
        System.out.println(al);
        
//       while(li.hasNext()){
//           System.out.print(li.next()+" ");
//       }

    }
}
