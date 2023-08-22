
//*****Marksheet*********
import java.util.Scanner;

class MarksheetProj {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    // 1.DEGREE
    static void degree(String name, String date, String division) {
        System.out.printf(
                "\n\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(" \t\t\033[0;30m\033[47m                       " + BLUE
                + "DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)                 \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(" \t\t\033[0;30m\033[47m                       " + YELLOW
                + "Bachelor Of Computer Application                            \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                " \t\t\033[0;30m\033[47m                       Certified that %-20s                         \033[0m\n",
                name);
        System.out.printf(
                " \t\t\033[0;30m\033[47m        obtained the Degree of BACHELOR OF COMPUTER APPLICATION in this            \033[0m\n");
        System.out.printf(
                " \t\t\033[0;30m\033[47m        University at the Examination held in %-8s and was placed in           \033[0m\n",
                date);
        System.out.printf(
                " \t\t\033[0;30m\033[47m        the %-7s Division.                                                      \033[0m\n",
                division);
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(" \t\t\033[0;30m\033[47m        Dated : %-8s                                " + RED
                + "Vice-Chancellor            \033[0m\n", date);
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf(
                "\t\t\033[0;30m\033[47m                                                                                   \033[0m\n");
        System.out.printf("\t\t\033[0;30m\033[47m_____________________________\033[0m\n");
    }

    // 2.TC
    static void tC(String sname, String fname, String mname, String roll_num, String entN, String status, String date,
            String syear, String fyear) {
        System.out.printf("\t\t____________________________\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out
                .printf(" \t\t|\t\t      " + BLUE + "DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)" + RESET + "\t\t |\n");
        System.out.printf(" \t\t|\t\t\tA.B. Road,Indore - 452 017\t\t\t\t |\n");
        System.out.printf(" \t\t\t    web site : www.davvcollege.org. E-mail : contact@davvcollege.com\n \n");
        System.out.printf(" \t\t\tBook No. 32\t\t\t\t\tSerial No. A \n");
        System.out.printf(" \n\n\t\t\t\t\t" + GREEN + "COLLEGE LEAVING CERTIFICATE" + RESET + " \n");
        System.out.printf("\n\t\t\tCollege Roll no.%-8s\t\t\tDate:%-8s\n", roll_num, date);
        System.out.printf(
                "\n\n\t\t\tIt is to Certify that Ku. / Shri : %-20s \n\t\t\tFather Name :  Shri %-20s\n\t\t\tMother's Name Smt. : %-20s\n",
                sname, fname, mname);
        System.out.printf(" \n\t\t\tDevi Ahilya Vishwavidyalaya, Indore Entollment No. : %-9s\n", entN);
        System.out.printf(" \t\t\tWas a %-9s student of this college from year %-7s to year\n", status, syear);
        System.out.printf(" \t\t\t%-7s in class BCA 1st sem to 6th sem .\n", fyear);
        System.out.printf("\n \t\t\tHis/her result of last examination held in the year %-7s class \n", fyear);
        System.out.printf(" \t\t\tB.C.A Passed.His / Her Conduct and Character during the period of \n");
        System.out.printf(" \t\t\tstudy in this college known to the undersigned was GOOD Reason \n");
        System.out.printf(" \t\t\tfor leaving this college . \n");
        System.out.printf("\n\n\t\t|\t\t\t\t\t\t" + RED + "Principal Registrar" + RESET + "\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|____________________________|\n");
    }

    // 3.MIGRATION
    static void migrationC(String sname, String roll_num, String entN, String status, String session, String date) {
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                  DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)                     \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                        MIGRATION CERTIFICATE - %-4s                              \033[0m\n",
                session);
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[30m\u001B[42m         Shri/ku./Shrimati %-20s Entrolment No. %-10s         \033[0m\n",
                sname, entN);
        System.out.printf(
                "\t\t\033[0;30m\u001B[42m         is informed that this University has no Objection to his/ her            \033[0m\n");
        System.out.printf(
                "\t\t\u001B[30m\u001B[42m         migrating to another University.He/ She has %-6s as a %-8s         \033[0m\n",
                roll_num, status);
        System.out.printf(
                "\t\t\u001B[30m\u001B[42m         student  at Bachelor of Computer Application  Examination.               \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf("\t\t\u001B[30m\u001B[42m         University House                                       "
                + RED + "sing              \033[0m\n");
        System.out.printf(
                "\t\t\u001B[30m\u001B[42m         Indore-452001                                                            \033[0m\n");
        System.out.printf(
                "\t\t\u001B[30m\u001B[42m         Date:%-8s                                                            \033[0m\n",
                date);
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
        System.out.printf(
                "\t\t\u001B[42m                                                                                  \033[0m\n");
    }

    /* Semester Result */
    static void semesterResult(String subjects[], String sname, String fname, String roll_num, String course, int sem,
            int marks[], int atkt, int aT) {
        String entN = "DS2010814";
        String status1 = "regular";
        String mname = "Gori Padmor", res = "";
        System.out.printf(
                "\n\n  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf("  \033[0;30m\033[47m\033[1;30m                                         " + BLUE
                + "DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)                               \033[0m\n");
        System.out.printf("  \033[0;30m\033[47m\033[1;30m                                                      " + BLUE
                + "RESULT                                                       \033[0m\n");
        System.out.printf("  \033[0;30m\033[47m\033[1;30m                                              " + BLUE
                + "MAIN EXAMINATION  B.C.A Sem- %d                                       \033[0m\n", sem);
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m===================================================================================================================\033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m      Enrollment No. : %-9s                                              Roll No. : %-8s                  \033[0m\n",
                entN, roll_num);
        System.out.printf(
                "  \033[0;30m\033[47m      Student Name : %-20s                                     Father's Name : %-19s  \033[0m\n",
                sname, fname);
        System.out.printf(
                "  \033[0;30m\033[47m      Mother's Name : %-20s                                    Status : %-8s                    \033[0m\n",
                mname, status1);
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m===================================================================================================================\033[0m\n");

        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m===================================================================================================================\033[0m\n");

        System.out.println("  \033[0;30m\033[47m" + BLUE
                + "      Subject_Name                 Type_Paper        MaxMarks      MinMarks       ObtMark                          \033[0m"
                + RESET);

        System.out.printf(
                "  \033[0;30m\033[47m-------------------------------------------------------------------------------------------------------------------\033[0m\n");
        int total_marks = 0;
        for (int i = 0; i < 6; i++) {
            if (marks[i] < 17)
                res = "ATKT";
            System.out.printf("  \033[0;30m\033[47m" + "   %-33s   T            50            17            %02d      "
                    + RED + "%-4s                       \033[0m\n", subjects[i], marks[i], res);
            System.out.printf(
                    "  \033[0;30m\033[47m-------------------------------------------------------------------------------------------------------------------\033[0m\n");
            total_marks += marks[i];
            res = "";
        }
        for (int i = 6; i < 8; i++) {
            if (marks[i] < 9)
                res = "ATKT";
            System.out.printf("  \033[0;30m\033[47m" + "   %-33s   P            25            08            %02d      "
                    + RED + "%-4s                       \033[0m\n", subjects[i], marks[i], res);
            System.out.printf(
                    "  \033[0;30m\033[47m-------------------------------------------------------------------------------------------------------------------\033[0m\n");
            total_marks += marks[i];
            res = "";
        }
        System.out.printf(
                "  \033[0;30m\033[47m===================================================================================================================\033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m                                                      Maximum Marks    350    |    Marks Obtained    %03d           \033[0m\n",
                total_marks);
        System.out.printf(
                "  \033[0;30m\033[47m===================================================================================================================\033[0m\n");
        String result = "FAIL";
        if (atkt <= 2)
            result = "PASS";
        System.out.printf(
                "  \033[0;30m\033[47m      Result : %-6s                                                                           Attempt : %d        \033[0m\n",
                result, aT);
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
        System.out.printf(
                "  \033[0;30m\033[47m                                                                                                                   \033[0m\n");
    }

    /* atkt exams */
    static int atktExam(String subjects[], boolean atkt[], int marks[], int count_atkt, int aT) {
        aT++;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < atkt.length; i++) {
            if (atkt[i]) {
                if (i < 6) {
                    System.out.print("\tEnter " + subjects[i] + " atkt marks out of 50 : ");
                    marks[i] = sc.nextInt();
                    System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
                    if (marks[i] < 0 || marks[i] > 50) {
                        System.out.println(RED + "\t***Invalid marks--Please Re-Enter*" + RESET);
                        i--;
                        continue;
                    }
                    if (marks[i] >= 17) {
                        count_atkt--;
                        atkt[i] = false;
                    }
                    if (marks[i] < 17)
                        atkt[i] = true;
                } else {
                    System.out.print("\tEnter " + subjects[i] + " atkt marks out of 25 : ");
                    marks[i] = sc.nextInt();
                    System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
                    if (marks[i] < 0 || marks[i] > 25) {
                        System.out.println(RED + "\t***Invalid marks--Please Re-Enter*" + RESET);
                        i--;
                        continue;
                    }
                    if (marks[i] >= 9) {
                        count_atkt--;
                        atkt[i] = false;
                    }
                    if (marks[i] < 9)
                        atkt[i] = true;
                }
            }
        }
        return count_atkt;
    }

    /* Semester Exams */
    static int semesterExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            if (i < 6) {// 1
                System.out.print("\tEnter " + subjects[i] + " marks out of 50 : ");
                marks[i] = sc.nextInt();// 51
                System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
                if (marks[i] < 0 || marks[i] > 50) {
                    System.out.println(RED + "\t***Invalid marks--Please Re-Enter*" + RESET);
                    i--;// 0
                    continue;
                }
                if (marks[i] < 17) {
                    count_atkt++;
                    atkt[i] = true;
                } else {
                    atkt[i] = false;
                }
            } else {
                System.out.print("\tEnter " + subjects[i] + " marks out of 25 : ");
                marks[i] = sc.nextInt();
                System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
                if (marks[i] < 0 || marks[i] > 25) {
                    System.out.println(RED + "\t***Invalid marks--Please Re-Enter*" + RESET);
                    i--;
                    continue;
                }
                if (marks[i] < 9) {
                    count_atkt++;
                    atkt[i] = true;
                } else {
                    atkt[i] = false;
                }
            }
        }
        return count_atkt;
    }

    /* Main Function */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sem1subjects[] = { "Mathematics-1", "Statistical Method-1", "C-progamming", "P.C.Software",
                "Digital Computer", "English", "C-practicale", "PC-practicale" };
        String sem2subjects[] = { "Mathematics-2", "Statistical Method-2", "Adv C-programing", "Operating System",
                "Intro. To Info. Sys", "Hindi", "Adv C-practicale", "Operating System-practicale" };
        String sem3subjects[] = { "Discretc Mathematics", "Unix Operating System", "OOP & C++", "Acc. & Financial Mgt.",
                "Data Structures", "Comm. Skill", "OPP & C++ (practicale)", "Data Structure-practicale" };
        String sem4subjects[] = { "Conm(using C lang)", "Software Engineer", "DBMS", "Programming with JAVA",
                "Env. Awareness", "Enterpreneurship", "Conm-practicae", "DBMS-practicale" };
        String sem5subjects[] = { "Linear Algebra", "Computer Networks", "Human values ", "Information Techn",
                "Intr.To cloud com", "Intr.To Data Science", "Data Science-practicale", "Network & Cloud-practicale" };
        String sem6subjects[] = { " Internet  & Web Techn", "Operation Research", "Computer Graphics",
                "Principal & Practice", "Graphics & Multi", "Project", "Operation Research-practicale",
                "Internet  & Web Techn-PR" };
        int sem1marks[] = new int[8];
        int sem2marks[] = new int[8];
        int sem3marks[] = new int[8];
        int sem4marks[] = new int[8];
        int sem5marks[] = new int[8];
        int sem6marks[] = new int[8];
        boolean sem1atkt[] = new boolean[8];
        boolean sem2atkt[] = new boolean[8];
        boolean sem3atkt[] = new boolean[8];
        boolean sem4atkt[] = new boolean[8];
        boolean sem5atkt[] = new boolean[8];
        boolean sem6atkt[] = new boolean[8];
        /* Entering Student Details */
        System.out.println("\n***** DEVI AHILYA VISHWAVIDYALAYA , INDORE ***** \n");
        System.out.print("\tEnter name of student : ");
        String sname = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter name of course : ");
        String course = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter father's name : ");
        String fname = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter mother's name : ");
        String mname = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter Roll Number : ");
        String roll_num = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter Entrolment No. : ");
        String entN = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter status : ");
        String status = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        int count_sem1atkt, count_sem2atkt, count_sem3atkt, count_sem4atkt, count_sem5atkt, count_sem6atkt;
        int aTsem1atkt, aTsem2atkt, aTsem3atkt, aTsem4atkt, aTsem5atkt, aTsem6atkt;
        aTsem1atkt = aTsem2atkt = aTsem3atkt = aTsem4atkt = aTsem5atkt = aTsem6atkt = 0;
        int atkt = 0;
        aTsem1atkt++;
        do {
            count_sem1atkt = 0;
            /* First semester starts */
            System.out.println(BLUE + "\n\tEnter marks of 1st semester :\n " + RESET);
            count_sem1atkt = semesterExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
            atkt = count_sem1atkt;
            System.out.println(YELLOW + "\n\tYou have " + count_sem1atkt + " ATKT in 1st Semester" + RESET);
            /* First semester ends */
            int s = 1;
            semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks, atkt, aTsem1atkt);
            /* First semester atkt starts */
            if (count_sem1atkt >= 3) {
                aTsem1atkt++;
                System.out.println(RED
                        + "\n\t!!!Warning!!!\n\t*Year Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                        + RESET);
                continue;
            } else {
                System.out.println(GREEN + "\n\t---: Congrats You are Promoted to 2nd Semester Exam :---\n" + RESET);
                /* First sem atkt */
                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                    aTsem1atkt++;
                    System.out.println(BLUE + "\n\tPlease Enter Semester 1st ATKT Marks : " + RESET);
                    count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt, aTsem1atkt);
                }
                aTsem2atkt++;
                do {
                    count_sem2atkt = 0;
                    /* Second Semester exam starts */
                    System.out.println(BLUE + "\n\tEnter marks of 2nd semester : " + RESET);
                    count_sem2atkt = semesterExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
                    /* Second semester exam ends */
                    System.out.println(YELLOW + "\n\tYou have " + count_sem2atkt + " ATKT in 2nd Semester");
                    System.out.println(
                            "\tAfter 2nd semester You have " + count_sem1atkt + " ATKT in 1st Semester\n" + RESET);
                    s = 1;
                    atkt = count_sem1atkt;
                    semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks, atkt, aTsem1atkt);
                    s = 2;
                    atkt = count_sem1atkt + count_sem2atkt;
                    semesterResult(sem2subjects, sname, fname, roll_num, course, s, sem2marks, atkt, aTsem2atkt);
                    if (count_sem1atkt + count_sem2atkt >= 3) {
                        System.out.println(RED
                                + "\n\t!!!Warning!!!\n\t*Year Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                + RESET);
                        /* First sem atkt */
                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                            System.out.println(BLUE + "\tPlease Enter 1st Semester ATKT Marks : " + RESET);
                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt, aTsem1atkt);
                        }

                        continue;
                    } else {
                        /* Third semester starts */
                        System.out.println(
                                GREEN + "\n\t---: Congrats You are Promoted to 3rd Semester Exam :---\n" + RESET);
                        /* First sem atkt */
                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                            aTsem1atkt++;
                            System.out.println(BLUE + "\n\tPlease Enter Semester 1st ATKT Marks : " + RESET);
                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt, aTsem1atkt);
                        }
                        /* Second sem atkt */
                        if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                            aTsem2atkt++;
                            System.out.println(BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : " + RESET);
                            count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt, aTsem2atkt);
                        }
                        /* ATKT end of first and second sem */
                        /* 3rd sem main exam start */
                        aTsem3atkt++;
                        do {
                            count_sem3atkt = 0;
                            System.out
                                    .println(BLUE + "\n\tPlease enter the marks of 3rd semester main exam : " + RESET);
                            count_sem3atkt = semesterExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt);
                            System.out.println(YELLOW + "\n\tYou have " + count_sem3atkt + " ATKT in 3rd Semester");
                            System.out.println(
                                    "\tAfter 3rd semester You have " + count_sem1atkt + " ATKT in 1st Semester");
                            System.out.println("\tAfter 3rd semester You have " + count_sem2atkt
                                    + " ATKT in 2nd Semester\n" + RESET);
                            /* 3rd semester main ends */
                            s = 1;
                            atkt = count_sem1atkt;
                            semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks, atkt,
                                    aTsem1atkt);
                            s = 2;
                            atkt = count_sem1atkt + count_sem2atkt;
                            semesterResult(sem2subjects, sname, fname, roll_num, course, s, sem2marks, atkt,
                                    aTsem2atkt);
                            s = 3;
                            atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt;
                            semesterResult(sem3subjects, sname, fname, roll_num, course, s, sem3marks, atkt,
                                    aTsem3atkt);
                            if (count_sem1atkt + count_sem2atkt + count_sem3atkt >= 3) {
                                System.out.println(RED
                                        + "\n\t!!!Warning!!!\n\t*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                        + RESET);
                                /* First sem atkt */
                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                    System.out.println(BLUE + "\tPlease Enter 1st Semester ATKT Marks : " + RESET);
                                    count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt,
                                            aTsem1atkt);
                                }
                                /* Second sem atkt */
                                if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                    System.out.println(BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : " + RESET);
                                    count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt,
                                            aTsem2atkt);
                                }
                                continue;
                            } else {
                                System.out.println(GREEN
                                        + "\n\t---: Congrats You are Promoted to 4th Semester Exam :---\n" + RESET);
                                /* 1st sem atkt start */
                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                    aTsem1atkt++;
                                    System.out.println(BLUE + "\tPlease Enter 1st Semester ATKT Marks : " + BLUE);
                                    count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt,
                                            aTsem1atkt);
                                }
                                /* 2nd sem atkt start */
                                if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                    aTsem2atkt++;
                                    System.out.println(BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : " + RESET);
                                    count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt,
                                            aTsem2atkt);
                                } /* 3rd semester atkt starts */
                                if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                    aTsem3atkt++;
                                    System.out.println(BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : " + RESET);
                                    count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt,
                                            aTsem3atkt);
                                }
                                /* 3rd semester atkt ends */
                                /* 4th Semester exam starts */
                                aTsem4atkt++;
                                do {
                                    count_sem4atkt = 0;
                                    System.out.println(BLUE + "\n\tEnter marks of 4th semester main exam : " + RESET);
                                    count_sem4atkt = semesterExam(sem4subjects, sem4atkt, sem4marks, count_sem4atkt);
                                    System.out.println(
                                            YELLOW + "\n\tYou have " + count_sem4atkt + " ATKT in 4th Semester");
                                    System.out.println("\tAfter 4th semester You have " + count_sem1atkt
                                            + " ATKT in 1st Semester");
                                    System.out.println("\tAfter 4th semester You have " + count_sem2atkt
                                            + " ATKT in 2nd Semester");
                                    System.out.println("\tAfter 4th semester You have " + count_sem3atkt
                                            + " ATKT in 3rd Semester\n" + RESET);
                                    s = 1;
                                    atkt = count_sem1atkt;
                                    semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks, atkt,
                                            aTsem1atkt);
                                    s = 2;
                                    atkt = count_sem1atkt + count_sem2atkt;
                                    semesterResult(sem2subjects, sname, fname, roll_num, course, s, sem2marks, atkt,
                                            aTsem2atkt);
                                    s = 3;
                                    atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt;
                                    semesterResult(sem3subjects, sname, fname, roll_num, course, s, sem3marks, atkt,
                                            aTsem3atkt);
                                    s = 4;
                                    atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt;
                                    semesterResult(sem4subjects, sname, fname, roll_num, course, s, sem4marks, atkt,
                                            aTsem4atkt);
                                    if (count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt >= 3) {
                                        System.out.println(RED
                                                + "\n\t!!!Warning!!!\n\t*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                                + RESET);
                                        /* First sem atkt */
                                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\tPlease Enter 1st Semester ATKT Marks : " + RESET);
                                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt,
                                                    aTsem1atkt);
                                        }
                                        /* Second sem atkt */
                                        if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : " + RESET);
                                            count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt,
                                                    aTsem2atkt);
                                        }
                                        /* Third sem ATKT */
                                        if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : " + RESET);
                                            count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt,
                                                    aTsem3atkt);
                                        }
                                        continue;
                                    } else {
                                        /* 5th semester */
                                        System.out.println(
                                                GREEN + "\t---: Congrats You are prumoted for 5th Semester Exam :---"
                                                        + RESET);
                                        /* First sem atkt */
                                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                            aTsem1atkt++;
                                            System.out.println(
                                                    BLUE + "\tPlease Enter 1st Semester ATKT Marks : " + RESET);
                                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt,
                                                    aTsem1atkt);
                                        }
                                        /* Second sem atkt */
                                        if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                            aTsem2atkt++;
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : " + RESET);
                                            count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt,
                                                    aTsem2atkt);
                                        }
                                        /* Third sem ATKT */
                                        if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                            aTsem3atkt++;
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : " + RESET);
                                            count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt,
                                                    aTsem3atkt);
                                        }
                                        /* 4th Sem ATKT */
                                        if (count_sem4atkt > 0 && count_sem4atkt <= 2) {
                                            aTsem4atkt++;
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 4th Semester ATKT Marks : " + RESET);
                                            count_sem4atkt = atktExam(sem4subjects, sem4atkt, sem4marks, count_sem4atkt,
                                                    aTsem4atkt);
                                        }
                                        /* 5th Sem main exam starts */
                                        aTsem5atkt++;
                                        do {
                                            count_sem5atkt = 0;
                                            System.out.println(
                                                    BLUE + "\n\tPlease enter the marks of 5th semester main exam : "
                                                            + RESET);
                                            count_sem5atkt = semesterExam(sem5subjects, sem5atkt, sem5marks,
                                                    count_sem5atkt);
                                            System.out.println(YELLOW + "\n\tYou have " + count_sem5atkt
                                                    + " ATKT in 5th Semester");
                                            System.out.println("\tAfter 5th semester You have " + count_sem1atkt
                                                    + " ATKT in 1st Semester");
                                            System.out.println("\tAfter 5th semester You have " + count_sem2atkt
                                                    + " ATKT in 2nd Semester");
                                            System.out.println("\tAfter 5th semester You have " + count_sem3atkt
                                                    + " ATKT in 3rd Semester");
                                            System.out.println("\tAfter 5th semester You have " + count_sem4atkt
                                                    + " ATKT in 4th Semester\n" + RESET);
                                            /* 5th semester main ends */
                                            s = 1;
                                            atkt = count_sem1atkt;
                                            semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks,
                                                    atkt, aTsem1atkt);
                                            s = 2;
                                            atkt = count_sem1atkt + count_sem2atkt;
                                            semesterResult(sem2subjects, sname, fname, roll_num, course, s, sem2marks,
                                                    atkt, aTsem2atkt);
                                            s = 3;
                                            atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt;
                                            semesterResult(sem3subjects, sname, fname, roll_num, course, s, sem3marks,
                                                    atkt, aTsem3atkt);
                                            s = 4;
                                            atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt;
                                            semesterResult(sem4subjects, sname, fname, roll_num, course, s, sem4marks,
                                                    atkt, aTsem4atkt);
                                            s = 5;
                                            atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt
                                                    + count_sem5atkt;
                                            semesterResult(sem5subjects, sname, fname, roll_num, course, s, sem5marks,
                                                    atkt, aTsem5atkt);
                                            if (count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt
                                                    + count_sem5atkt >= 3) {
                                                System.out.println(RED
                                                        + "\n\t!!!Warning!!!\n*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                                        + RESET);
                                                /* First sem atkt */
                                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                                    System.out.println(
                                                            BLUE + "\tPlease Enter 1st Semester ATKT Marks : " + RESET);
                                                    count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks,
                                                            count_sem1atkt, aTsem1atkt);
                                                }
                                                /* Second sem atkt */
                                                if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                                    System.out.println(BLUE
                                                            + "\n\tPlease Enter 2nd Semester ATKT Marks : " + RESET);
                                                    count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks,
                                                            count_sem2atkt, aTsem2atkt);
                                                }
                                                /* Third sem ATKT */
                                                if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                                    System.out.println(BLUE
                                                            + "\n\tPlease Enter 3rd Semester ATKT Marks : " + RESET);
                                                    count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks,
                                                            count_sem3atkt, aTsem3atkt);
                                                }
                                                /* 4th Sem ATKT */
                                                if (count_sem4atkt > 0 && count_sem4atkt <= 2) {
                                                    System.out.println(BLUE
                                                            + "\n\tPlease Enter 4th Semester ATKT Marks : " + RESET);
                                                    count_sem4atkt = atktExam(sem4subjects, sem4atkt, sem4marks,
                                                            count_sem4atkt, aTsem4atkt);
                                                }
                                                continue;
                                            } else {
                                                System.out.println(GREEN
                                                        + "\n\t---: Congrats You are Promoted to 6th Semester Exam :---\n"
                                                        + RESET); /* 1st sem atkt start */

                                                aTsem6atkt++;
                                                do {
                                                    if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                                        aTsem1atkt++;
                                                        System.out.println(BLUE
                                                                + "\tPlease Enter 1st Semester ATKT Marks : " + RESET);
                                                        count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks,
                                                                count_sem1atkt, aTsem1atkt);
                                                        s = 1;
                                                        atkt = count_sem1atkt;
                                                        semesterResult(sem1subjects, sname, fname, roll_num, course, s,
                                                                sem1marks, atkt, aTsem1atkt);
                                                    }
                                                    /* Second sem atkt */
                                                    if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                                        aTsem2atkt++;
                                                        System.out.println(
                                                                BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                                                        + RESET);
                                                        count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks,
                                                                count_sem2atkt, aTsem2atkt);
                                                        s = 2;
                                                        atkt = count_sem1atkt + count_sem2atkt;
                                                        semesterResult(sem2subjects, sname, fname, roll_num, course, s,
                                                                sem2marks, atkt, aTsem2atkt);
                                                    }
                                                    /* Third sem ATKT */
                                                    if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                                        aTsem3atkt++;
                                                        System.out.println(
                                                                BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                                                        + RESET);
                                                        count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks,
                                                                count_sem3atkt, aTsem3atkt);
                                                        s = 3;
                                                        atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt;
                                                        semesterResult(sem3subjects, sname, fname, roll_num, course, s,
                                                                sem3marks, atkt, aTsem3atkt);
                                                    }
                                                    /* 4th Sem ATKT */
                                                    if (count_sem4atkt > 0 && count_sem4atkt <= 2) {
                                                        aTsem4atkt++;
                                                        System.out.println(
                                                                BLUE + "\n\tPlease Enter 4th Semester ATKT Marks : "
                                                                        + RESET);
                                                        count_sem4atkt = atktExam(sem4subjects, sem4atkt, sem4marks,
                                                                count_sem4atkt, aTsem4atkt);
                                                        s = 4;
                                                        atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt
                                                                + count_sem4atkt;
                                                        semesterResult(sem4subjects, sname, fname, roll_num, course, s,
                                                                sem4marks, atkt, aTsem4atkt);
                                                    }
                                                    /* 5th sem atkt starts */
                                                    if (count_sem5atkt > 0 && count_sem5atkt <= 2) {
                                                        aTsem5atkt++;
                                                        System.out.println(
                                                                BLUE + "\n\tPlease Enter 5th Semester ATKT Marks : "
                                                                        + RESET);
                                                        count_sem5atkt = atktExam(sem5subjects, sem5atkt, sem5marks,
                                                                count_sem5atkt, aTsem5atkt);
                                                        s = 5;
                                                        atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt
                                                                + count_sem4atkt + count_sem5atkt;
                                                        semesterResult(sem5subjects, sname, fname, roll_num, course, s,
                                                                sem5marks, atkt, aTsem5atkt);
                                                    }
                                                    count_sem6atkt = 0;
                                                    System.out.println(BLUE
                                                            + "\n\tEnter marks of 6th semester main exam : " + RESET);
                                                    count_sem6atkt = semesterExam(sem6subjects, sem6atkt, sem6marks,
                                                            count_sem6atkt);
                                                    System.out.println(YELLOW + "\n\tYou have " + count_sem6atkt
                                                            + " ATKT in 6th Semester");
                                                    System.out.println("\tAfter 6th semester You have " + count_sem1atkt
                                                            + " ATKT in 1st Semester");
                                                    System.out.println("\tAfter 6th semester You have " + count_sem2atkt
                                                            + " ATKT in 2nd Semester");
                                                    System.out.println("\tAfter 6th semester You have " + count_sem3atkt
                                                            + " ATKT in 3rd Semester");
                                                    System.out.println("\tAfter 6th semester You have " + count_sem4atkt
                                                            + " ATKT in 4th Semester");
                                                    System.out.println("\tAfter 6th semester You have " + count_sem5atkt
                                                            + " ATKT in 5th Semester\n" + RESET);
                                                    s = 1;
                                                    atkt = count_sem1atkt;
                                                    semesterResult(sem1subjects, sname, fname, roll_num, course, s,
                                                            sem1marks, atkt, aTsem1atkt);
                                                    s = 2;
                                                    atkt = count_sem1atkt + count_sem2atkt;
                                                    semesterResult(sem2subjects, sname, fname, roll_num, course, s,
                                                            sem2marks, atkt, aTsem2atkt);
                                                    s = 3;
                                                    atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt;
                                                    semesterResult(sem3subjects, sname, fname, roll_num, course, s,
                                                            sem3marks, atkt, aTsem3atkt);
                                                    s = 4;
                                                    atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt
                                                            + count_sem4atkt;
                                                    semesterResult(sem4subjects, sname, fname, roll_num, course, s,
                                                            sem4marks, atkt, aTsem4atkt);
                                                    s = 5;
                                                    atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt
                                                            + count_sem4atkt + count_sem5atkt;
                                                    semesterResult(sem5subjects, sname, fname, roll_num, course, s,
                                                            sem5marks, atkt, aTsem5atkt);
                                                    s = 6;
                                                    atkt = count_sem1atkt + count_sem2atkt + count_sem3atkt
                                                            + count_sem4atkt + count_sem5atkt + count_sem6atkt;
                                                    semesterResult(sem6subjects, sname, fname, roll_num, course, s,
                                                            sem6marks, count_sem6atkt, aTsem6atkt);
                                                    if (count_sem1atkt + count_sem2atkt + count_sem3atkt
                                                            + count_sem4atkt + count_sem5atkt + count_sem6atkt >= 3) {
                                                        System.out.println(RED
                                                                + "\n\t!!!Warning!!!\n*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                                                + RESET);
                                                        continue;
                                                    } else {
                                                        /* First sem atkt */
                                                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\tPlease Enter 1st Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks,
                                                                    count_sem1atkt, aTsem1atkt);
                                                        }
                                                        /* Second sem atkt */
                                                        if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks,
                                                                    count_sem2atkt, aTsem2atkt);
                                                        }
                                                        /* Third sem ATKT */
                                                        if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks,
                                                                    count_sem3atkt, aTsem3atkt);
                                                        }
                                                        /* 4th Sem ATKT */
                                                        if (count_sem4atkt > 0 && count_sem4atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 4th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem4atkt = atktExam(sem4subjects, sem4atkt, sem4marks,
                                                                    count_sem4atkt, aTsem4atkt);
                                                        }
                                                        /* 5th sem atkt starts */
                                                        if (count_sem5atkt > 0 && count_sem5atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 5th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem5atkt = atktExam(sem5subjects, sem5atkt, sem5marks,
                                                                    count_sem5atkt, aTsem5atkt);
                                                        }
                                                        /* 6th sem atkt starts */
                                                        if (count_sem6atkt > 0 && count_sem6atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 6th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem6atkt = atktExam(sem6subjects, sem6atkt, sem6marks,
                                                                    count_sem6atkt, aTsem6atkt);
                                                        }
                                                        if (count_sem1atkt > 0 || count_sem2atkt > 0
                                                                || count_sem3atkt > 0 || count_sem4atkt > 0
                                                                || count_sem5atkt > 0 || count_sem6atkt > 0) {
                                                            System.out.println(
                                                                    YELLOW + "\t\t\tLAST CHANCE FOR ATKT EXAM" + RESET);
                                                        }
                                                        /* First sem atkt */
                                                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\tPlease Enter 1st Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks,
                                                                    count_sem1atkt, aTsem1atkt);
                                                        }
                                                        /* Second sem atkt */
                                                        if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks,
                                                                    count_sem2atkt, aTsem2atkt);
                                                        }
                                                        /* Third sem ATKT */
                                                        if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem3atkt = atktExam(sem3subjects, sem3atkt, sem3marks,
                                                                    count_sem3atkt, aTsem3atkt);
                                                        }
                                                        /* 4th Sem ATKT */
                                                        if (count_sem4atkt > 0 && count_sem4atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 4th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem4atkt = atktExam(sem4subjects, sem4atkt, sem4marks,
                                                                    count_sem4atkt, aTsem4atkt);
                                                        }
                                                        /* 5th sem atkt starts */
                                                        if (count_sem5atkt > 0 && count_sem5atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 5th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem5atkt = atktExam(sem5subjects, sem5atkt, sem5marks,
                                                                    count_sem5atkt, aTsem5atkt);
                                                        }
                                                        /* 6th sem atkt starts */
                                                        if (count_sem6atkt > 0 && count_sem6atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 6th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem6atkt = atktExam(sem6subjects, sem6atkt, sem6marks,
                                                                    count_sem6atkt, aTsem6atkt);
                                                        }
                                                        if (count_sem1atkt > 0 || count_sem2atkt > 0
                                                                || count_sem3atkt > 0 || count_sem4atkt > 0
                                                                || count_sem5atkt > 0 || count_sem6atkt > 0) {
                                                            System.out.println(RED
                                                                    + "\tYou have so many ATKT's Thats why you are not eligible for Continue Course.\n\t*Principle*"
                                                                    + RESET);
                                                            System.exit(0);
                                                        } else {
                                                            /* printing all Marksheet + degree+tc+migration */
                                                            String date1 = "";
                                                            String division1;
                                                            String session = "2023";
                                                            String syear;
                                                            String fyear;
                                                            String rN = String.valueOf(roll_num);
                                                            System.out.print("\n\n\tDo You want Your Degree? (y/n) : ");
                                                            char reply = sc.next().charAt(0);
                                                            if (reply == 'y' || reply == 'Y') {
                                                                System.out.print("\tEnter date for Degree : ");
                                                                date1 = sc.next();
                                                                System.out.println(YELLOW
                                                                        + "--------------------------------------------------------- "
                                                                        + RESET);
                                                                System.out.print("\tEnter division1 for Degree : ");
                                                                division1 = sc.next();
                                                                System.out.println(YELLOW
                                                                        + "--------------------------------------------------------- "
                                                                        + RESET);
                                                                degree(sname, date1, division1);
                                                            }
                                                            System.out.print("\n\n\tDo You want Your TC? (y/n) : ");
                                                            reply = sc.next().charAt(0);
                                                            if (reply == 'y' || reply == 'Y') {
                                                                System.out.print("\tEnter starting year for TC : ");
                                                                syear = sc.next();
                                                                System.out.println(YELLOW
                                                                        + "--------------------------------------------------------- "
                                                                        + RESET);
                                                                System.out.print("\tEnter ending year for TC : ");
                                                                fyear = sc.next();
                                                                System.out.println(YELLOW
                                                                        + "--------------------------------------------------------- "
                                                                        + RESET);
                                                                tC(sname, fname, mname, rN, entN, status, date1, syear,
                                                                        fyear);
                                                            }
                                                            System.out.print(
                                                                    "\n\n\tDo You want Your Migration? (y/n) : ");
                                                            reply = sc.next().charAt(0);
                                                            if (reply == 'y' || reply == 'Y') {
                                                                System.out.print("\tEnter session for Migration : ");
                                                                session = sc.next();
                                                                System.out.println(YELLOW
                                                                        + "--------------------------------------------------------- "
                                                                        + RESET);
                                                                migrationC(sname, roll_num, entN, status, session,
                                                                        date1);
                                                            } else {
                                                                System.out.println(GREEN
                                                                        + " \t\t\tOk \n\t.....Thanks for Visiting.....");
                                                            }

                                                        }
                                                    }
                                                } while (count_sem6atkt >= 1);
                                            }
                                        } while (count_sem5atkt >= 1);
                                    }
                                } while (count_sem4atkt >= 1);
                            }
                        } while (count_sem3atkt >= 1);
                    }
                } while (count_sem2atkt >= 1);
            }
        } while (count_sem1atkt >= 1);
    }
}