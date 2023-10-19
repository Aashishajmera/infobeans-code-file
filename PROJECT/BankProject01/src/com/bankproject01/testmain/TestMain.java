package com.bankproject01.testmain;

import com.bankproject01.dao.AdminDao;
import com.bankproject01.model.Admin;
import java.util.Scanner;

public class TestMain {

    // Color
    static String setRed = "\u001B[31m";
    static String setYellow = "\u001B[33m";
    static String setGreen = "\u001B[32m";
    static String resetColor = "\u001B[0m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t\t PRESS 1: Addmin login \t\t\t PRESS 2: Customer login \t\t\t" + TestMain.setRed + " PRESS 3: Exit" + TestMain.resetColor);
            System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    
                    System.out.println(TestMain.setYellow + "\t\t\t\t\t\t\t ***** ADMIN LOGIN PAGE *****\n\t " + TestMain.resetColor);
                    
                    System.out.println("Admin id: ");
                    int id = sc.nextInt();
                    System.out.println("Admin password: ");
                    sc.nextLine();
                    String password = sc.nextLine();

                    // create object of Admin model
                    Admin admin = new Admin(id, password);
                    
                    if (AdminDao.adminLogin(id, password)) {
                        System.out.println(TestMain.setGreen + "Admin successfully login......" + TestMain.resetColor);
                        
                        System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                        System.out.println("\t\t\t PRESS 1: Create a new customer account \t\t\t\t PRESS 2: View any account information \t\t\t");
                        System.out.println("\t\t\t PRESS 3: Remove or Block account \t\t\t\t PRESS 4: View all account list \t\t\t");
                        System.out.println("\t\t\t PRESS 5: Back menu" + TestMain.setRed + "\t\t\t\t\t\t PRESS: 6 Exit program" + TestMain.resetColor);
                        System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
                        
                        int adminChoice = sc.nextInt();
                        
                        switch (adminChoice) {
                            case 1:
                                
                                break;
                            case 2:
                                System.out.println("work in progress");
                                break;
                            
                            case 3:
                                System.out.println("work in progress");
                                
                                break;
                            case 4:
                                System.out.println("work in progress");
                                
                                break;
                            case 5:
                                break;
                            case 6:
                                System.exit(0);
                                break;
                            default:
                                System.out.println(TestMain.setRed + "Something went wrong: " + TestMain.resetColor);
                        }
                        
                    } else {
                        System.out.println(TestMain.setRed + "Oops! Something went wrong" + TestMain.resetColor);
                    }
                    break;
                
                default:
                
            }
        }
    }
}
