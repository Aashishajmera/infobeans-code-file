import java.util.Scanner;

class Marksheet5 {

  static String setRed = "\u001B[31m";
  static String resetRed = "\u001B[0m";
  static String setBlue = "\u001B[34m";
  static String endBlue = "\u001B[0m";
  static String setGreen = "\u001B[32m";
  static String endGreen = "\u001B[0m";

  // ----------------------------------------------------------Marksheet------------------------------------------------------------
  public static void marksheetResult(
    String semSub[],
    byte semMarks[],
    boolean semAtkt[],
    byte atsem,
    byte semester,
    String s_Name,
    String f_Name,
    String m_Name,
    String roll_num,
    String enrollment_no,
    String status,
    short totalNumber,
    String result
  ) {
    // count total number
    for (int i = 0; i < semMarks.length; i++) {
      totalNumber += semMarks[i];
    }

    // check atkt
    // String atkt = " ";
    // for (int i = 0; i < semAtkt.length; i++) {
    // if (semAtkt[i]) {
    // atkt = "ATKT";
    // } else {

    // }
    // }

    String atkt[] = new String[8];
    for (int i = 0; i < semMarks.length; i++) {
      if (i < 6) {
        if (semMarks[i] < 22) {
          atkt[i] = "ATKT";
        } else {
          atkt[i] = " ";
        }
      } else {
        if (semMarks[i] < 12) {
          atkt[i] = "ATKT";
        } else {
          atkt[i] = " ";
        }
      }
    }

    System.out.println(
      "=======================================================================================================================\n"
    );
    System.out.println(
      "\t\t\t\t\t DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)"
    );
    System.out.println(
      "\t\t\t\t\t     MAIN-EXAMINATION  B.C.A SEM - " + semester
    );
    System.out.println(
      "\n=======================================================================================================================\n"
    );
    System.out.printf(
      "\t Name: %-20s\t\t\t\t\t\t\t Roll No: %-20s \n",
      s_Name,
      roll_num
    );
    System.out.printf(
      "\t Father Name: %-20s\t\t\t\t\t\t Enrollment No: %-20s\n",
      f_Name,
      enrollment_no
    );
    System.out.printf(
      "\t Mother Name: %-20s\t\t\t\t\t\t Status: %-20s\n",
      m_Name,
      status
    );
    System.out.println(
      "\n=======================================================================================================================\n"
    );
    System.out.println(
      "\t Subject \t\t\t Maximum \t\t\t Minimum \t\t\t Obtained \n"
    );
    System.out.println(
      "\t " +
      semSub[0] +
      "\t\t\t\t   50 \t\t\t\t   22 \t\t\t\t    " +
      semMarks[0] +
      "\t" +
      setRed +
      atkt[0] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[1] +
      "\t\t\t\t   50 \t\t\t\t   22 \t\t\t\t    " +
      semMarks[1] +
      "\t" +
      setRed +
      atkt[1] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[2] +
      "\t\t\t\t   50 \t\t\t\t   22 \t\t\t\t    " +
      semMarks[2] +
      "\t" +
      setRed +
      atkt[2] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[3] +
      "\t\t\t\t   50 \t\t\t\t   22 \t\t\t\t    " +
      semMarks[3] +
      "\t" +
      setRed +
      atkt[3] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[4] +
      "\t\t\t   50 \t\t\t\t   22 \t\t\t\t    " +
      semMarks[4] +
      "\t" +
      setRed +
      atkt[4] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[5] +
      "\t\t\t   50 \t\t\t\t   22 \t\t\t\t    " +
      semMarks[5] +
      "\t" +
      setRed +
      atkt[5] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[6] +
      "\t\t\t\t   25 \t\t\t\t   12 \t\t\t\t    " +
      semMarks[6] +
      "\t" +
      setRed +
      atkt[6] +
      resetRed
    );
    System.out.println(
      "\t " +
      semSub[7] +
      "\t\t\t\t   25 \t\t\t\t   12 \t\t\t\t    " +
      semMarks[7] +
      "\t" +
      setRed +
      atkt[7] +
      resetRed
    );
    System.out.println(
      "\n======================================================================================================================="
    );
    System.out.println(
      "\t\t\t\t\tTotal-350 \t\t\t\t\t\t\tTotal obt. " + totalNumber
    );
    System.out.println(
      "\t Result - " + result + "\t\t\t\t\t\t\t\t\t\t\t Attempt - " + atsem
    );
    System.out.println(
      "=======================================================================================================================\n"
    );
    System.out.println(
      "-----------------------------------------------------------------------------------------------------------------------\n"
    );
    System.out.println("\n\n");
  }

  // ---------------------------------------------------------atktExam------------------------------------------------------------
  public static byte atktExam(
    String semSub[],
    byte semMarks[],
    boolean semAtkt[],
    byte countAtkt,
    Scanner sc
  ) {
    for (int i = 0; i < semAtkt.length; i++) {
      if (i < 6) {
        if (semAtkt[i]) {
          System.out.printf("\t Enter " + semSub[i] + " marks: \n\t ");
          semMarks[i] = sc.nextByte();

          if (semMarks[i] < 0 || semMarks[i] >= 50) {
            System.out.printf(
              setRed +
              "\t Invalid  marks please re-enter valid marks: \n\t " +
              resetRed
            );
            i--;
            continue;
          }
          if (semMarks[i] >= 22) {
            semAtkt[i] = false;
            countAtkt--;
          }
          if (semMarks[i] < 22) {
            semAtkt[i] = true;
            // countAtkt--;
          }
        }
      } else {
        if (semAtkt[i]) {
          System.out.printf("\t Enter " + semSub[i] + " marks: \n\t ");
          semMarks[i] = sc.nextByte();

          if (semMarks[i] < 0 || semMarks[i] >= 25) {
            System.out.printf(
              setRed +
              "\t Invalid  marks please re-enter valid marks: \n\t " +
              resetRed
            );
            i--;
            continue;
          }
          if (semMarks[i] >= 12) {
            semAtkt[i] = false;
            countAtkt--;
          }
          if (semMarks[i] < 12) {
            semAtkt[i] = true;
            // countAtkt++;
          }
        }
      }
    }
    return countAtkt;
  }

  // --------------------------------------------check-marks(MAIN-EXAM)---------------------------------------------------------
  public static byte mainExam(
    String sem1Sub[],
    byte sem1Marks[],
    boolean sem1Atkt[],
    byte count1_atkt,
    Scanner sc
  ) {
    for (int i = 0; i < sem1Marks.length; i++) {
      if (i < 6) {
        System.out.printf("\t Enter " + sem1Sub[i] + " marks out of 50: \n\t ");
        sem1Marks[i] = sc.nextByte();
        if (sem1Marks[i] > 50 || sem1Marks[i] < 0) {
          System.out.printf(
            setRed +
            "\t Invalid marks plz re-enter " +
            sem1Sub[i] +
            " marks: \n\t " +
            resetRed
          );
          i--;
          continue;
        }
        if (sem1Marks[i] < 22) {
          count1_atkt++;
          sem1Atkt[i] = true;
        } else {
          sem1Atkt[i] = false;
        }
      } else {
        System.out.printf("\t Enter " + sem1Sub[i] + " marks out of 25: \n\t ");
        sem1Marks[i] = sc.nextByte();
        if (sem1Marks[i] > 25 || sem1Marks[i] < 0) {
          System.out.printf(
            setRed +
            "\t Invalid marks plz re-enter " +
            sem1Sub[i] +
            " marks: \n\t " +
            resetRed
          );
          i--;
          continue;
        }
        if (sem1Marks[i] < 12) {
          count1_atkt++;
          sem1Atkt[i] = true;
        } else {
          sem1Atkt[i] = false;
        }
      }
    }
    return count1_atkt;
  }

  // ----------------------------------------------------------check-result----------------------------------------------------------
  public static String checkResult(byte totalAktk, String checkResult) {
    if (totalAktk <= 2) {
      checkResult = (setGreen + "PASS" + endGreen);
    } else {
      checkResult = (setRed + "FAIL" + resetRed);
    }
    return checkResult;
  }

  // ------------------------------------------------------way-atkt-------------------------------------------------------------
  public static byte wayAtkt(
    String semSub[],
    byte semMarks[],
    boolean semAtkt[],
    byte totalAtkt,
    byte semester,
    byte countAtkt,
    String result,
    byte atsem,
    Scanner sc
  ) {
    System.out.println(
      setRed +
      "\t\t\t\t\t you have " +
      countAtkt +
      " atkt in " +
      semester +
      " semester: " +
      resetRed
    );
    result = checkResult(totalAtkt, result);
    atsem++;

    return atktExam(semSub, semMarks, semAtkt, countAtkt, sc);
  }

  // ------------------------------------------------------------Degree---------------------------------------------------------
  public static void degree(String date, String s_Name) {
    System.out.println(
      "\t\t\t *************************** Degree ***************************"
    );

    System.out.println(
      "\n\n\t\t===================================================================================\n"
    );
    System.out.println(
      "\t\t\t\t DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\n"
    );
    System.out.println("\t\t\t\t   Bachelor of compute Application\n\n");
    System.out.println(
      "\t\t\t Certified Certified that " +
      s_Name +
      " obtained the Degree of \n \t\t\t BACHELOR OF COMPUTER APPLICATION in this University at the \n \t\t\t Examination held in " +
      date +
      " and was placed in the 1 Division.\n"
    );

    System.out.println(
      "\t\t====================================================================================\n\n\n\n"
    );
  }

  // ------------------------------------------------------------Migration---------------------------------------------------------

  public static void migration(
    String date,
    String s_Name,
    String enrollment_no
  ) {
    System.out.println(
      "\t\t\t *************************** MIGRATION ***************************"
    );
    System.out.println(
      "\n\n\t\t====================================================================================\n"
    );
    System.out.println(
      "\t\t\t\t DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\n"
    );
    System.out.println("\t\t\t\t  MIGRATION CERTIFICATE - " + date + "\n");

    System.out.println(
      "\t\t\t\t Mr/Miss " +
      s_Name +
      " Entrolment No. " +
      enrollment_no +
      " \n \t\t\t is informed that this University has no Objection to his/ her\n \t\t\t migrating to another University.He/ She has 10198777 as a regular\n \t\t\t student  at Bachelor of Computer Application  Examination."
    );

    System.out.println(
      "\n\n\n\t\t\t UNIVERSITY HOUSE\t\t\t\t ================= \n\t\t\t INDORE-455332\t\t\t\t\t      D.A.V.V \n\t\t\t Date-" +
      date +
      "\t\t\t\t ================="
    );
    System.out.println(
      "\t\t====================================================================================\n"
    );
  }

  // ------------------------------------------------------------main-method---------------------------------------------------------
  public static void main(String[] args) {
    // semester subject array:
    String sem1Sub[] = {
      "Java",
      "Python",
      "MYsql",
      "Hindi",
      "Vocational-1",
      "Vocational-2",
      "Lab-1",
      "Lab-2",
    };
    String sem2Sub[] = {
      "c++",
      "Python",
      "PHP",
      "Hindi",
      "Vocational-1",
      "Vocational-2",
      "Lab-1",
      "Lab-2",
    };
    String sem3Sub[] = {
      "Java",
      "Python",
      "php",
      "Hindi",
      "Vocational-1",
      "Vocational-2",
      "Lab-1",
      "Lab-2",
    };
    String sem4Sub[] = {
      "Java",
      "Python",
      "MYsql",
      "Hindi",
      "Vocational-1",
      "Vocational-2",
      "Lab-1",
      "Lab-2",
    };
    String sem5Sub[] = {
      "Java",
      "Python",
      "MYsql",
      "Hindi",
      "Vocational-1",
      "Vocational-2",
      "Lab-1",
      "Lab-2",
    };
    String sem6Sub[] = {
      "Java",
      "Python",
      "MYsql",
      "Hindi",
      "Vocational-1",
      "Vocational-2",
      "Lab-1",
      "Lab-2",
    };

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
    String roll_No = sc.nextLine();
    System.out.printf("\t Enrollment number: ");
    String enrollmentNum = sc.nextLine();
    String status;
    short totalNumber = 0;

    // check and enter status:
    boolean flag = false;
    do {
      System.out.printf("\t status: ");
      status = sc.nextLine();
      if (
        status.equals("Private") ||
        status.equals("private") ||
        status.equals("Regular") ||
        status.equals("regular")
      ) {
        break;
      } else {
        System.out.printf(
          setRed + "\t Type only: (regular / private) \n " + resetRed
        );
        flag = true;
      }
    } while (flag);

    // check atkt
    byte count1_atkt = 0, count2_atkt = 0, count3_atkt = 0, count4_atkt =
      0, count5_atkt = 0, count6_atkt = 0;
    byte atsem1 = 0, atsem2 = 0, atsem3 = 0, atsem4 = 0, atsem5 = 0, atsem6 = 0;
    byte totalAktk1 = 0, totalAktk2 = 0, totalAktk3 = 0, totalAktk4 =
      0, totalAktk5 = 0, totalAktk6 = 0;
    byte semester = 0;
    String result = "";
    atsem1 = 1;

    // enter marks:
    do {
      System.out.println(
        "\n-----------------------------------------------------------------------------------------------------------------------"
      );
      System.out.println(
        setBlue + "\t\t\t\t\t\t     1 st semester \t" + endBlue
      );
      System.out.println(
        "-----------------------------------------------------------------------------------------------------------------------\n"
      );

      // check marks of semester -1
      count1_atkt = 0;
      totalAktk1 = 0;
      count1_atkt = mainExam(sem1Sub, sem1Marks, sem1Atkt, count1_atkt, sc);
      totalAktk1 = count1_atkt;
      System.out.println();

      // check result
      result = checkResult(totalAktk1, result);
      semester = 1;
      // marksheet 1st semester:
      marksheetResult(
        sem1Sub,
        sem1Marks,
        sem1Atkt,
        atsem1,
        semester,
        s_Name,
        f_Name,
        m_Name,
        roll_No,
        enrollmentNum,
        status,
        totalNumber,
        result
      );

      if (totalAktk1 > 2) {
        System.out.println(
          setRed +
          "\t\t\t\t\t\t   " +
          totalAktk1 +
          " atkt in 1st semester " +
          resetRed
        );
        System.out.println(
          setRed + "\t\t\t\t\t\t     !! Sem-Back !! " + resetRed
        );
        atsem1++;
        continue;
      } else {
        System.out.println(
          setGreen +
          "\t\t\t\t\t Congractulation you promoted to 2nd semester: \n\t" +
          endBlue
        );
        if ((totalAktk1 > 0 && totalAktk1 <= 2)) {
          semester = 1;
          count1_atkt =
            wayAtkt(
              sem1Sub,
              sem1Marks,
              sem1Atkt,
              totalAktk1,
              semester,
              count1_atkt,
              result,
              atsem1,
              sc
            );
        }
        atsem2++;

        do {
          System.out.println(
            "\n-----------------------------------------------------------------------------------------------------------------------"
          );
          System.out.println(
            setBlue + "\t\t\t\t\t\t     2nd semester \t" + endBlue
          );
          System.out.println(
            "-----------------------------------------------------------------------------------------------------------------------\n"
          );
          semester = 2;
          count2_atkt = 0;
          count2_atkt = mainExam(sem2Sub, sem2Marks, sem2Atkt, count2_atkt, sc);
          totalAktk2 = (byte) (count2_atkt + count1_atkt);

          // first semester result:
          semester = 1;
          result = checkResult(totalAktk1, result);
          marksheetResult(
            sem1Sub,
            sem1Marks,
            sem1Atkt,
            atsem1,
            semester,
            s_Name,
            f_Name,
            m_Name,
            roll_No,
            enrollmentNum,
            status,
            totalNumber,
            result
          );

          // second semester result:
          semester = 2;
          result = checkResult(totalAktk2, result);
          marksheetResult(
            sem2Sub,
            sem2Marks,
            sem2Atkt,
            atsem2,
            semester,
            s_Name,
            f_Name,
            m_Name,
            roll_No,
            enrollmentNum,
            status,
            totalNumber,
            result
          );

          if (totalAktk2 > 2) {
            System.out.println(
              setRed +
              "\t\t\t\t\t         " +
              count2_atkt +
              " atkt in 2nd semester" +
              resetRed
            );
            System.out.println(
              setRed + "\t\t\t\t\t\t       Total atkt " + totalAktk2 + resetRed
            );
            System.out.println(
              setRed + "\t\t\t\t\t\t     !! Sem-Back !! " + resetRed
            );
            atsem2++;

            if (count1_atkt <= 2 && count1_atkt > 0) {
              semester = 1;
              count1_atkt =
                wayAtkt(
                  sem1Sub,
                  sem1Marks,
                  sem1Atkt,
                  totalAktk1,
                  semester,
                  count1_atkt,
                  result,
                  atsem1,
                  sc
                );
            }
            continue;
          } else {
            System.out.println(
              setGreen +
              "\t\t\t\t\t Congractulation you promoted to 3rd semester: \n\t" +
              endBlue
            );
            if (count1_atkt <= 2 && count1_atkt > 0) {
              semester = 1;
              count1_atkt =
                wayAtkt(
                  sem1Sub,
                  sem1Marks,
                  sem1Atkt,
                  totalAktk1,
                  semester,
                  count1_atkt,
                  result,
                  atsem1,
                  sc
                );
            }
            if (count2_atkt > 0 && count2_atkt <= 2) {
              semester = 2;
              count2_atkt =
                wayAtkt(
                  sem2Sub,
                  sem2Marks,
                  sem2Atkt,
                  totalAktk2,
                  semester,
                  count2_atkt,
                  result,
                  atsem2,
                  sc
                );
            }
            atsem3++;
            do {
              System.out.println(
                "\n-----------------------------------------------------------------------------------------------------------------------"
              );
              System.out.println(
                setBlue + "\t\t\t\t\t\t     3rd semester \t" + endBlue
              );
              System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------\n"
              );
              count3_atkt = 0;
              count3_atkt =
                mainExam(sem3Sub, sem3Marks, sem3Atkt, count3_atkt, sc);

              // 1st semester result:
              semester = 1;
              result = checkResult(count1_atkt, result);
              marksheetResult(
                sem1Sub,
                sem1Marks,
                sem1Atkt,
                atsem1,
                semester,
                s_Name,
                f_Name,
                m_Name,
                roll_No,
                enrollmentNum,
                status,
                totalNumber,
                result
              );

              // 2nd semester result:
              semester = 2;
              result = checkResult(count2_atkt, result);
              marksheetResult(
                sem2Sub,
                sem2Marks,
                sem2Atkt,
                atsem2,
                semester,
                s_Name,
                f_Name,
                m_Name,
                roll_No,
                enrollmentNum,
                status,
                totalNumber,
                result
              );

              // 3rd semester result:
              semester = 3;
              totalAktk3 = (byte) (count1_atkt + count2_atkt + count3_atkt);
              result = checkResult(totalAktk3, result);
              marksheetResult(
                sem3Sub,
                sem3Marks,
                sem3Atkt,
                atsem3,
                semester,
                s_Name,
                f_Name,
                m_Name,
                roll_No,
                enrollmentNum,
                status,
                totalNumber,
                result
              );

              // check 3rd semester atkt
              if (totalAktk3 > 2) {
                System.out.println(
                  setRed +
                  "\t\t\t\t\t        " +
                  count3_atkt +
                  " atkt in 3rd semester" +
                  resetRed
                );
                System.out.println(
                  setRed +
                  "\t\t\t\t\t\t      Total atkt " +
                  totalAktk3 +
                  resetRed
                );
                System.out.println(
                  setRed + "\t\t\t\t\t\t     !! Sem-Back !! " + resetRed
                );
                atsem3++;

                // 1st semester atktexam:
                if (count1_atkt <= 2 && count1_atkt > 0) {
                  semester = 1;
                  count1_atkt =
                    wayAtkt(
                      sem1Sub,
                      sem1Marks,
                      sem1Atkt,
                      totalAktk1,
                      semester,
                      count1_atkt,
                      result,
                      atsem1,
                      sc
                    );
                }
                // 2nd semester atkt exam
                if (count2_atkt <= 2 && count2_atkt > 0) {
                  semester = 2;
                  count2_atkt =
                    wayAtkt(
                      sem2Sub,
                      sem2Marks,
                      sem2Atkt,
                      totalAktk2,
                      semester,
                      count2_atkt,
                      result,
                      atsem2,
                      sc
                    );
                }

                continue;
              } else {
                System.out.println(
                  setGreen +
                  "\t\t\t\t\t Congractulation you promoted to 4th semester: \n\t" +
                  endBlue
                );

                // 1st semester atktexam:
                if (count1_atkt <= 2 && count1_atkt > 0) {
                  semester = 1;
                  count1_atkt =
                    wayAtkt(
                      sem1Sub,
                      sem1Marks,
                      sem1Atkt,
                      totalAktk1,
                      semester,
                      count1_atkt,
                      result,
                      atsem1,
                      sc
                    );
                }
                // 2nd semester atkt exam
                if (count2_atkt <= 2 && count2_atkt > 0) {
                  semester = 2;
                  count2_atkt =
                    wayAtkt(
                      sem2Sub,
                      sem2Marks,
                      sem2Atkt,
                      totalAktk2,
                      semester,
                      count2_atkt,
                      result,
                      atsem2,
                      sc
                    );
                }
                // 3rd semester atkt exam
                if (count3_atkt > 0 && count3_atkt <= 2) {
                  semester = 3;
                  count3_atkt =
                    wayAtkt(
                      sem3Sub,
                      sem3Marks,
                      sem3Atkt,
                      totalAktk3,
                      semester,
                      count3_atkt,
                      result,
                      atsem3,
                      sc
                    );
                }
                atsem4++;
                do {
                  System.out.println(
                    "\n-----------------------------------------------------------------------------------------------------------------------"
                  );
                  System.out.println(
                    setBlue + "\t\t\t\t\t\t     4th semester \t" + endBlue
                  );
                  System.out.println(
                    "-----------------------------------------------------------------------------------------------------------------------\n"
                  );
                  count4_atkt = 0;
                  // 4th semester exam:
                  count4_atkt =
                    mainExam(sem4Sub, sem4Marks, sem4Atkt, count4_atkt, sc);
                  totalAktk4 =
                    (byte) (
                      count1_atkt + count2_atkt + count3_atkt + count4_atkt
                    );

                  // 1st semester marksheet:
                  semester = 1;
                  result = checkResult(totalAktk1, result);
                  marksheetResult(
                    sem1Sub,
                    sem1Marks,
                    sem1Atkt,
                    atsem1,
                    semester,
                    s_Name,
                    f_Name,
                    m_Name,
                    roll_No,
                    enrollmentNum,
                    status,
                    totalNumber,
                    result
                  );

                  // 2nd semester exam:
                  semester = 2;
                  result = checkResult(totalAktk2, result);
                  marksheetResult(
                    sem2Sub,
                    sem2Marks,
                    sem2Atkt,
                    atsem2,
                    semester,
                    s_Name,
                    f_Name,
                    m_Name,
                    roll_No,
                    enrollmentNum,
                    status,
                    totalNumber,
                    result
                  );

                  // 3rd semester exam:
                  semester = 3;
                  result = checkResult(totalAktk3, result);
                  marksheetResult(
                    sem3Sub,
                    sem3Marks,
                    sem3Atkt,
                    atsem3,
                    semester,
                    s_Name,
                    f_Name,
                    m_Name,
                    roll_No,
                    enrollmentNum,
                    status,
                    totalNumber,
                    result
                  );

                  // 4th semester exam:
                  semester = 4;
                  totalAktk4 =
                    (byte) (
                      count1_atkt + count2_atkt + count3_atkt + count4_atkt
                    );
                  result = checkResult(totalAktk4, result);
                  marksheetResult(
                    sem4Sub,
                    sem4Marks,
                    sem4Atkt,
                    atsem4,
                    semester,
                    s_Name,
                    f_Name,
                    m_Name,
                    roll_No,
                    enrollmentNum,
                    status,
                    totalNumber,
                    result
                  );

                  if (totalAktk4 > 2) {
                    System.out.println(
                      setRed +
                      "\t\t\t\t\t        " +
                      count4_atkt +
                      " atkt in 4th semester" +
                      resetRed
                    );
                    System.out.println(
                      setRed +
                      "\t\t\t\t\t\t     Total atkt " +
                      totalAktk4 +
                      resetRed
                    );
                    System.out.println(
                      setRed + "\t\t\t\t\t\t     !! Sem-Back !! " + resetRed
                    );

                    atsem4++;

                    if (count1_atkt <= 2 && count1_atkt > 0) {
                      semester = 1;
                      count1_atkt =
                        wayAtkt(
                          sem1Sub,
                          sem1Marks,
                          sem1Atkt,
                          totalAktk1,
                          semester,
                          count1_atkt,
                          result,
                          atsem1,
                          sc
                        );
                    }
                    if (count2_atkt <= 2 && count2_atkt > 0) {
                      semester = 2;
                      count2_atkt =
                        wayAtkt(
                          sem2Sub,
                          sem2Marks,
                          sem2Atkt,
                          totalAktk2,
                          semester,
                          count2_atkt,
                          result,
                          atsem2,
                          sc
                        );
                    }
                    if (count3_atkt <= 2 && count3_atkt > 0) {
                      semester = 3;
                      count3_atkt =
                        wayAtkt(
                          sem3Sub,
                          sem3Marks,
                          sem3Atkt,
                          totalAktk3,
                          semester,
                          count3_atkt,
                          result,
                          atsem3,
                          sc
                        );
                    }
                    continue;
                  } else {
                    System.out.println(
                      setGreen +
                      "\t\t\t\t\t Congractulation you promoted to 5th semester: \n\t" +
                      endBlue
                    );

                    if (count1_atkt <= 2 && count1_atkt > 0) {
                      semester = 1;
                      count1_atkt =
                        wayAtkt(
                          sem1Sub,
                          sem1Marks,
                          sem1Atkt,
                          totalAktk1,
                          semester,
                          count1_atkt,
                          result,
                          atsem1,
                          sc
                        );
                    }
                    if (count2_atkt <= 2 && count2_atkt > 0) {
                      semester = 2;
                      count2_atkt =
                        wayAtkt(
                          sem2Sub,
                          sem2Marks,
                          sem2Atkt,
                          totalAktk2,
                          semester,
                          count2_atkt,
                          result,
                          atsem2,
                          sc
                        );
                    }
                    if (count3_atkt <= 2 && count3_atkt > 0) {
                      semester = 3;
                      count3_atkt =
                        wayAtkt(
                          sem3Sub,
                          sem3Marks,
                          sem3Atkt,
                          totalAktk3,
                          semester,
                          count3_atkt,
                          result,
                          atsem3,
                          sc
                        );
                    }
                    if (count4_atkt <= 2 && count4_atkt > 0) {
                      semester = 4;
                      count4_atkt =
                        wayAtkt(
                          sem4Sub,
                          sem4Marks,
                          sem4Atkt,
                          totalAktk4,
                          semester,
                          count4_atkt,
                          result,
                          atsem4,
                          sc
                        );
                    }
                    atsem5++;
                    do {
                      System.out.println(
                        "\n-----------------------------------------------------------------------------------------------------------------------"
                      );
                      System.out.println(
                        setBlue + "\t\t\t\t\t\t     5th semester \t" + endBlue
                      );
                      System.out.println(
                        "-----------------------------------------------------------------------------------------------------------------------\n"
                      );
                      semester = 5;
                      count5_atkt = 0;
                      count5_atkt =
                        mainExam(sem5Sub, sem5Marks, sem5Atkt, count5_atkt, sc);
                      totalAktk5 =
                        (byte) (
                          count5_atkt +
                          count4_atkt +
                          count3_atkt +
                          count2_atkt +
                          count1_atkt
                        );
                      result = checkResult(totalAktk5, result);

                      // 1st semester marksheet:
                      semester = 1;
                      result = checkResult(totalAktk1, result);
                      marksheetResult(
                        sem1Sub,
                        sem1Marks,
                        sem1Atkt,
                        atsem1,
                        semester,
                        s_Name,
                        f_Name,
                        m_Name,
                        roll_No,
                        enrollmentNum,
                        status,
                        totalNumber,
                        result
                      );

                      // 2nd semester exam:
                      semester = 2;
                      result = checkResult(totalAktk2, result);
                      marksheetResult(
                        sem2Sub,
                        sem2Marks,
                        sem2Atkt,
                        atsem2,
                        semester,
                        s_Name,
                        f_Name,
                        m_Name,
                        roll_No,
                        enrollmentNum,
                        status,
                        totalNumber,
                        result
                      );

                      // 3rd semester exam:
                      semester = 3;
                      result = checkResult(totalAktk3, result);
                      marksheetResult(
                        sem3Sub,
                        sem3Marks,
                        sem3Atkt,
                        atsem3,
                        semester,
                        s_Name,
                        f_Name,
                        m_Name,
                        roll_No,
                        enrollmentNum,
                        status,
                        totalNumber,
                        result
                      );

                      // 4th semester exam:
                      semester = 4;
                      result = checkResult(totalAktk4, result);
                      marksheetResult(
                        sem4Sub,
                        sem4Marks,
                        sem4Atkt,
                        atsem4,
                        semester,
                        s_Name,
                        f_Name,
                        m_Name,
                        roll_No,
                        enrollmentNum,
                        status,
                        totalNumber,
                        result
                      );

                      semester = 5;
                      totalAktk5 =
                        (byte) (
                          count1_atkt +
                          count2_atkt +
                          count3_atkt +
                          count4_atkt +
                          count5_atkt
                        );
                      result = checkResult(totalAktk5, result);
                      marksheetResult(
                        sem5Sub,
                        sem5Marks,
                        sem5Atkt,
                        atsem5,
                        semester,
                        s_Name,
                        f_Name,
                        m_Name,
                        roll_No,
                        enrollmentNum,
                        status,
                        totalNumber,
                        result
                      );

                      if (totalAktk5 > 2) {
                        System.out.println(
                          setRed +
                          "\t\t\t\t\t        " +
                          count5_atkt +
                          " atkt in 5th semester" +
                          resetRed
                        );
                        System.out.println(
                          setRed +
                          "\t\t\t\t\t\t     Total atkt " +
                          totalAktk5 +
                          resetRed
                        );
                        System.out.println(
                          setRed + "\t\t\t\t\t\t     !! Sem-Back !! " + resetRed
                        );
                        atsem5++;

                        if (count1_atkt <= 2 && count1_atkt > 0) {
                          semester = 1;
                          count1_atkt =
                            wayAtkt(
                              sem1Sub,
                              sem1Marks,
                              sem1Atkt,
                              totalAktk1,
                              semester,
                              count1_atkt,
                              result,
                              atsem1,
                              sc
                            );
                        }
                        if (count2_atkt <= 2 && count2_atkt > 0) {
                          semester = 2;
                          count2_atkt =
                            wayAtkt(
                              sem2Sub,
                              sem2Marks,
                              sem2Atkt,
                              totalAktk2,
                              semester,
                              count2_atkt,
                              result,
                              atsem2,
                              sc
                            );
                        }
                        if (count3_atkt <= 2 && count3_atkt > 0) {
                          semester = 3;
                          count3_atkt =
                            wayAtkt(
                              sem3Sub,
                              sem3Marks,
                              sem3Atkt,
                              totalAktk3,
                              semester,
                              count3_atkt,
                              result,
                              atsem3,
                              sc
                            );
                        }
                        if (count4_atkt <= 2 && count4_atkt > 0) {
                          semester = 4;
                          count4_atkt =
                            wayAtkt(
                              sem4Sub,
                              sem4Marks,
                              sem4Atkt,
                              totalAktk4,
                              semester,
                              count4_atkt,
                              result,
                              atsem4,
                              sc
                            );
                        }
                        continue;
                      } else {
                        System.out.println(
                          setGreen +
                          "\t\t\t\t\t Congractulation you promoted to 6th semester: \n\t" +
                          endBlue
                        );

                        if (count1_atkt <= 2 && count1_atkt > 0) {
                          semester = 1;
                          count1_atkt =
                            wayAtkt(
                              sem1Sub,
                              sem1Marks,
                              sem1Atkt,
                              totalAktk1,
                              semester,
                              count1_atkt,
                              result,
                              atsem1,
                              sc
                            );
                        }
                        if (count2_atkt <= 2 && count2_atkt > 0) {
                          semester = 2;
                          count2_atkt =
                            wayAtkt(
                              sem2Sub,
                              sem2Marks,
                              sem2Atkt,
                              totalAktk2,
                              semester,
                              count2_atkt,
                              result,
                              atsem2,
                              sc
                            );
                        }
                        if (count3_atkt <= 2 && count3_atkt > 0) {
                          semester = 3;
                          count3_atkt =
                            wayAtkt(
                              sem3Sub,
                              sem3Marks,
                              sem3Atkt,
                              totalAktk3,
                              semester,
                              count3_atkt,
                              result,
                              atsem3,
                              sc
                            );
                        }
                        if (count4_atkt <= 2 && count4_atkt > 0) {
                          semester = 4;
                          count4_atkt =
                            wayAtkt(
                              sem4Sub,
                              sem4Marks,
                              sem4Atkt,
                              totalAktk4,
                              semester,
                              count4_atkt,
                              result,
                              atsem4,
                              sc
                            );
                        }
                        if (count5_atkt <= 2 && count5_atkt > 0) {
                          semester = 5;
                          count5_atkt =
                            wayAtkt(
                              sem5Sub,
                              sem5Marks,
                              sem5Atkt,
                              totalAktk5,
                              semester,
                              count5_atkt,
                              result,
                              atsem5,
                              sc
                            );
                        }
                        atsem6++;
                        do {
                          System.out.println(
                            "\n-----------------------------------------------------------------------------------------------------------------------"
                          );
                          System.out.println(
                            setBlue +
                            "\t\t\t\t\t\t     6th semester \t" +
                            endBlue
                          );
                          System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------\n"
                          );
                          semester = 6;
                          count6_atkt = 0;
                          count6_atkt =
                            mainExam(
                              sem6Sub,
                              sem6Marks,
                              sem6Atkt,
                              count6_atkt,
                              sc
                            );

                          // 1st semester
                          // marksheet:
                          semester = 1;
                          result = checkResult(totalAktk1, result);
                          marksheetResult(
                            sem1Sub,
                            sem1Marks,
                            sem1Atkt,
                            atsem1,
                            semester,
                            s_Name,
                            f_Name,
                            m_Name,
                            roll_No,
                            enrollmentNum,
                            status,
                            totalNumber,
                            result
                          );

                          // 2nd semester
                          // exam:
                          semester = 2;
                          result = checkResult(totalAktk2, result);
                          marksheetResult(
                            sem2Sub,
                            sem2Marks,
                            sem2Atkt,
                            atsem2,
                            semester,
                            s_Name,
                            f_Name,
                            m_Name,
                            roll_No,
                            enrollmentNum,
                            status,
                            totalNumber,
                            result
                          );

                          // 3rd semester
                          // exam:
                          semester = 3;
                          result = checkResult(totalAktk3, result);
                          marksheetResult(
                            sem3Sub,
                            sem3Marks,
                            sem3Atkt,
                            atsem3,
                            semester,
                            s_Name,
                            f_Name,
                            m_Name,
                            roll_No,
                            enrollmentNum,
                            status,
                            totalNumber,
                            result
                          );

                          // 4th semester
                          // exam:
                          semester = 4;
                          result = checkResult(totalAktk4, result);
                          marksheetResult(
                            sem4Sub,
                            sem4Marks,
                            sem4Atkt,
                            atsem4,
                            semester,
                            s_Name,
                            f_Name,
                            m_Name,
                            roll_No,
                            enrollmentNum,
                            status,
                            totalNumber,
                            result
                          );

                          semester = 5;
                          result = checkResult(totalAktk5, result);
                          marksheetResult(
                            sem5Sub,
                            sem5Marks,
                            sem5Atkt,
                            atsem5,
                            semester,
                            s_Name,
                            f_Name,
                            m_Name,
                            roll_No,
                            enrollmentNum,
                            status,
                            totalNumber,
                            result
                          );

                          semester = 6;
                          totalAktk6 =
                            (byte) (
                              count1_atkt +
                              count2_atkt +
                              count3_atkt +
                              count4_atkt +
                              count5_atkt +
                              count6_atkt
                            );
                          result = checkResult(totalAktk6, result);
                          marksheetResult(
                            sem6Sub,
                            sem6Marks,
                            sem6Atkt,
                            atsem6,
                            semester,
                            s_Name,
                            f_Name,
                            m_Name,
                            roll_No,
                            enrollmentNum,
                            status,
                            totalNumber,
                            result
                          );

                          if (totalAktk6 > 2) {
                            System.out.println(
                              setRed +
                              "\t\t\t\t\t       \t" +
                              count6_atkt +
                              " atkt in 6th semester" +
                              resetRed
                            );
                            System.out.println(
                              setRed +
                              "\t\t\t\t\t\t      Total atkt " +
                              totalAktk6 +
                              resetRed
                            );
                            System.out.println(
                              setRed +
                              "\t\t\t\t\t\t     !! Sem-Back !! " +
                              resetRed
                            );
                            atsem6++;

                            if (count1_atkt <= 2 && count1_atkt > 0) {
                              semester = 1;
                              count1_atkt =
                                wayAtkt(
                                  sem1Sub,
                                  sem1Marks,
                                  sem1Atkt,
                                  totalAktk1,
                                  semester,
                                  count1_atkt,
                                  result,
                                  atsem1,
                                  sc
                                );
                            }
                            if (count2_atkt <= 2 && count2_atkt > 0) {
                              semester = 2;
                              count2_atkt =
                                wayAtkt(
                                  sem2Sub,
                                  sem2Marks,
                                  sem2Atkt,
                                  totalAktk2,
                                  semester,
                                  count2_atkt,
                                  result,
                                  atsem2,
                                  sc
                                );
                            }
                            if (count3_atkt <= 2 && count3_atkt > 0) {
                              semester = 3;
                              count3_atkt =
                                wayAtkt(
                                  sem3Sub,
                                  sem3Marks,
                                  sem3Atkt,
                                  totalAktk3,
                                  semester,
                                  count3_atkt,
                                  result,
                                  atsem3,
                                  sc
                                );
                            }
                            if (count4_atkt <= 2 && count4_atkt > 0) {
                              semester = 4;
                              count4_atkt =
                                wayAtkt(
                                  sem4Sub,
                                  sem4Marks,
                                  sem4Atkt,
                                  totalAktk4,
                                  semester,
                                  count4_atkt,
                                  result,
                                  atsem4,
                                  sc
                                );
                            }
                            if (count5_atkt <= 2 && count5_atkt > 0) {
                              semester = 5;
                              count5_atkt =
                                wayAtkt(
                                  sem5Sub,
                                  sem5Marks,
                                  sem5Atkt,
                                  totalAktk5,
                                  semester,
                                  count5_atkt,
                                  result,
                                  atsem5,
                                  sc
                                );
                            }
                            continue;
                          } else {
                            int n = 1;
                            if (
                              count1_atkt >= 1 ||
                              count2_atkt >= 1 ||
                              count3_atkt >= 1 ||
                              count4_atkt >= 1 ||
                              count5_atkt >= 1 ||
                              count6_atkt >= 1
                            ) {
                              while (n == 1) {
                                System.out.println(
                                  setRed +
                                  " \t\t\t\t\t  LAST CHANCE FOR ATKT EXAM: " +
                                  resetRed
                                );

                                if (count1_atkt <= 2 && count1_atkt > 0) {
                                  semester = 1;
                                  count1_atkt =
                                    wayAtkt(
                                      sem1Sub,
                                      sem1Marks,
                                      sem1Atkt,
                                      totalAktk1,
                                      semester,
                                      count1_atkt,
                                      result,
                                      atsem1,
                                      sc
                                    );
                                  totalAktk1 = (count1_atkt);

                                  result = checkResult(totalAktk1, result);
                                  if (count1_atkt == 0) {
                                    marksheetResult(
                                      sem1Sub,
                                      sem1Marks,
                                      sem1Atkt,
                                      atsem1,
                                      semester,
                                      s_Name,
                                      f_Name,
                                      m_Name,
                                      roll_No,
                                      enrollmentNum,
                                      status,
                                      totalNumber,
                                      result
                                    );
                                  }
                                }

                                if (count2_atkt <= 2 && count2_atkt > 0) {
                                  semester = 2;
                                  count2_atkt =
                                    wayAtkt(
                                      sem2Sub,
                                      sem2Marks,
                                      sem2Atkt,
                                      totalAktk2,
                                      semester,
                                      count2_atkt,
                                      result,
                                      atsem2,
                                      sc
                                    );
                                  totalAktk2 =
                                    (byte) (count1_atkt + count2_atkt);
                                }
                                if (count3_atkt <= 2 && count3_atkt > 0) {
                                  semester = 3;
                                  count3_atkt =
                                    wayAtkt(
                                      sem3Sub,
                                      sem3Marks,
                                      sem3Atkt,
                                      totalAktk3,
                                      semester,
                                      count3_atkt,
                                      result,
                                      atsem3,
                                      sc
                                    );
                                  totalAktk3 =
                                    (byte) (
                                      count1_atkt + count2_atkt + count3_atkt
                                    );
                                }
                                if (count4_atkt <= 2 && count4_atkt > 0) {
                                  semester = 4;
                                  count4_atkt =
                                    wayAtkt(
                                      sem4Sub,
                                      sem4Marks,
                                      sem4Atkt,
                                      totalAktk4,
                                      semester,
                                      count4_atkt,
                                      result,
                                      atsem4,
                                      sc
                                    );
                                  totalAktk4 =
                                    (byte) (
                                      count1_atkt +
                                      count2_atkt +
                                      count3_atkt +
                                      count4_atkt
                                    );
                                }

                                if (count5_atkt <= 2 && count5_atkt > 0) {
                                  semester = 5;
                                  count5_atkt =
                                    wayAtkt(
                                      sem5Sub,
                                      sem5Marks,
                                      sem5Atkt,
                                      totalAktk5,
                                      semester,
                                      count5_atkt,
                                      result,
                                      atsem5,
                                      sc
                                    );
                                  totalAktk5 =
                                    (byte) (
                                      count1_atkt +
                                      count2_atkt +
                                      count3_atkt +
                                      count4_atkt +
                                      count5_atkt
                                    );
                                }
                                if (count6_atkt <= 2 && count6_atkt > 0) {
                                  semester = 6;
                                  count6_atkt =
                                    wayAtkt(
                                      sem6Sub,
                                      sem6Marks,
                                      sem6Atkt,
                                      totalAktk6,
                                      semester,
                                      count6_atkt,
                                      result,
                                      atsem6,
                                      sc
                                    );
                                  totalAktk6 =
                                    (byte) (
                                      count1_atkt +
                                      count2_atkt +
                                      count3_atkt +
                                      count4_atkt +
                                      count5_atkt +
                                      count6_atkt
                                    );
                                }
                                totalAktk6 =
                                  (byte) (
                                    count1_atkt +
                                    count2_atkt +
                                    count3_atkt +
                                    count4_atkt +
                                    count5_atkt +
                                    count6_atkt
                                  );
                                if (totalAktk6 != 0) {
                                  System.out.println(
                                    setRed +
                                    "\t\t\t\t\tSorry you can not continue this course: " +
                                    resetRed
                                  );
                                  n++;
                                } else {
                                  System.out.println("Degree: ");
                                  System.out.println("Enter date for Degree: ");
                                  sc.nextLine();
                                  String date = sc.nextLine();

                                  Marksheet5.degree(date, s_Name);
                                  Marksheet5.migration(
                                    date,
                                    s_Name,
                                    enrollmentNum
                                  );
                                }
                                n++;
                              }
                            }
                            if (n == 1) {
                              System.out.println("Degree: ");
                              System.out.println("Enter date for Degree: ");
                              sc.nextLine();
                              String date = sc.nextLine();

                              Marksheet5.degree(date, s_Name);
                              Marksheet5.migration(date, s_Name, enrollmentNum);
                            }
                          }

                          break;
                        } while (totalAktk6 >= 3);
                      }
                    } while (totalAktk5 >= 3);
                  }
                } while (totalAktk4 >= 3);
              }
            } while (totalAktk3 >= 3);
          }
        } while (totalAktk2 >= 3);
      }
    } while (totalAktk1 >= 3);
  }
}
