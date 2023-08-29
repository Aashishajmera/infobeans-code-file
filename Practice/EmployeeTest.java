import java.util.Scanner;
class Local {

  int salary;
  float time;

  public void getInfo(int salary, float time) {
    this.salary = salary;
    this.time = time;
  }

  public void addSalary() {
    if (salary > 50000) {
      this.salary = salary + 10000;
    }
  }

  public void addWork() {
    if (time > 6) {
      this.salary = salary + 5000;
    }
  }

  public void finalSalary() {
    System.out.println("Salary :" + salary);
    System.out.println("Time: " + time);
  }
}

class EmployeeTest extends Local {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you salary: ");
    int salary = sc.nextInt();
    System.out.println("Entr hour: ");
    float time = sc.nextFloat();

    // // create object of local class:
    // Local objl = new Local();

    // objl.getInfo(salary, time);
    // objl.addSalary();
    // objl.addWork();
    // objl.finalSalary();


    EmployeeTest objE = new EmployeeTest();
    objE.getInfo(salary, time);

    // getInfo(salary,time);

  }
}
