package com.bankproject01.testmain;

import com.bankproject01.dao.AccountDao;
import com.bankproject01.dao.AdminDao;
import com.bankproject01.model.Account;
import com.bankproject01.model.Admin;
import com.bankproject01.service.SendMail;
import com.bankproject01.service.Validation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

    // Color
    public static String setRed = "\u001B[31m";
    public static String setYellow = "\u001B[33m";
    public static String setGreen = "\u001B[32m";
    public static String resetColor = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t\t PRESS 1: Admin login \t\t\t PRESS 2: Customer login \t\t\t" + TestMain.setRed + " PRESS 3: Exit" + TestMain.resetColor);
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
            int choice = 0;
            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:

                        System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t ***** ADMIN LOGIN PAGE *****\n\t " + TestMain.resetColor);

                        System.out.println("Admin id: ");
                        int id = 0;
                        try {
                            id = sc.nextInt();
                        } catch (Exception e) {
                        }
                        System.out.println("Admin password: ");
                        sc.nextLine();
                        String password = sc.nextLine();
                        password = Validation.noEmpty(password, sc);
                        // create object of Admin model
                        Admin admin = new Admin(id, password);

                        if (AdminDao.adminLogin(id, password)) {
                            System.out.println(TestMain.setGreen + "Admin successfully login......" + TestMain.resetColor);
                            boolean flag = true;
                            while (flag) {
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t PRESS 1: Create a new customer account \t\t\t PRESS 2: View particular account information \t\t\t");
                                System.out.println("\t\t\t PRESS 3: Block account \t\t\t\t\t PRESS 4: Unblock account \t\t\t");
                                System.out.println("\t\t\t PRESS 5: View all account list\t\t\t\t PRESS 6: View block account list\t\t\t ");
                                System.out.println("\t\t\t PRESS 7: Back Option" + TestMain.setRed + "\t\t\t\t\t\t PRESS: 8 Exit program" + TestMain.resetColor);
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                                int adminChoice = 0;
                                try {
                                    adminChoice = sc.nextInt();
                                    int count = 1;
                                    switch (adminChoice) {
                                        case 1:
                                            System.out.println("Enter Account type (PRESS 1. saving/ PRESS 2. current)");
                                            int type = sc.nextInt();
                                            String accType = "null";
                                            while (count <= 2 && type != 1 && type != 2) {
                                                type = sc.nextInt();
                                                if (type == 1) {
                                                    accType = "saving";
                                                } else if (type == 2) {
                                                    accType = "current";
                                                } else {
                                                    sc.nextLine();
                                                    System.out.println(TestMain.setRed + "Invalid input please re-enter " + TestMain.resetColor);
                                                }
                                                count++;
                                            }
                                            if (type == 1 || type == 2) {
                                                System.out.print("\t Enter your name: \n\t ");
                                                String firstName = sc.nextLine();
                                                firstName = Validation.noEmpty(firstName, sc);
                                                boolean checkfName = firstName.matches("[a-zA-Z , ]+");
                                                count = 1;
                                                while (count <= 2 && checkfName == false) {
                                                    firstName = sc.nextLine();
                                                    firstName = Validation.noEmpty(firstName, sc);
                                                    checkfName = firstName.matches("[a-zA-Z , ]+");
                                                    if (!checkfName) {
                                                        System.out.println(TestMain.setRed + "Invalid Name please re-enter" + TestMain.resetColor);
                                                    }
                                                    count++;
                                                }
                                                if (checkfName) {
                                                    System.out.print("\t Enter last name: \n\t ");
                                                    String lastName = sc.nextLine();
                                                    lastName = Validation.noEmpty(lastName, sc);
                                                    boolean checklName = lastName.matches("[a-zA-Z , ]+");
                                                    count = 1;
                                                    while (count <= 2 && checklName == false) {
                                                        lastName = sc.nextLine();
                                                        lastName = Validation.noEmpty(lastName, sc);
                                                        checklName = firstName.matches("[a-zA-Z , ]+");
                                                        if (!checkfName) {
                                                            System.out.println(TestMain.setRed + "Invalid last name please re-enter" + TestMain.resetColor);
                                                        }
                                                        count++;
                                                    }
                                                    if (checklName) {
                                                        System.out.print("\t Enter your father name: \n\t ");
                                                        String fatherName = sc.nextLine();
                                                        fatherName = Validation.noEmpty(fatherName, sc);
                                                        boolean checkfatherN = fatherName.matches("[a-zA-Z , ]+");
                                                        while (count <= 2 && checkfatherN == false) {
                                                            fatherName = sc.nextLine();
                                                            fatherName = Validation.noEmpty(fatherName, sc);
                                                            checkfatherN = fatherName.matches("[a-zA-Z , ]+");
                                                            if (!checkfatherN) {
                                                                System.out.println(TestMain.setRed + "Invalid father name please re-enter" + TestMain.resetColor);
                                                            }
                                                            count++;
                                                        }
                                                        if (checkfatherN) {
                                                            System.out.print("\t Marital status: (PRESS 1: yes / PRESS 2: no)\n\t ");
                                                            int n = sc.nextInt();
                                                            String status = "null";
//                                                           
                                                            while (count <= 2 && n != 1 && n != 2) {
                                                                n = sc.nextInt();
                                                                if (n == 1) {
                                                                    status = "yes";
                                                                } else if (n == 2) {
                                                                    status = "no";
                                                                } else {
                                                                    System.out.println(TestMain.setRed + "Invalid input please re-enter " + TestMain.resetColor);
                                                                }
                                                                count++;
                                                            }
                                                            if (status.equals("yes") || status.equals("no")) {
                                                                System.out.print("\t Contact number: \n\t ");
                                                                String contactNum = sc.nextLine();
                                                                contactNum = Validation.noEmpty(contactNum, sc);
                                                                boolean checkContNum = contactNum.matches("\\d{10}");
                                                                count = 1;
                                                                while (count <= 2 && !checkContNum) {
                                                                    contactNum = sc.nextLine();
                                                                    contactNum = Validation.noEmpty(contactNum, sc);
                                                                    checkContNum = contactNum.matches("\\d{10}");
                                                                    if (!checkContNum) {
                                                                        System.out.println(TestMain.setRed + "Invalid contact number re-enter " + TestMain.resetColor);
                                                                    }
                                                                    count++;
                                                                }

                                                                if (checkContNum) {
                                                                    System.out.print("\t Enter your email: \n\t ");
                                                                    String email = sc.nextLine();
                                                                    email = Validation.noEmpty(email, sc);
                                                                    boolean checkEmail = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

                                                                    count = 1;
                                                                    while (count <= 2 && !checkEmail) {
                                                                        email = sc.nextLine();
                                                                        email = Validation.noEmpty(email, sc);
                                                                        checkEmail = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
                                                                        if (!checkEmail) {
                                                                            System.out.println(TestMain.setRed + "Invalid email re-enter " + TestMain.resetColor);
                                                                        }
                                                                        count++;
                                                                    }

                                                                    if (checkEmail) {
                                                                        System.out.print("\t Enter your date of birth: (yyyy-mm-dd)\n\t ");
                                                                        String dob = sc.nextLine();
                                                                        dob = Validation.noEmpty(dob, sc);
                                                                        boolean checkDob = dob.matches("\\d{4}-\\d{2}-\\d{2}");

                                                                        count = 1;
                                                                        while (count <= 2 && !checkDob) {
                                                                            dob = sc.nextLine();
                                                                            dob = Validation.noEmpty(dob, sc);
                                                                            checkDob = dob.matches("\\d{4}-\\d{2}-\\d{2}");
                                                                            if (!checkDob) {
                                                                                System.out.println(TestMain.setRed + "Invalid date of birth please re-enter " + TestMain.resetColor);
                                                                            }
                                                                            count++;
                                                                        }

                                                                        if (checkDob) {
                                                                            System.out.print("\t Aadhar number: \n\t ");
                                                                            String aadharNumber = sc.nextLine();
                                                                            aadharNumber = Validation.noEmpty(aadharNumber, sc);
                                                                            boolean checkAadharnum = aadharNumber.matches("\\d{12}");
                                                                            count = 1;
                                                                            while (count <= 2 && !checkAadharnum) {
                                                                                aadharNumber = sc.nextLine();
                                                                                aadharNumber = Validation.noEmpty(aadharNumber, sc);
                                                                                checkAadharnum = aadharNumber.matches("\\d{12}");
                                                                                if (!checkAadharnum) {
                                                                                    System.out.println(TestMain.setRed + "Invalid aadhar number please re-enter " + TestMain.resetColor);
                                                                                }
                                                                                count++;
                                                                            }
                                                                            if (checkAadharnum) {
                                                                                System.out.print("\t Pancard number: \n\t ");
                                                                                String pancardNumber = sc.nextLine();
                                                                                pancardNumber = Validation.noEmpty(pancardNumber, sc);
                                                                                boolean checkPanNum = pancardNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]");
                                                                                count = 1;
                                                                                while (count <= 2 && !checkPanNum) {
                                                                                    pancardNumber = sc.nextLine();
                                                                                    pancardNumber = Validation.noEmpty(pancardNumber, sc);
                                                                                    checkPanNum = pancardNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]");
                                                                                    if (!checkPanNum) {
                                                                                        System.out.println(TestMain.setRed + "Invalid pan number please re-enter " + TestMain.resetColor);
                                                                                    }
                                                                                    count++;
                                                                                }
                                                                                if (checkPanNum) {
                                                                                    System.out.print("\t Gender: (PRESS 1. male/ PRESS 2. female/ PRESS 3. other) \n\t ");
                                                                                    int checkgender = sc.nextInt();
                                                                                    sc.nextLine();
                                                                                    String gender = "null";
                                                                                    count = 1;
                                                                                    while (count <= 2 && checkgender != 1 && checkgender != 2 && checkgender != 3) {
                                                                                        checkgender = sc.nextInt();

                                                                                        if (checkgender == 1) {
                                                                                            gender = "male";
                                                                                        } else if (checkgender == 2) {
                                                                                            gender = "female";
                                                                                        } else if (checkgender == 3) {
                                                                                            gender = "other";
                                                                                        } else {
                                                                                            System.out.println(TestMain.setRed + "Invalid input please re-enter " + TestMain.resetColor);
                                                                                        }
                                                                                        count++;
                                                                                    }
                                                                                    if (checkgender == 1 || checkgender == 2 || checkgender == 3) {
                                                                                        System.out.print("\t Nominee name: \n\t ");
                                                                                        String nomineeName = sc.nextLine();
                                                                                        nomineeName = Validation.noEmpty(nomineeName, sc);
                                                                                        boolean checkNomineeName = nomineeName.matches("[a-zA-Z , ]+");

                                                                                        count = 1;
                                                                                        while (count <= 2 && !checkNomineeName) {
                                                                                            nomineeName = sc.nextLine();
                                                                                            nomineeName = Validation.noEmpty(nomineeName, sc);
                                                                                            checkNomineeName = nomineeName.matches("[a-zA-Z , ]+");
                                                                                            if (!checkNomineeName) {
                                                                                                System.out.println(TestMain.setRed + "Invalid nominee name please re-enter " + TestMain.resetColor);
                                                                                            }
                                                                                            count++;
                                                                                        }

                                                                                        if (checkNomineeName) {
                                                                                            System.out.print("\t Address: \n\t ");
                                                                                            String address = sc.nextLine();
                                                                                            address = Validation.noEmpty(address, sc);
                                                                                            System.out.print("\t Branch: (PRESS 1. indore/ PRESS 2. dewas/ PRESS 3. ujjain) \n\t ");
                                                                                            int checkbranch = sc.nextInt();
                                                                                            sc.nextLine();
                                                                                            String branchName = "null";
                                                                                            count = 1;
                                                                                            while (count <= 2 && checkbranch != 1 && checkbranch != 2 && checkbranch != 3) {
                                                                                                checkbranch = sc.nextInt();
                                                                                                if (checkbranch == 1) {
                                                                                                    branchName = "indore";
                                                                                                } else if (checkbranch == 2) {
                                                                                                    branchName = "dewas";
                                                                                                } else if (checkbranch == 3) {
                                                                                                    branchName = "ujjain";
                                                                                                } else {
                                                                                                    System.out.println(TestMain.setRed + "Invalid input please re-enter " + TestMain.resetColor);
                                                                                                }
                                                                                                count++;
                                                                                            }
                                                                                            if (checkbranch == 1 || checkbranch == 2 || checkbranch == 3) {
                                                                                                System.out.print("Enter amount: ");
                                                                                                Double amount = sc.nextDouble();

                                                                                                count = 1;
                                                                                                while (count <= 2 && ((accType.equals("saving") && amount != 500) || (accType.equals("saving") && amount != 1000))) {
                                                                                                    amount = sc.nextDouble();
                                                                                                    if (accType.equals("saving")) {
                                                                                                        System.out.println(TestMain.setRed + "please enter minimum amount for saving = 500" + TestMain.resetColor);
                                                                                                    } else {
                                                                                                        System.out.println(TestMain.setRed + "please enter minimum amount for current = 1000" + TestMain.resetColor);
                                                                                                    }
                                                                                                    count++;
                                                                                                }
                                                                                                if (((accType.equals("saving") || accType.equals("Saving")) && amount >= 500) || ((accType.equals("current") || accType.equals("Current")) && amount >= 1000)) {
                                                                                                    Boolean toActive = true;
                                                                                                    // generate pin:
                                                                                                    String pin = AccountDao.pinCreate(6);
                                                                                                    // get ifsc code:
                                                                                                    String ifsc = AccountDao.getIFSC(branchName);
                                                                                                    // create a object of account model 
                                                                                                    Account account = new Account(firstName, lastName, fatherName, status, contactNum, email, dob, aadharNumber, pancardNumber, accType, branchName, gender, nomineeName, address, amount, toActive, pin, ifsc);
                                                                                                    if (AccountDao.createUserAcc(account) != -1) {
                                                                                                        System.out.println(TestMain.setYellow + "Loading please wait....." + TestMain.resetColor);
                                                                                                        AccountDao.setEmailMsg(account);
                                                                                                        SendMail sendMail = new SendMail();
                                                                                                        sendMail.main(args);
                                                                                                    } else {
                                                                                                        System.out.println(TestMain.setRed + "Oops! Something went wrong to prosses account create: " + TestMain.resetColor);
                                                                                                    }
                                                                                                } else {
                                                                                                    System.out.println(TestMain.setRed + "please enter minimum amount (saving = 500 / current = 1000)" + TestMain.resetColor);
                                                                                                }
                                                                                            } else {
                                                                                                System.out.println(TestMain.setRed + "Something went wrong " + TestMain.resetColor);
                                                                                            }
                                                                                        } else {
                                                                                            System.out.println(TestMain.setRed + "Invalid nominee name: " + TestMain.resetColor);
                                                                                        }
                                                                                    } else {
                                                                                        System.out.println(TestMain.setRed + "Something went wrong " + TestMain.resetColor);
                                                                                    }
                                                                                } else {
                                                                                    System.out.println(TestMain.setRed + "Invalid pancard number: " + TestMain.resetColor);
                                                                                }

                                                                            } else {
                                                                                System.out.println(TestMain.setRed + "Invalid aadhar number: " + TestMain.resetColor);
                                                                            }

                                                                        } else {
                                                                            System.out.println(TestMain.setRed + "Invalid date type " + TestMain.resetColor);
                                                                        }

                                                                    } else {
                                                                        System.out.println(TestMain.setRed + "Invalid email" + TestMain.resetColor);
                                                                    }

                                                                } else {
                                                                    System.out.println(TestMain.setRed + "Invalid mobile number: " + TestMain.resetColor);
                                                                }
                                                            } else {
                                                                System.out.println(TestMain.setRed + "Invalid input: " + TestMain.resetColor);

                                                            }

                                                        } else {
                                                            System.out.println(TestMain.setRed + "Invalid father name: " + TestMain.resetColor);
                                                        }

                                                    } else {
                                                        System.out.println(TestMain.setRed + "Invalid last Name: " + TestMain.resetColor);
                                                    }
                                                } else {
                                                    System.out.println(TestMain.setRed + "Invalid Name: " + TestMain.resetColor);
                                                }
                                            } else {
                                                System.out.println(TestMain.setRed + "Oops!! Something went wrong...." + TestMain.resetColor);
                                            }

                                            break;

                                        case 2:
                                            System.out.println("Enter account number: ");
                                            sc.nextLine();
                                            String accountNum = sc.nextLine();
                                            boolean checkAccountNum = accountNum.matches("\\d{10}");
                                            if (checkAccountNum) {
                                                if (AccountDao.getAnyAccountinfo(accountNum) == -1) {
                                                    System.out.println(TestMain.setRed + "Account not found: " + TestMain.resetColor);
                                                }
                                            } else {
                                                System.out.println(TestMain.setRed + "Invalid account number: " + TestMain.resetColor);
                                            }
                                            break;

                                        case 3:
//                                            System.out.println("Enter account number: ");
//                                            sc.nextLine();
//                                            String accountNumber = sc.nextLine();
//                                            boolean checkAccNum = accountNumber.matches("\\d{10}");
//                                            if (checkAccNum) {
//                                                if (AccountDao.accountBlock(accountNumber) != 0) {
//                                                    System.out.println(TestMain.setGreen + "Account successfully block" + TestMain.resetColor);
//                                                } else {
//                                                    System.out.println(TestMain.setRed + "Account not found:" + TestMain.resetColor);
//                                                }
//                                            } else {
//                                                System.out.println(TestMain.setRed + "Invalid account number: " + TestMain.resetColor);
//                                            }

                                            // alredy block 
                                            System.out.println("Enter account number: ");
                                            sc.nextLine();
                                            String accountNumber = sc.nextLine();
                                            boolean checkAccNum = accountNumber.matches("\\d{10}");
                                            if (checkAccNum) {
                                                if (AccountDao.accountBlock(accountNumber) != 0 && AccountDao.accountBlock(accountNumber) != 100) {
                                                    System.out.println(TestMain.setGreen + "Account successfully block" + TestMain.resetColor);
                                                } else if (AccountDao.accountBlock(accountNumber) == 0) {
                                                    System.out.println(TestMain.setRed + "Account not found:" + TestMain.resetColor);
                                                }
                                            } else {
                                                System.out.println(TestMain.setRed + "Invalid account number: " + TestMain.resetColor);
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Enter account number: ");
                                            sc.nextLine();
                                            String accountNumber1 = sc.nextLine();
                                            boolean checkAccNum1 = accountNumber1.matches("\\d{10}");
                                            if (checkAccNum1) {
                                                if (AccountDao.accountUnBlock(accountNumber1) != 0) {
                                                    System.out.println(TestMain.setGreen + "Account successfully Unblock" + TestMain.resetColor);
                                                } else {
                                                    System.out.println(TestMain.setRed + "Account not found:" + TestMain.resetColor);
                                                }
                                            } else {
                                                System.out.println(TestMain.setRed + "Invalid account number: " + TestMain.resetColor);
                                            }
                                            break;
                                        case 5:
                                            if (AccountDao.getAllAccountinfo() == 1) {
                                                System.out.println(TestMain.setRed + "No account found: " + TestMain.resetColor);
                                            }
                                            break;
                                        case 6:
                                            if (AccountDao.getBlockList() == 1) {
                                                System.out.println(TestMain.setRed + "Empty block list: " + TestMain.resetColor);
                                            }
                                            break;
                                        case 7:
                                            flag = false;
                                            break;
                                        case 8:
                                            System.out.println(
                                                    TestMain.setGreen
                                                    + "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK "
                                                    + TestMain.resetColor
                                            );
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println(TestMain.setRed + "Something went wrong: " + TestMain.resetColor);
                                    }

                                } catch (InputMismatchException e) {
                                    sc.nextLine();
                                    System.out.println(TestMain.setRed + "Please enter only integer value: " + TestMain.resetColor);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                        } else {
                            System.out.println(TestMain.setRed + "Oops! Something went wrong" + TestMain.resetColor);
                        }
                        break;

                    case 2:
                        System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t ***** COSTUMER LOGIN PAGE ****" + TestMain.resetColor);
                        System.out.println("Enter your name: ");
                        sc.nextLine();
                        String userName = sc.next();
                        userName = Validation.noEmpty(userName, sc);
                        boolean checkfName = userName.matches("[a-zA-Z , ]+");
                        if (!checkfName) {
                            System.out.println(TestMain.setRed + "Invalid user name: " + TestMain.resetColor);
                        }

                        break;
                    case 3:
                        System.out.println(
                                TestMain.setGreen
                                + "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK "
                                + TestMain.resetColor
                        );
                        System.exit(0);
                        break;
                    default:
                        System.out.println(TestMain.setRed + "Oops!! Something went wrong...." + TestMain.resetColor);

                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println(TestMain.setRed + "Please enter only integer value: " + TestMain.resetColor);
            } catch (Exception e) {
                System.out.println(TestMain.setRed + "Oops!! Something went wrong...." + TestMain.resetColor);
            }
        }
    }
}
