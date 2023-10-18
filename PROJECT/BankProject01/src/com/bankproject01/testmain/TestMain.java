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
                    System.out.println("Admin id: ");
                    int id = sc.nextInt();
                    System.out.println("Admin password: ");
                    sc.nextLine();
                    String password = sc.nextLine();

                    // create object of Admin model
                    Admin admin = new Admin(id, password);

                    if (AdminDao.adminLogin(id, password)) {
                        System.out.println(TestMain.setGreen + "Admin successfully login......" + TestMain.resetColor);
                    } else {
                        System.out.println(TestMain.setRed + "Oops! Something went wrong" + TestMain.resetColor);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
