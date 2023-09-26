package LHSconcept;

import java.util.LinkedHashSet;

public class LHS1 {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(10);
        lhs.add(30);
//        lhs.add(2,88);
        System.out.println("Incase of Integer (there are not allow to duplicate element: )");
        System.out.println(lhs);

        LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();
        lhs2.add("A");
        lhs2.add("B");
        lhs2.add("C");
        lhs2.add("A");
        System.out.println("Incase of String (there are not allow to duplicate element: )");
        System.out.println(lhs2);

        LinkedHashSet<StringBuffer> lhs3 = new LinkedHashSet<StringBuffer>();
        lhs3.add(new StringBuffer("A"));
        lhs3.add(new StringBuffer("B"));
        lhs3.add(new StringBuffer("A"));
        System.out.println("Incase of StringBuffer (there are allow to duplicate element: )");
        System.out.println(lhs3);
    }
}
