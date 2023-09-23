package revesion;

import java.util.Scanner;

public class RevesionSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        String line = sc.nextLine();
        switch (line) {
            case "Aashish":
                System.out.println("case 1: ");
                break;
            case "Deepak":
                System.out.println("case 2: ");
                break;
            default:
                System.out.println("case not match: ");
        }
    }

}
