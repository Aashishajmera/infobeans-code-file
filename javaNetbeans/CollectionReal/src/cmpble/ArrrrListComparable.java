package cmpble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Customer2 implements Comparable<Customer2> {

    private int age;
    private String name;

    public Customer2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer2 o) {
        if (this.getAge() != o.getAge()) {
            return this.getAge() - o.getAge();
        } else {
            return this.name.compareTo(o.name);
        }
    }

}

public class ArrrrListComparable {

    public static void main(String[] args) {
        ArrayList<Customer2> arrayList = new ArrayList<>();

        arrayList.add(new Customer2(19, "Aashish"));
        arrayList.add(new Customer2(22, "Sohan"));
        arrayList.add(new Customer2(2, "Mohan"));
        arrayList.add(new Customer2(22, "Ritesh"));

//        System.out.println(arrayList);
        Collections.sort(arrayList);
        for (Customer2 c : arrayList) {
            System.out.println(c.getAge() + " ^" + c.getName());
        }

    }
}
