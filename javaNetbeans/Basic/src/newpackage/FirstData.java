package newpackage;

import java.util.Scanner;

public class FirstData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Entr a name");
        sc.nextLine();
        String name = sc.nextLine();

        //        create a object of pojo class
        Pojo pj = new Pojo(n,name);
        
        pj.displayDeta();
        System.out.println("Enter new name: ");
        pj.setName(sc.nextLine());
        
    }
}
