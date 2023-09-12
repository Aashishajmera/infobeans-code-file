/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankProject;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Operation {

    public void main() {

        Scanner sc = new Scanner(System.in);

        // create object of pojo class
        Pojo objp = new Pojo();

        //create object of method class 
        Methods objM = new Methods();
        boolean flag2 = true;
        boolean flag3 = true;

        do {

            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t\t PRESS 1: Addmin login \t\t\t PRESS 2: Customer login \t\t\t" + Pojo.setRed + " PRESS 3: Exit" + Pojo.resetColor);
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(Pojo.setBlue + "\t\t\t\t\t\t\t ***** ADMIN LOGIN PAGE *****\n\t " + Pojo.resetColor);
                        boolean flag = objM.adminLogin(sc);

                        do {

                            if (flag) {
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t PRESS 1: Create a new customer account \t\t\t PRESS 2: View any account information \t\t\t");
                                System.out.println("\t\t\t PRESS 3: Remove or Block account \t\t\t\t PRESS 4: View all account list \t\t\t");
                                System.out.println("\t\t\t PRESS 5: Back menu" + Pojo.setRed + "\t\t\t\t\t\t PRESS: 6 Exit program" + Pojo.resetColor);
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");

                                try {
                                    int choice1 = sc.nextInt();

                                    switch (choice1) {
                                        case 1:
                                            objM.createCustomerAccount(sc, objM);
                                            break;
                                        case 2:
                                            objM.accountDetails(sc, objp);
                                            break;
                                        case 3:

                                            break;
                                        case 4:
                                            objM.allAccountInformation();
                                            break;
                                        case 5:
                                            flag3 = false;
                                            break;
                                        case 6:
                                            System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK " + Pojo.resetColor);
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println(Pojo.setRed + "Something went wrong: " + Pojo.resetColor);
                                            break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println(Pojo.setRed + "Wrong input: (please re-enter your choice)" + Pojo.resetColor);
                                    sc.nextLine();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } else {
                                break;
                            }
                        } while (flag3);
                        break;

                    case 2:
                        System.out.println(Pojo.setBlue + "\t\t\t\t\t\t\t ***** COSTUMER LOGIN PAGE ****" + Pojo.resetColor);
                        String pin = objM.loginUserAccound(sc, objp);
                        boolean flag5 = true;
                        do {
                            if (pin != null) {
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t PRESS 1: View account details \t\t\t\t\t PRESS 2: Update account details \t\t\t");
                                System.out.println("\t\t\t PRESS 3: Apply for loan \t\t\t\t\t PRESS 4: View loan statement \t\t\t");
                                System.out.println("\t\t\t PRESS 5: Transfer money \t\t\t\t\t PRESS 6: Transaction history \t\t\t");
                                System.out.println("\t\t\t PRESS 6: Back menu \t\t\t\t\t\t" + Pojo.setRed + " PRESS 7: Exit Program " + Pojo.resetColor);
                                System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");

                                try {
                                    int choice1 = sc.nextInt();

                                    switch (choice1) {
                                        case 1:
                                            objM.userAccountDetailsC(objp,pin);
                                            break;
                                        case 2:
                                            objM.updateAccountDetails(objp,pin, sc);
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            flag5 = false;
                                            break;
                                        case 7:
                                            System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK " + Pojo.resetColor);
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println("Case not found: ");
                                    }
                                } catch (InputMismatchException e) {
                                    sc.nextLine();
                                    System.out.println("Wrong input please (re-enter)");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                            } else {
                                System.out.println(Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: " + Pojo.resetColor);
                                flag5 = false;
                            }
                        } while (flag5);
                        break;

                    case 3:
                        System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t THANKS FOR VISITING OUR BANK " + Pojo.resetColor);
                        flag2 = false;
                        break;

                    default:
                        System.out.println(Pojo.setRed + "Something went wrong: " + Pojo.resetColor);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(Pojo.setRed + "Wrong input: (please re-enter your choice)" + Pojo.resetColor);
                sc.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (flag2);
    }
}
