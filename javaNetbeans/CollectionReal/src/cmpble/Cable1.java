package cmpble;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Customer implements Comparable<Customer>{

    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Customer o){
        if(this.getId() == o.getId()){
            return 0;
        }else if(this.getId() < o.getId()){
            return -1;
        }else{
            return 1;
        }
    }
    
    public String toString(){
        return "Name "+this.getName() +" id: "+this.getId();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

class SortbyName implements Comparator<Customer> {

    public int compare(Customer o1, Customer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Cable1 {

    public static void main(String[] args) {
        TreeSet<Customer> ts = new TreeSet<>();

        ts.add(new Customer("Aashish", 101));
        ts.add(new Customer("Mohan", 103));
        ts.add(new Customer("Deepak", 102));
        
        
//        Collections.sort();
        System.out.println(ts);
    }
}
