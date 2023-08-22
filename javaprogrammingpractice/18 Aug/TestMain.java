// interface

import java.util.Scanner;

interface College {
    public abstract void display(String collegeName);
}

// ----------------------------------------------------TEACHER-CLASS----------------------------------------------
class Teacher {
    String name;
    String qualification;

    // // overriding collegename method:
    // public void display(String collegeName){
    // System.out.println("college: "+collegeName +" Name: "+name +" Qualification:
    // "+qualification);
    // }

    // default constructor:
    public Teacher() {

    }

    // parameterized constructor:
    public Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    // setter method:
    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // getter method:
    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

}

// -----------------------------------------------DEPARTMENT-CLASS------------------------------------------------------
class Department extends Teacher implements College {
    int department_no;
    String departmentName;

    // default constructor:
    public Department() {

    }

    // parameterized constructor:
    public Department(int department_no, String departmentName, String name, String qualification) {
        super(name, qualification);
        this.departmentName = departmentName;
        this.department_no = department_no;
    }

    // override interface method:
    public void display(String collegeName) {
        System.out.println("College name: " + collegeName);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Deparment name: " + departmentName);
        System.out.println("Department no: " + department_no);

    }
}

// ---------------------------------------------------OPERFATION-CLASS--------------------------------------------------------
class Operation {
    Scanner sc = new Scanner(System.in);

    // create default constructor:
    public Operation() {

    }

    public void input() {
        System.out.println("Etner name: ");
        String name = sc.nextLine();
        System.out.println("Enter Qualification: ");
        String qualification = sc.nextLine();
        System.out.println("Enter department number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department name: ");
        String Dname = sc.nextLine();
        System.out.println("college name: ");
        String collegeName = sc.nextLine();

        // create a object of department class:
        Department objD = new Department(number, name, Dname, qualification);

        // call display method:
        objD.display(collegeName);
    }
}

class TestMain {
    public static void main(String[] args) {

        // create object of operation class:
        Operation objO = new Operation();
        objO.input();
    }
}