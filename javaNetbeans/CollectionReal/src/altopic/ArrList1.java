package altopic;

import java.util.ArrayList;

public class ArrList1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();
        ArrayList al3 = new ArrayList();

        al.add(10);
        al.add("Aashish");
        al.add("A");

        al2.add("Aashu");
        al2.add("Mohan");

        System.out.println(al);
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);
        System.out.println(al.contains("Aashu"));
        System.out.println(al2.contains("Aashish"));

        System.out.println(al3.isEmpty());
        al.remove(0);
        System.out.println(al);

//        al.clear();
        System.out.println(al);

//        al2.clone();
//        al2.clone();
        System.out.println(al2.clone());
        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al.size());
//        "Aal.ensureCapacity(20);
        System.out.println(al.size());

        al.addAll(al2);
        System.out.println(al.equals("Aashish"));
        System.out.println(al.equals(al2));
        System.out.println(al.hashCode());
//        al.forEach(action);
    }
}
