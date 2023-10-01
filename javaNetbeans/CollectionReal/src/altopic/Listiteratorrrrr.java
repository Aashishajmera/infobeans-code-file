package altopic;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class Listiteratorrrrr {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Aashish");
        al.add("ajmera");
        al.add("From aamla");
        al.add(101);
//        System.out.println(al.equals("Aashish, ajmera, From aamla, 101"));
//        al.remove(3);
//        al.remove(2);
//        al.remove("From aamla");
        Vector v = new  Vector();

        ListIterator li = al.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        
//        li.add("Khategaon");
//        li.set(22);
//           li.remove();
//           li.remove();
        System.out.println(al);

        
        
    }
}
