package cmpble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

class Test77  {

    private int age;
    private String name;

    public Test77(int age, String name) {
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
    public String toString(){
       return "Name"+getName() +" id "+getAge();
    }
//    @Override
//    public int compareTo(Test77 o) {
//        if(this.getAge() == o.getAge())
//            return 0;
//        else if(this.getAge() < o.getAge())
//            return -1;
//        else
//            return 1;
//    }

    @Override
    public int hashCode() {
        return getAge();
    }

    @Override
    public boolean equals(Object obj) {
        
        Test77 t = (Test77)obj;
        return this.getAge() == t.getAge() && this.getName().equals(t.getName());
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Test77 other = (Test77) obj;
//        if (this.age != other.age) {
//            return false;
//        }
//        return Objects.equals(this.name, other.name);
    }
}

public class HassssSetComparable {

    public static void main(String[] args) {

        LinkedHashSet<Test77> hs = new LinkedHashSet<Test77>();

        hs.add(new Test77(12, "Aashu"));
        hs.add(new Test77(22, "Ankit"));
        hs.add(new Test77(11, "Raju"));

        for (Test77 t : hs) {
//            System.out.println(t.getAge() + " " + t.getName());
            System.out.println(t);
        }
    }
}
