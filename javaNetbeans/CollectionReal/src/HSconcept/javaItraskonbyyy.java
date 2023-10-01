package HSconcept;

import java.util.HashSet;
import java.util.Iterator;

public class javaItraskonbyyy {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(101);
        hs.add(102);
        hs.add(103);
        //System.out.println(hs.remove(100));

//        System.out.println(hs);


        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            }
        }
//         Iterator i1 = hs.iterator();
//
//        while (i1.hasNext()) {
//            System.out.println(i1.next());
//        }

//            if (hs.equals(100)) {
//                System.out.println("true");
//                hs.remove(0);
//                i.next();
//            } else {
//                System.out.println(i.next());
//            }
//        }
//        ListIterator li = hs.listIterator();
//        while (li.hasNext()) {
//            System.out.println(li.next());
//        }
//        System.out.println(hs);
    }
}
