package lltopic;

import java.util.LinkedList;
import java.util.Scanner;

public class ll1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // create a linkedList obj
        LinkedList<Object> ll = new LinkedList<Object>();
        
        ll.add("Aashish");
        ll.add(10);
        
        System.out.println(ll);
        
        for(Object c: ll){
            System.out.print(c+" ");
        }
        System.out.println();
    }
}
