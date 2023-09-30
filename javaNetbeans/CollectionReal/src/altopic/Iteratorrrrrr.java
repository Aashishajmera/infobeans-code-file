package altopic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
  
public class Iteratorrrrrr {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.add("Aashish");
        ll.add("ajmera");
        ll.add("From");
        ll.add("Aamla");
        
        
//        System.out.println(ll);

        ListIterator i =  ll.listIterator();
        System.out.println("Forword direction: ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println("\nBackword direction: ");
        while(i.hasPrevious()){
            System.out.print(i.previous()+" ");
        }
    }
}
