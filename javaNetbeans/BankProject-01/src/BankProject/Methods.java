
package BankProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Methods {

    // account number increase
    static int n = 3;
//    String pinNum2 ;

    // Admin login: 
    //-----------------------------------------ADMIN-LOGIN------------------------------------------------
    public boolean adminLogin(Scanner sc) {
        // create a file of adminLogin class: 
        File fadmin = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\admin.txt");
        boolean flag = false;

        try {
            if (!fadmin.exists()) {
                fadmin.createNewFile();
            }
            FileReader fr = new FileReader(fadmin);
            System.out.print("\t Enter your name: \n\t ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("\t Enter password: \n\t ");
            String password = sc.nextLine();

            BufferedReader br = new BufferedReader(fr);
            if (br.readLine().equals(name)) {
                if (br.readLine().equals(password)) {
                    System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t\t LOGIN SUCCESSFULL " + Pojo.resetColor);
                    flag = true;
                } else {
                    System.out.println(Pojo.setRed + "Wrong password" + Pojo.resetColor);
                }
            } else {
                System.out.println(Pojo.setRed + "Wrong name...." + Pojo.resetColor);
            }
            return flag;

        } catch (Exception e) {
            e.printStackTrace();
            return flag;
        }

    }

    //-----------------------------------------ACCOUNT-NUMBER-------------------------------------------
    private String accountNumberCreate() {
        String s = "18000180200";
        n++;

        String accountNum = s + n;

        return accountNum;
    }

    // ------------------------------------------CREATE-CUSTUMER-ACCOUNT---------------------------------------------
    public void createCustomerAccount(Scanner sc, Methods objM) {

        System.out.print("\t Enter your name: \n\t ");
        sc.nextLine();
        String userName = sc.nextLine();
        System.out.print("\t Enter your father name: \n\t ");
        String fatherName = sc.nextLine();
        System.out.print("\t Enter aadhar number: \n\t ");
        String aadharNum = sc.nextLine();
        System.out.print("\t Enter mobile number: \n\t ");
        String moNumber = sc.nextLine();
        System.out.print("\t Date of birth: \n\t ");
        String dateofbirth = sc.nextLine();
        System.out.print("\t pin number: \n\t ");
        String pinNum = sc.nextLine();
        float amount;
        Pojo objp = null;

        System.out.print("\t Enter amount: \n\t ");
        amount = sc.nextFloat();

        if (amount >= 1000) {
            System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t Congractulation your account successfully created...\n" + Pojo.resetColor);
            try {
                // create a file : 
                File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }

                FileWriter fw = new FileWriter(f, true);

                BufferedWriter bw = new BufferedWriter(fw);
                // account number create : 
                String accountNum = objM.accountNumberCreate();
                bw.write(accountNum + "\t");
                bw.write(userName + "\t");
                bw.write(fatherName + "\t");
                bw.write(aadharNum + "\t");
                bw.write(moNumber + "\t");
                bw.write(dateofbirth + "\t");
                bw.write(pinNum + "\t");
                bw.write((int) amount + "\t");
                bw.write("\n");

                bw.flush();
                bw.close();

                // create a object of customer class: 
                objp = new Pojo(userName, fatherName, aadharNum, moNumber, dateofbirth, pinNum, amount, accountNum);

            } catch (InputMismatchException e) {
                System.out.println(Pojo.setRed + "Wrong input: (please re-enter your choice)" + Pojo.resetColor);
                sc.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
//                break;
        } else {
            System.out.println(Pojo.setRed + "Please enter minimum amount 1000 rupes..." + Pojo.resetColor);
        }

    }

    // -------------------------------------------CUSTUMER-ACCOUNT-DETAILS-READ--------------------------------------------
    public void accountDetails(Scanner sc, Pojo objp) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");
        String pinNum2 = null;
        try {
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            System.out.print("\t Enter pin number: \n\t ");
            sc.nextLine();
            pinNum2 = sc.nextLine();

            String line;
            Boolean flag = true;
            while ((line = br.readLine()) != null) {
                String readData[] = line.split("\t");
                if (pinNum2.equals(readData[6])) {
                    System.out.println(Pojo.setBlue + "\t\t\t\t\t\t\t\t ACCOUNT-INFORMATION" + Pojo.resetColor);
                    System.out.println("\t\t\t\t\t\t\t ============================================");
                    System.out.println("\t\t\t\t\t\t\t\tAccount number:  " + readData[0]);
                    System.out.println("\t\t\t\t\t\t\t\tHolder's name: \t" + readData[1]);
                    System.out.println("\t\t\t\t\t\t\t\tFather name: \t" + readData[2]);
                    System.out.println("\t\t\t\t\t\t\t\tAadhar number: \t" + readData[3]);
                    System.out.println("\t\t\t\t\t\t\t\tMobile number: \t" + readData[4]);
                    System.out.println("\t\t\t\t\t\t\t\tDOB:  \t\t" + readData[5]);
//                   System.out.println("\t\t\t\t\t\t\t\t\tAccount number: \t" + readData[6]);
                    System.out.println("\t\t\t\t\t\t\t\tTotal amount: \t" + readData[7]);

                    System.out.println("\t\t\t\t\t\t\t ============================================");
                    flag = false;
                }
            }

            if (flag) {
                System.out.println(Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // break;
    }

    //-------------------------------------------VIEW-ALL-ACCOUNT-INFORMATION-------------------------------------------------
    public void allAccountInformation() {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");

        try {
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            String line;
            Boolean flag = true;
            int n = 1;
            while ((line = br.readLine()) != null) {
                String readData[] = line.split("\t");
                System.out.println(Pojo.setBlue + "\t\t\t\t\t\t\t\t" + n + " ACCOUNT-INFORMATION" + Pojo.resetColor);
                System.out.println("\t\t\t\t\t\t\t ============================================");
                System.out.println("\t\t\t\t\t\t\t\tAccount number:  " + readData[0]);
                System.out.println("\t\t\t\t\t\t\t\tHolder's name: \t" + readData[1]);
                System.out.println("\t\t\t\t\t\t\t\tFather name: \t" + readData[2]);
                System.out.println("\t\t\t\t\t\t\t\tAadhar number: \t" + readData[3]);
                System.out.println("\t\t\t\t\t\t\t\tMobile number: \t" + readData[4]);
                System.out.println("\t\t\t\t\t\t\t\tDOB:  \t\t" + readData[5]);
//                   System.out.println("\t\t\t\t\t\t\t\t\tAccount number: \t" + readData[6]);
                System.out.println("\t\t\t\t\t\t\t\tTotal amount: \t" + readData[7]);
                System.out.println("\t\t\t\t\t\t\t ============================================");
                flag = false;
                n++;
            }
            if (flag) {
                System.out.println(Pojo.setRed + "\t\t\t\t\t Account not found: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//----------------------------------------------REMOVE-AND-BLOCK-ACCOUNT-----------------------------------------------------
    public void removeAndBlock() {

    }

    //----------------------------------------------LOGIN-USERACCOUNT---------------------------------------------------  
    public String loginUserAccound(Scanner sc, Pojo objp) {

        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");
        Boolean flag = false;
        String pinNum2 = null;

        try {
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            System.out.println("\t Enter pin number:  ");
            sc.nextLine();
            System.out.print("\t ");
            pinNum2 = sc.nextLine();

            String line;
            while ((line = br.readLine()) != null) {
                String readData[] = line.split("\t");
                if (pinNum2.equals(readData[6])) {
                    System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t\t LOGIN SUCCESSFULL " + Pojo.resetColor);
                    return pinNum2;
                }
            }
            return pinNum2 = null;
        } catch (Exception e) {
            e.printStackTrace();
            return pinNum2 = null;
        }
    }
//============================
    //-----------------------------------------------USER-ACCOUNT-DETAILS-CASE2-------------------------------------

    public void userAccountDetailsC(Pojo objp, String pin) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");

        try {
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String readData[] = line.split("\t");
                if (pin.equals(readData[6])) {
                    System.out.println(Pojo.setBlue + "\t\t\t\t\t\t\t\t ACCOUNT-INFORMATION" + Pojo.resetColor);
                    System.out.println("\t\t\t\t\t\t\t ============================================");
                    System.out.println("\t\t\t\t\t\t\t\tAccount number:  " + readData[0]);
                    System.out.println("\t\t\t\t\t\t\t\tHolder's name: \t" + readData[1]);
                    System.out.println("\t\t\t\t\t\t\t\tFather name: \t" + readData[2]);
                    System.out.println("\t\t\t\t\t\t\t\tAadhar number: \t" + readData[3]);
                    System.out.println("\t\t\t\t\t\t\t\tMobile number: \t" + readData[4]);
                    System.out.println("\t\t\t\t\t\t\t\tDOB:  \t\t" + readData[5]);
//                   System.out.println("\t\t\t\t\t\t\t\t\tAccount number: \t" + readData[6]);
                    System.out.println("\t\t\t\t\t\t\t\tTotal amount: \t" + readData[7]);

                    System.out.println("\t\t\t\t\t\t\t ============================================");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //---------------------------------------------UPDATE-ACCOUNT-DETAILS----------------------------------------------
    public void updateAccountDetails(Pojo objp, String pin, Scanner sc) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");

        try {
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String readData[] = line.split("\t");
                if (pin.equals(readData[6])) {
                    System.out.println(Pojo.setBlue + "\t\t\t\t\t\t\t\t ACCOUNT-INFORMATION" + Pojo.resetColor);
                    System.out.println("\t\t\t\t\t\t\t ============================================");
                    System.out.println("\t\t\t\t\t\t\t\tAccount number:  " + readData[0]);
                    System.out.println("\t\t\t\t\t\t\t\tHolder's name: \t" + readData[1]);
                    System.out.println("\t\t\t\t\t\t\t\tFather name: \t" + readData[2]);
                    System.out.println("\t\t\t\t\t\t\t\tAadhar number: \t" + readData[3]);
                    System.out.println("\t\t\t\t\t\t\t\tMobile number: \t" + readData[4]);
                    System.out.println("\t\t\t\t\t\t\t\tDOB:  \t\t" + readData[5]);
//                   System.out.println("\t\t\t\t\t\t\t\t\tAccount number: \t" + readData[6]);
                    System.out.println("\t\t\t\t\t\t\t\tTotal amount: \t" + readData[7]);

                    System.out.println("\t\t\t\t\t\t\t ============================================");

                    System.out.println(Pojo.setRed + "\t\t\t\t\t\t\t Do you want to change account details(y/n) " + Pojo.resetColor);
                    try {

                        char ch = sc.next().charAt(0);
                        boolean flag = true;
                        do {
                            if (ch == 'y') {
                                System.out.println("\t\t\t\t\t\t\t\t What do you want to change ");
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t PRESS 1: Change mobile number \t\t\t PRESS 2: Change aadhar number \t\t\t");
                                System.out.println("\t\t\t PRESS 3: Change name \t\t\t\t PRESS 4: Change to all information \t\t\t");
                                System.out.println("\t\t\t PRESS 5: Back menu" + Pojo.setRed + "\t\t\t\t PRESS: 6 Exit program" + Pojo.resetColor);
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                                int choice = 0;

                                choice = sc.nextInt();

                                switch (choice) {
                                    case 1:

                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        flag = false;
                                        break;
                                    case 6:
                                        System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK " + Pojo.resetColor);
                                        System.exit(0);
                                        break;
                                    default:
                                        sc.nextLine();
                                        System.out.println(Pojo.setRed + "\t\t\t\t\t\t\t Something went wrong: " + Pojo.resetColor);
                                }

                            } else {
                                System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t\t\t Back to menu" + Pojo.resetColor);
                                flag = false;
                            }

                        } while (flag);
                    } catch (InputMismatchException e) {
                        System.out.println(Pojo.setRed + "\t\t\t\t\t\t Wrong input please (re-enter)" + Pojo.resetColor);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println(Pojo.setRed + "\t\t\t\t\t\t Wrong input please (re-enter)" + Pojo.resetColor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
