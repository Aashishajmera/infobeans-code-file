// 16)  Create a program that helps banks to maintain records. It should havefollowing facilities.
// Anybody can create current or saving account with following initial information:
// account number, name, balance, and branch. 
// display account detail for a particular accounts. 
// display total money deposited in bank. 
// allow deposit and withdrawal in an account . 
// for saving account opening balance and minimum balance must be 5000.
// for current account opening balance and minimum balance must be 1000.
// can not withdraw the amount from the account that makes balance less than the minimum balance.

import java.util.Scanner;

import javax.security.sasl.Sasl;

class Bank {

    // data member:
    private String aNumber;
    private String name;
    private float balance;
    private String branch;
    private String bank;

    // default constructor:
    public Bank() {

    }

    // parameterized constructor:
    public Bank(String aNumber, String name, String branch, float balance, String bank) {
        this.aNumber = aNumber;
        this.name = name;
        this.branch = branch;
        this.balance = balance;
        this.bank = bank;
    }

    // set account number:
    public void setANumber(String aNumber) {
        this.aNumber = aNumber;
    }

    // set name:
    public void setName(String name) {
        this.name = name;
    }

    // set bank:
    public void setBank(String bank) {
        this.bank = bank;
    }

    // set branch:
    public void setBranch(String branch) {
        this.branch = branch;
    }

    // set balance:
    public void setBalance(float balance) {
        this.balance = balance;
    }

    // get account number:
    public String getANumber() {
        return aNumber;
    }

    // get name :
    public String getName() {
        return name;
    }

    // get bank:
    public String bank() {
        return bank;
    }

    // get branch :
    public String getBranch() {
        return branch;
    }

    // get balance:
    public float getBalance() {
        return balance;
    }

    // display the data:
    public void displayData() {
        System.out.println("Account number: \t" + aNumber);
        System.out.println("Account holder name: \t" + name);
        System.out.println("Bank name: \t\t" + bank);
        System.out.println("Balance \t\t" + balance);
        System.out.println("Branch name: \t\t" + branch);
    }

}

// SAVING - ACCOUNT ------------------------------------------------
class SavingAccount {
    Scanner sc = new Scanner(System.in);

    // default constructor:
    public SavingAccount() {

    }

    // parameterized constructor:
    public SavingAccount(String aNum, String name, String bank, String branch, float balance, Bank objB) {
        objB.setANumber(aNum);
        objB.setName(name);
        objB.setBank(bank);
        objB.setBranch(branch);
        objB.setBalance(balance);
    }

    // check account create or not:
    public boolean checkAccount(Bank objB, float balance) {
        byte check = 0;
        while (check == 0) {
            if (objB.getBalance() > 5000) {
                System.out.println("Congratulations, your account has been created in " + objB.getBranch() + " branch: \n");
                objB.displayData();
                check++;
                return true;
            } else {
                System.out.println("Please enter money 5000 above than create your saving account: ");
                objB.setBalance(sc.nextFloat());
            }
        }
        return true;
    }

}

// CURRENT - ACCOUNT ----------------------------------------------
class CurrentAccount {
    Scanner sc = new Scanner(System.in);

    // default constructor:
    public CurrentAccount() {

    }

    // parameterized constructor:
    public CurrentAccount(String aNum, String name, String bank, String branch, float balance, Bank objB) {
        objB.setANumber(aNum);
        objB.setName(name);
        objB.setBank(bank);
        objB.setBranch(branch);
        objB.setBalance(balance);
    }

    // check account create or not:
    public boolean checkAccount(Bank objB, float balance) {
        byte check = 0;
        while (check == 0) {
            if (objB.getBalance() > 1000) {
                System.out.println("Congratulations, your account has been created in " + objB.getBranch() + " branch: \n");
                objB.displayData();
                check++;
                return true;
            } else {
                System.out.println("Please enter money 1000 above than create your curren account: ");
                objB.setBalance(sc.nextFloat());
            }
        }
        return true;

    }

    //

}

// --------------------------------------MAIN-CLASS------------------------------------------
class Q16BankAccount {
    public static void main(String[] args) {
        String aNumber;
        String name;
        String branch;
        String bank;
        float balance;

        Scanner sc = new Scanner(System.in);

        // create object of savingAccount:
        SavingAccount objS = new SavingAccount();

        // create object of currentAccount:
        CurrentAccount objC = new CurrentAccount();

        // create object of Bank class:
        Bank objB = new Bank();

        System.out.println("Which account do you want to create? Current or savings ");
        String choice = " ";

        boolean flag = false;
        while (flag == false) {
            choice = sc.nextLine();
            switch (choice) {
                case "Saving", "saving":

                    System.out.println("Enter account number: ");
                    aNumber = sc.nextLine();
                    System.out.println("Account holder name: ");
                    name = sc.nextLine();
                    System.out.println("Bank name: ");
                    bank = sc.nextLine();
                    System.out.println("Which branch: ");
                    branch = sc.nextLine();
                    System.out.println("Enter initial money: ");
                    balance = sc.nextFloat();
                    sc.nextLine();

                    new SavingAccount(aNumber, name, bank, branch, balance, objB);

                    // check account are create or not:
                    System.out.println();
                    flag = objS.checkAccount(objB, balance);
                    System.out.println();

                    break;

                case "current", "Current":

                    System.out.println("Enter account number: ");
                    aNumber = sc.nextLine();
                    System.out.println("Account holder name: ");
                    name = sc.nextLine();
                    System.out.println("Bank name: ");
                    bank = sc.nextLine();
                    System.out.println("Which branch: ");
                    branch = sc.nextLine();
                    System.out.println("Enter initial money: ");
                    balance = sc.nextFloat();
                    sc.nextLine();

                    new CurrentAccount(aNumber, name, bank, branch, balance, objB);

                    // check account are create or not:
                    System.out.println();
                    flag = objC.checkAccount(objB, balance);
                    System.out.println();

                    break;

                case "exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("please Enter right type of account: ");
            }

        }

        while (flag) {
            System.out.println(
                    "  press 1 : case withdrawal \n  press 2 : case inquiry \n  press 3 : case deposite \n  press 0 : exit");
            int choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Total amount is: " + objB.getBalance());
                    System.out.println("Enter withdrawal amount: ");
                    int amount = sc.nextInt();
                    if (choice.equals("current") && choice.equals("Current")) {
                        if (objB.getBalance() - amount > 1000) {
                            System.out.println("withdrawal successfull: ");
                            System.out.println("remainder  balance is: " + (objB.getBalance() - amount));
                        } else {
                            System.out.println("Not sufficent: ");
                        }
                    } else {
                        if (objB.getBalance() - amount > 5000) {
                            System.out.println("withdrawal successfull: ");
                            System.out.println("remainder  balance is: " + (objB.getBalance() - amount));
                        } else {
                            System.out.println("Not sufficent: ");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Total amoun is: " + objB.getBalance());
                    break;

                case 3:
                    System.out.println("Enter amount for case deposite: ");
                    int deposit = sc.nextInt();
                    objB.setBalance(objB.getBalance() + deposit);
                    System.out.println("deposite successfull: ");
                    System.out.println("Total amount is: " + (objB.getBalance()));
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("please press right key: ");
            }
        }

    }
}