package HSconcept;

import java.util.HashSet;

public class Hs1 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(30);
//        hs.add(2,99);
        hs.add(40);
        System.out.println("Hash set is not allow duplicate element: ");
        System.out.println(hs);
        
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("A");
        hs1.add("D");
        System.out.println("Hash set is not allow duplicate element: ");
        System.out.println(hs1);
        
        
        
        HashSet<StringBuffer> hs2 = new HashSet<StringBuffer>();
        hs2.add(new StringBuffer("A"));
        hs2.add(new StringBuffer("B"));
        hs2.add(new StringBuffer("C"));
        hs2.add(new StringBuffer("A"));
        hs2.add(new StringBuffer("A"));
        System.out.println("Hash set is allow duplicate element because StringBuffer allways create new hash code");
        System.out.println(hs2);
        
        HashSet hs3 = new HashSet();
        hs3.add("Aashish");
        hs3.add(30.22f);
        hs3.add(30.899);
        hs3.add(30.899);
        hs3.add('k');
        hs3.add("aldkj");
        hs3.add('k');
        System.out.println("Hash set is not allow duplicate element: ");
        System.out.println(hs3);
        
        
        
    }
}
