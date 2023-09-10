
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
// ------------------------------------------POJO-CLASS-------------------------------------------------

class Pojo {

    // Color
    String setRed = "\u001B[31m";
    String setBlue = "\u001B[34m";
    String setGreen = "\u001B[32m";
    String resetColor = "\u001B[0m";

    public String getSetRed() {
        return setRed;
    }

    public void setSetRed(String setRed) {
        this.setRed = setRed;
    }

    public String getSetBlue() {
        return setBlue;
    }

    public void setSetBlue(String setBlue) {
        this.setBlue = setBlue;
    }

    public String getSetGreen() {
        return setGreen;
    }

    public void setSetGreen(String setGreen) {
        this.setGreen = setGreen;
    }

    public String getResetColor() {
        return resetColor;
    }

    public void setResetColor(String resetColor) {
        this.resetColor = resetColor;
    }

}

// ------------------------------------------METHOD-CLASS-------------------------------------------------
class Methods {
// Admin login: 

    public void adminLogin(Scanner sc, Pojo objp) {

        // create a file of adminLogin class: 
        File fadmin = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\admin.txt");
        boolean flag = true;

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
            if (br.readLine().contains(name)) {
                if(br.readLine().contains(password)){
                    System.out.println(objp.setGreen+"Login successful...."+objp.resetColor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
//            return flag;
        }

    }
}

// ------------------------------------------OPERATION-CLASS-------------------------------------------------
class Operation {

    public void main(Scanner sc) {
        // create object of pojo class
        Pojo objp = new Pojo();

        String setRed = objp.getSetRed();
        String setBlue = objp.getSetBlue();
        String setGreen = objp.getSetGreen();
        String resetColor = objp.getResetColor();

        //create object of method class 
        Methods objM = new Methods();

        System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
        System.out.println(" \t\t\t PRESS 1: Addmin login \t\t\t PRESS 2: Costumer login \t\t\t PRESS 3: Exit");
        System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\t\t\t\t\t\t\t ***** Admin login page *****");
//                boolean flag = objM.adminLogin(sc, objp);
                objM.adminLogin(sc, objp);
//                if (flag) {
//                    System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
//                    System.out.println("\t\t\t PRESS 1: Create a new costumer account \t\t\t PRESS 2: View any account information \t\t\t");
//                    System.out.println("\t\t\t PRESS 3: Remove or Block account \t\t\t PRESS 4: View all account list \t\t\t");
//                    System.out.println("\t\t\t-------------------------------------------------------------------------------------------------------");
//                }
                break;

            case 2:
                System.out.println("\t\t\t\t\t\t\t ***** Costumer login page ****");
                break;

            case 0:
                System.out.println("\t\t\t\t\t\t\t Thanaks for visiting out bank:");
                System.exit(0);
                break;

            default:
                System.out.println("Something went wrong: ");
                break;
        }
    }
}
// ------------------------------------------MAIN-CLASS-------------------------------------------------

public class TestMainBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create object of Operation class: 
        Operation objo = new Operation();
        objo.main(sc);
    }
}
