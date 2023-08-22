import java.util.Scanner;

class Marksheet5 {

    // ----------------------------------------------------------result------------------------------------------------------------
    public static void result(String semSub[], byte semMarks[], boolean semAtkt[], byte countAtkt) {

    }

    // ----------------------------------------------------------check-marks-----------------------------------------------------------
    public static byte mainExam(String sem1Sub[], byte sem1Marks[], boolean sem1Atkt[], byte count1_atkt,
            Scanner sc) {
        for (int i = 0; i < sem1Marks.length; i++) {
            if (i < 6) {
                System.out.printf("\t Enter " + sem1Sub[i] + " marks: \n\t ");
                sem1Marks[i] = sc.nextByte();
                if (sem1Marks[i] > 50 || sem1Marks[i] < 0) {
                    System.out.printf("\t Invalid marks plz re-enter " + sem1Sub[i] + " marks: \n\t ");
                    i--;
                    continue;
                }
                if (sem1Marks[i] < 22) {
                    count1_atkt++;
                } else {
                    sem1Atkt[i] = true;
                }
            } else {
                System.out.printf("\t Enter " + sem1Sub[i] + " marks: \n\t ");
                sem1Marks[i] = sc.nextByte();
                if (sem1Marks[i] > 25 && sem1Marks[i] < 0) {
                    System.out.printf("\t Invalid marks plz re-enter " + sem1Sub[i] + " marks: \n\t ");
                    i--;
                    continue;
                }
                if (sem1Marks[i] < 12) {
                    count1_atkt++;
                } else {
                    sem1Atkt[i] = true;
                }

            }
        }
        return count1_atkt;
    }

    // ------------------------------------------------------------main-method---------------------------------------------------------
    public static void main(String[] args) {

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

        // check Atkt array:
        boolean sem1Atkt[] = new boolean[8];
        boolean sem2Atkt[] = new boolean[8];
        boolean sem3Atkt[] = new boolean[8];
        boolean sem4Atkt[] = new boolean[8];
        boolean sem5Atkt[] = new boolean[8];
        boolean sem6Atkt[] = new boolean[8];

        Scanner sc = new Scanner(System.in);

        // Input basic information :
        System.out.printf("\t Enter your name:  ");
        String s_Name = sc.nextLine();
        System.out.printf("\t Father name: ");
        String f_Name = sc.nextLine();
        System.out.printf("\t Mother name: ");
        String m_Name = sc.nextLine();
        System.out.printf("\t Roll number: ");
        int roll_No = sc.nextInt();
        sc.nextLine();
        System.out.printf("\t Enrollment number: ");
        String enrollmentNum = sc.nextLine();
        String status;

        // check and enter status:
        boolean flag = false;
        do {
            System.out.printf("\t status: ");
            status = sc.nextLine();
            if (status.equals("Private") || status.equals("private") || status.equals("Regular")
                    || status.equals("regular")) {
                break;
            } else {
                System.out.printf("\t Type only: (regular / private)");
                flag = true;
            }
        } while (flag);

        // check atkt
        byte count1_atkt = 0, count2_atkt = 0, count3_atkt = 0, count4_atkt = 0, count5_atkt = 0, count6_atkt = 0;
        byte atsem1, atsem2, atsem3, atsem4, atsem5, atsem6;
        byte atkt = 0;

        // enter marks:
        do {
            System.out.println(
                    "\n-----------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t 1st semester \t");
            System.out.println(
                    "-----------------------------------------------------------------------------------------------\n");

            // check marks of semester -1
            atsem1 = 1;
            count1_atkt = mainExam(sem1Sub, sem1Marks, sem1Atkt, count1_atkt, sc);
            System.out.println();
            // result marks of semester -1
            result(sem1Sub, sem1Marks, sem1Atkt, atkt);
            atkt = count1_atkt;
            atsem1 = 1;
            if (count1_atkt > 2) {
                System.out.println("Year-back \n");
                continue;
            }
            else{
                System.out.println("\t\t\t Congractulation you promoted to 2nd semester: \t");
                // count2_atkt = mainExam(sem1Sub, sem1Marks, sem1Atkt, count2_atkt,sc);
               if((count1_atkt >= 0 && count1_atkt <= 2)){
                 System.out.printf("\t 1st semester Atkt marks: \n\t ");
                // count1_atkt = atktExam(sem1Sub, sem1Marks, sem1Atkt, count1_atkt, sc);
               }
            }

        } while (atkt >= 3);
    }
}