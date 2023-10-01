/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmpble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer3 {

    public Customer3() {
    }

    private int age;
    private String name;
    private float salary;

    public Customer3(int age, String name, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}

class SortByAge implements Comparator<Customer3> {

    @Override
    public int compare(Customer3 o1, Customer3 o2) {
        if(o1.getAge() != o2.getAge()){
            return o1.getAge() - o2.getAge();
        }else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}

class SortByName implements Comparator<Customer3>{
    @Override
    public int compare(Customer3 o1, Customer3 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ArrrrListComprastor {

    public static void main(String[] args) {
        ArrayList<Customer3> arrayList = new ArrayList<Customer3>();

        arrayList.add(new Customer3(12, "Aashish", 22.9f));
        arrayList.add(new Customer3(10, "Qeepak", 2298.9f));
        arrayList.add(new Customer3(10, "Mohan", 2278.9f));
        arrayList.add(new Customer3(1, "Sohan", 2222.9f));

//        for (Customer3 c : arrayList) {
//            System.out.println(c.getName() + " " + c.getAge() + " " + c.getSalary());
//        }

        Collections.sort(arrayList, new SortByAge());
//        Collections.sort(arrayList, new SortByName());
        
        for (Customer3 c : arrayList) {
            System.out.println(c.getName() + " " + c.getAge() + " " + c.getSalary());
        }
    }
}
