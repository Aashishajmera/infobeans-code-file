// 7) Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated 
//  on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 

// Faculty class-1 ------------------------------
import java.util.Scanner;

class Faculty {
    private int faculty_id;
    private float salary;

    // default constructor:
    public Faculty() {

    }

    // perameterized constructor:
    public Faculty(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    // setter method of faculty_id:
    public void setId(int id) {
        this.faculty_id = id;
    }

    // setter method of salary:
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // display method:
    public void display() {
        System.out.println("faculty_id: " + faculty_id + " \t Salary " + salary);
    }

}

// FullTimeFaculty class-2 --------------------------
class FullTimeFaculty extends Faculty {
    private float basic;
    private float allowance;

    // input method:
    public void acceptingInput(Scanner sc) {
        System.out.println("Enter faculty id: ");
        setId(sc.nextInt());
        System.out.println("Enter basic: ");
        basic = sc.nextFloat();
        System.out.println("Enter allowance: ");
        allowance = sc.nextFloat();
        setSalary(basic + allowance);
    }

    // default constructor:
    public FullTimeFaculty() {

    }

    // display method:
    public void display() {
        System.out.println("-------------------FullTimeFaculty-INFORMATION----------------------");
        super.display();
        System.out.println("basic: " + basic + " \t allowance: " + allowance);
        System.out.println();
    }

}

// PartTimeFaculty class-3 ----------------------------
class PartTimeFaculty extends Faculty {
    private float hour;
    private float rate;

    // default constructor:
    public PartTimeFaculty() {

    }

    // input method:
    public void acceptingInput(Scanner sc) {
        System.out.println("Enter faculty id: ");
        setId(sc.nextInt());
        System.out.println("Enter hour: ");
        hour = sc.nextFloat();
        System.out.println("Enter rate: ");
        rate = sc.nextFloat();
        setSalary(hour + rate);

    }

    // display method:
    public void display() {
        System.out.println("-------------------PartTimeFaculty-INFORMATION----------------------");
        super.display();
        System.out.println("hour: " + hour + " \t rate: " + rate);
        System.out.println();
    }

}

// --------------------------------MAIN-CLASS-----------------------------------
class Q7FacultyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fulltime Employee number: ");
        int f = sc.nextInt();
        // FullTimeFaculty object:
        FullTimeFaculty objf[] = new FullTimeFaculty[f];

        for (int i = 0; i < objf.length; i++) {
            System.out.println("Enter " + (i + 1) + " employee details: ");
            objf[i] = new FullTimeFaculty();
            objf[i].acceptingInput(sc);
        }

        System.out.println("Enter partTime Employee details: ");
        int p = sc.nextInt();
        // FullTimeFaculty object:
        PartTimeFaculty objp[] = new PartTimeFaculty[p];

        for (int i = 0; i < objp.length; i++) {
            System.out.println("Enter " + (i + 1) + " employee details: ");
            objp[i] = new PartTimeFaculty();
            objp[i].acceptingInput(sc);
        }

        // FullTimeFaculty information print:
        for (int i = 0; i < objf.length; i++) {
            objf[i].display();
        }

        // PartTimeFaculty information print:
        for (int i = 0; i < objp.length; i++) {
            objp[i].display();
        }

        // // FullTimeFaculty object:
        // FullTimeFaculty objf2 = new FullTimeFaculty();
        // objf2.acceptingInput(sc);

        // // PartTimeFaculty object:
        // PartTimeFaculty objp1 = new PartTimeFaculty();
        // objp1.acceptingInput(sc);
        // // PartTimeFaculty object:
        // PartTimeFaculty objp2 = new PartTimeFaculty();
        // objp2.acceptingInput(sc);

        // objf1.display();
        // objf2.display();
        // objp1.display();
        // objp2.display();
    }
}