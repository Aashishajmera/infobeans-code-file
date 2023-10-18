package com.database2prprstmnt.main;

import com.database2prprstmnt.model.CreateAccount;
import com.database2prprtmnt.dao.CrudOperationMethd;
import java.util.Scanner;

public class Database2Prprstmnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want do");
        System.out.println("PRESS 1: insert data");
        System.out.println("PRESS 2: delete row");
        System.out.println("PRESS 3: view all account info");
        int choice = sc.nextInt();

        CreateAccount ca = null;
        switch (choice) {
            case 1:
                System.out.println("Enter holder name");
                String name = sc.nextLine();
                System.out.println("Enter father name");
                String fName = sc.nextLine();
                System.out.println("To active");
                boolean flag = sc.nextBoolean();

                ca = new CreateAccount(name, fName, flag);

                if (CrudOperationMethd.inserData(ca) != -1) {
                    System.out.println("Record successfully inserted.....");
                } else {
                    System.out.println("Oops! Something went wrong...");
                }
                break;
            case 2:
                ca = new CreateAccount();
                System.out.println("Enter your id: ");
                int id = sc.nextInt();

                if (CrudOperationMethd.deleteData(id) != 0) {
                    System.out.println("Account successfully delete....");
                } else {
                    System.out.println("Oops! something went wrong...");
                }
                break;
            case 3:
                CrudOperationMethd.viewAllaccount();
                break;
            default:
                break;

        }
    }

}
