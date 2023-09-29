package cmpble;

import java.util.TreeSet;
class DemoCustomer{
    private String name;
    private int id;

    public DemoCustomer(String name, int id) {
        this.name = name;
        this.id = id;
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
    
    @Override
    public String toString(){
        return "Name: "+getName() +" Id: " +getId();
    }
    
    @Override
    public int hashCode(){
        return getId();
    }
    
    public boolean equals(Object o){
        Customer c = (Customer) o;
        return this.id == c.getId() && this.getName().equals(c.getName());
    }
    
    
}
public class Camprtr2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        ts.add(20);
        ts.add(40);
        ts.add(10);
        ts.add(20);
        ts.add(5);
        
        System.out.println(ts);
    }
}
