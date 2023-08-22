// 13) Explain the importance of toString() and equals() method of the Object class and override them
// on class Employee (empId,name,salary).
// Create class for main method(say XYZ),and accept five employees information and store in an array. 
// Also ensure if entered empId already exist or not (use equals method).
// Display all employee info using toString() method.

import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private float salary;

    // default constructor:
    public Employee() {

    }

    // parameterized constructor:
    public Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.salary = salary;
        this.name = name;
    }

    // get value of empId:
    public int getId() {
        return this.empId;
    }

    // to string method:
    public String toString() {
        return ("Employee id: " + empId + " salary: " + salary + " name: " + name);
    }

}

class Q13Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employee: ");
        int employeeNum = sc.nextInt();

        // create a object type array of employee class:
        Employee obj[] = new Employee[employeeNum];

        // Enter information:
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Etner your name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter employee id: ");
            int empId = sc.nextInt();
            System.out.println("Enter salary: ");
            float salary = sc.nextFloat();
            // obj[i] = new Employee();
            obj[i] = new Employee(empId, name, salary);
        }

        // print information:
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].toString());
        }

        // check empId
        boolean flag = false;
        for (int i = 0; i < obj.length; i++) {
            for(int j = i+1; j < obj.length; j++){
                if(obj[i].getId() == obj[j].getId()){
                    System.out.println("empId is alredy exist " +obj[i].getId());
                    break;
                }
            }
        }
        if (flag) {

        }

    }
}