//-----------------------------------------------------------POJO-CLASS--------------------------------------------------------

import java.util.Scanner;

class Pojo {

    // basic information:
    String s_Name;
    String f_Name;
    String m_Name;
    String enrollmentNum;
    String status;
    int roll_no;
    byte semester;
    byte atkt;

    // create default object:
    public Pojo() {

    }

    // parameterized constructor:
    public Pojo(String s_Name, String f_Name, String m_Name, String enrollmentNum, String status, int roll_No,
            byte semseter, byte atkt) {
        this.s_Name = s_Name;
        this.f_Name = f_Name;
        this.m_Name = m_Name;
        this.enrollmentNum = enrollmentNum;
        this.status = status;
        this.roll_no = roll_No;
        this.semester = semseter;
        this.atkt = atkt;
    }

    // setter method:
    public void setSemester(byte semester) {
        this.semester = semester;
    }

    public void setAtkt(byte atkt) {
        this.atkt = atkt;
    }

    // semester subject array:
    String sem1Sub[] = { "Java", "Python", "MYsql", "Hindi", "Vocational-1", "Vocational-2", "Lab-1", "Lab-2" };
    String sem2Sub[] = { "Java", "Python", "MYsql", "Hindi", "Vocational-1", "Vocational-2", "Lab-1", "Lab-2" };
    String sem3Sub[] = { "Java", "Python", "MYsql", "Hindi", "Vocational-1", "Vocational-2", "Lab-1", "Lab-2" };
    String sem4Sub[] = { "Java", "Python", "MYsql", "Hindi", "Vocational-1", "Vocational-2", "Lab-1", "Lab-2" };
    String sem5Sub[] = { "Java", "Python", "MYsql", "Hindi", "Vocational-1", "Vocational-2", "Lab-1", "Lab-2" };
    String sem6Sub[] = { "Java", "Python", "MYsql", "Hindi", "Vocational-1", "Vocational-2", "Lab-1", "Lab-2" };

    // 1st semester marks array:
    byte sem1Marks[] = new byte[8];
    byte sem2Marks[] = new byte[8];
    byte sem3Marks[] = new byte[8];
    byte sem4Marks[] = new byte[8];
    byte sem5Marks[] = new byte[8];
    byte sem6Marks[] = new byte[8];

    //

    // check Atkt array:
    boolean sem1Atkt[] = new boolean[8];
    boolean sem2Atkt[] = new boolean[8];
    boolean sem3Atkt[] = new boolean[8];
    boolean sem4Atkt[] = new boolean[8];
    boolean sem5Atkt[] = new boolean[8];
    boolean sem6Atkt[] = new boolean[8];

}

// ---------------------------------------------------------DISPLAY-CLASS-------------------------------------------------------
class Display {

    public void resultDisplay() {

    }
}

// ---------------------------------------------------------OPERATION-CLASS-----------------------------------------------------
class Operation {
    Scanner sc = new Scanner(System.in);

    Pojo objP;
    // basic input:
    public void basicInformation() {
        System.out.println("\t Enter your name: ");
        String s_Name = sc.nextLine();
        System.out.println("\t Father name: ");
        String f_Name = sc.nextLine();
        System.out.println("\t Mother name: ");
        String m_Name = sc.nextLine();
        System.out.println("\t Roll number: ");
        int roll_No = sc.nextInt();
        sc.nextLine();
        System.out.println("\t Enrollment number: ");
        String enrollmentNum = sc.nextLine();
        System.out.println("\t status (regular/private):");
        String status = sc.nextLine();

        // create object of pojo class:
        new Pojo(s_Name, f_Name, m_Name, enrollmentNum, status, roll_No, 1, 0);
    }

    // information of 1st semester:
    public void semester(){
        for(int i = 0; i < objP.sem1Marks.length; i++){
            
        }
    }

    
}
// ---------------------------------------------------------MAIN-CLASS----------------------------------------------------------

class MarksheetProject {
    public static void main(String[] args) {

        // create a object of input class:
    }
}