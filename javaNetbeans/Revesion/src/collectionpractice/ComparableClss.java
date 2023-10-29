package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

class Customer implements Comparable<Customer> {

    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Customer c1) {
        if (id == c1.id) {
            return 0;
        } else if (id > c1.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparableClss {

    public static void main(String[] args) {
        ArrayList<Customer> al = new ArrayList<>();
        al.add(new Customer(12, "Aashish"));
        al.add(new Customer(10, "mohan"));

        Collections.sort(al);
        for (Customer c : al) {
            System.out.println(c.id + " " + c.name);
        }
    }
}
