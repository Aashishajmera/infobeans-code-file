package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer {

    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//sorting using id
class SortId implements Comparator<Customer> {

    public int compare(Customer c1, Customer c2) {
        if (c1.id == c2.id) {
            return 0;
        } else if (c1.id > c2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

// sort by name
class SortByName implements Comparator<Customer>{
    public int compare(Customer c1, Customer c2){
        return c1.name.compareTo(c2.name);
    }
}

public class ComparatorClss {

    public static void main(String[] args) {
        ArrayList<Customer> al = new ArrayList<>();

        al.add(new Customer(12, "Aashish"));
        al.add(new Customer(10, "Mohan"));
        al.add(new Customer(8, "Sohan"));

        Collections.sort(al, new SortId());
        for (Customer c : al) {
            System.out.println(c.getId() + " " + c.getName());
        }
        
        Collections.sort(al,new SortByName());
        for(Customer c: al){
            System.out.println(c.id +" " +c.name);
        }
    }
}
