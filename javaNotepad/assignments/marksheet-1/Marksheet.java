// Que :- There is a student of DAVV university Who need to enter their name,
// fathers name roll no and there is total eight subjects in all semester in, 
// which 6 are theoxatical and two practical Subjects we have to enter
// if the dudent got Atkt in two Aubjects then Studenta has to give exam again 
// of those Subject if tudent is fail in more than 2. Subject if then Xtudent 
// has to repeat that Sem again. after every dem we have to Print The marksheet.
//  if the student has ATKT then again we have to print marksheet after passing

// → Provide marksheets, migration, TC along With degree..
// → In every required marksheet DAVV seal should be.
// →ATKT should be printed with red or Colour and First year ATKT exam will be held with. 2nd Year exams.

// import java.util.Scanner;

//--------------------------------------------------POJO----------------------------------------------

import java.util.Scanner;

class Pojo {

    // basic information of user:
    private String s_Name;
    private String f_Name;
    private String enrollmentNum;
    private String status;
    private int roll_no;
    private String examName;
    private String collegeName;
    private int semester;
    private int checkAtkt;
    private int totalMarks;

    // subject name:
    // private int coreJavaMark;
    // private int pythonMark;
    // private int computerNetwork;
    // private int principal_management;
    // private int mySql_php;
    // private int e_governance;
    // private int lab_pj1;
    // private int lab_pj2;

    // default constructor:
    public Pojo() {

    }

    // parameterized constructor:
    public Pojo(String s_String, String f_String, String enrollmentNum, String status, int roll_no, String examName,
            String collegeName, int semester, int checkAtkt) {
        this.s_Name = s_Name;
        this.f_Name = f_Name;
        this.enrollmentNum = enrollmentNum;
        this.status = status;
        this.roll_no = roll_no;
        this.examName = examName;
        this.collegeName = collegeName;
        this.semester = semester;
        this.checkAtkt = checkAtkt;
    }

    // set user data
    // public void setData(int pythonMark, int coreJavaMark, int computerNetwork,
    // int principal_management, int mySql_php, int e_governance, int lab_pj1, int
    // lab_pj2) {
    // this.coreJavaMark = coreJavaMark;
    // this.pythonMark = pythonMark;
    // this.computerNetwork = computerNetwork;
    // this.principal_management = principal_management;
    // this.mySql_php = mySql_php;
    // this.e_governance = e_governance;
    // this.lab_pj1 = lab_pj1;
    // this.lab_pj2 = lab_pj2;
    // }

    // setter method:
    public void setSname(String s_Name) {
        this.s_Name = s_Name;
    }

    public void setFname(String f_name) {
        this.f_Name = f_name;
    }

    public void setEnrollmentNum(String enrollmentNum) {
        this.enrollmentNum = enrollmentNum;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRollNum(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setTotalMark(int totalMark) {
        this.totalMarks = totalMarks;
    }

    // public void setCorejavamark(int coreJavaMark) {
    // this.coreJavaMark = coreJavaMark;
    // }

    // public void setPythonmark(int pythonMark) {
    // this.pythonMark = pythonMark;
    // }

    // public void setComputernetwork(int computerNetwork) {
    // this.computerNetwork = computerNetwork;
    // }

    // public void setPrincipalManagment(int principal_management) {
    // this.principal_management = principal_management;
    // }

    // public void setMysqlPhp(int mySql_php) {
    // this.mySql_php = mySql_php;
    // }

    // public void setEgovernance(int e_governance) {
    // this.e_governance = e_governance;
    // }

    public void setAtkt(int checkAtkt) {
        this.checkAtkt = checkAtkt;
    }

    // getter method:
    public String getSname() {
        return s_Name;
    }

    public String getFname() {
        return f_Name;
    }

    public String getEnrollmentNum() {
        return enrollmentNum;
    }

    public String getStatus() {
        return status;
    }

    public int getRollNum() {
        return roll_no;
    }

    public String getExamName() {
        return examName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getSemester() {
        return semester;
    }

    public int getTotalMark() {
        return totalMarks;
    }

    // public int getCorejavamark() {
    // return coreJavaMark;
    // }

    // public int getPythonMark() {
    // return pythonMark;
    // }

    // public int getComputerMark() {
    // return computerNetwork;
    // }

    // public int getPrincipalManage() {
    // return principal_management;
    // }

    // public int getMysqlPhp() {
    // return mySql_php;
    // }

    // public int getEgovernance() {
    // return e_governance;
    // }

    // public int getLab1() {
    // return lab_pj1;
    // }

    // public int getLab2() {
    // return lab_pj2;
    // }

    public int getCheckAtkt() {
        return checkAtkt;
    }

    // Display method:
    public void resultDisplay(int sem1_P[], int sem1_T[]) {

        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println(
                "                                               Result                                              ");
        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println(
                "Exam Name: \t" + examName + "\t\t\tEnrollment No-   " + enrollmentNum + "\t\t Roll No:    " + roll_no);
        System.out.println("Name: \t\t" + s_Name + "\t\t\t\t\t\t Father Name:   " + f_Name);
        System.out
                .println("Status: \t" + status + " \t\t semester- " + semester + "\t\t College Name: \t" + collegeName);
        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println("  Subject \t\t Min maks \t Obtain maks   \t\t Grade \t\t Total maks \n");
        System.out.println("  Core java: \t\t" + "   25 \t\t     " + sem1_T[0] + "\t\t\t\t\t     75");
        System.out.println("  pyhon : \t\t" + "   25 \t\t     " + sem1_T[1] + "\t\t\t\t\t     75");
        System.out.println("  computer network: \t" + "   25 \t\t     " + sem1_T[2] + "\t\t\t\t\t     75");
        System.out
                .println("  principle of managment:  " + "25 \t\t     " + sem1_T[3] + "\t\t\t\t\t     75");
        System.out.println("  e-governance: \t" + "   25 \t\t     " + sem1_T[4] + "\t\t\t\t\t     75");
        System.out.println("  MYsql & php: \t\t" + "   25 \t\t     " + sem1_T[5] + "\t\t\t\t\t     75");
        System.out.println("  Lab1: \t" + "\t   25 \t\t     " + sem1_P[0] + "\t\t\t\t\t     50");
        System.out.println("  Lab2: \t" + "\t   25 \t\t     " + sem1_P[1] + "\t\t\t\t\t     50");
        System.out.println();
        System.out.println("\t\t\t\t\tObt.total " + totalMarks + "  \t\t\t         Total 550");
        System.out.println(
                "---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tObt.Maks   \t Total mark      \t result \t\t Attempt");
        System.out.println("\t\t   " + totalMarks + "  \t  550    \t\t\t\t\t Attempt");
        System.out.println(
                "---------------------------------------------------------------------------------------------------");
    }
}

// ------------------------------------------OPERATION-PERFORM------------------------------------------------
class Operation {

    Scanner sc = new Scanner(System.in);
    String status;

    // default constructor:
    public Operation() {

    }

    // status check method:
    public String checkStatus() {
        boolean flag = false;
        String s;
        do {
            System.out.println("Enter status: ");
            s = sc.nextLine();
            if (s.equals("Private") || s.equals("private") || s.equals("Regular") || s.equals("regular")) {
                break;
            } else {
                System.out.println("Type only: (regular / private)");
                flag = true;
            }
        } while (flag);
        return s;

    }

    public int TheurySub(int n, Pojo objP) {
        do {
            if (n <= 75 && n > 0) {
                if (n <= 25) {
                    checkAtkt++;
                    objP.setAtkt(checkAtkt);
                }
            } else {
                System.out.println("Marks not valid please re-enter marks: ");
            }
        } while (!(n <= 75 && n > 0));
        return n;
    }

    public int practicalSub(int n, Pojo objP) {
        do {
            if (n <= 50 && n > 0) {
                if (n <= 17) {
                    checkAtkt++;
                    objP.setAtkt(checkAtkt);
                }
            } else {
                System.out.println("Marks not valid please re-enter marks: ");
            }
        } while (!(n <= 50 && n > 0));
        return n;
    }

    // check total marks:
    int totalmarks;

    public void checkTotalMarks(Pojo objP, int sem1_P[], int sem1_T[]) {
        for (int i = 0; i < sem1_P.length; i++) {
            totalmarks += sem1_P[i];
        }
        for (int i = 0; i < sem1_T.length; i++) {
            totalMarks += sem1_T[i];
        }
        objP.setTotalMark(totalMarks);
    }
}

// -----------------------------------------------MAIN-CLASS----------------------------------------------
class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checkAtkt = 0;
        int semester = 1;

        // create object of operation class:
        Operation objO = new Operation();

        // Input userInformation:
        System.out.println("Enter student name: ");
        String s_name = sc.nextLine();
        System.out.println("Enter father name: ");
        String f_name = sc.nextLine();
        System.out.println("Enter enrollment number: ");
        String enrollmentNo = sc.nextLine();
        System.out.println("Enter rollNumber: ");
        int roll_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter exam name: ");
        String examName = sc.nextLine();
        System.out.println("Enter college name: ");
        String collegeName = sc.nextLine();

        // check status method:
        String status = objO.checkStatus();

        // create object of Pojo class:
        Pojo objP = new Pojo(s_name, f_name, enrollmentNo, status, roll_no, examName, collegeName, semester, 0);

        // first semester object array:

        // create array of semester 1
        int sem1_T[] = new int[6];
        int sem1_P[] = new int[2];

        do {
            for (int i = 0; i < sem1_T.length; i++) {
                System.out.println("Enter " + (i + 1) + "theory  subject number: ");
                sem1_T[i] = sc.nextInt();
                sem1_T[i] = objO.TheurySub(sem1_T[i], objP);
            }

            for (int i = 0; i < sem1_P.length; i++) {
                sem1_P[i] = sc.nextInt();
                sem1_P[i] = objO.practicalSub(sem1_P[i], objP);
            }

        } while (objP.getCheckAtkt() > 2);

        // check total marks:
        objO.checkTotalMarks(objP, sem1_P, sem1_T);

        objP.resultDisplay(sem1_P, sem1_T);

    }
}