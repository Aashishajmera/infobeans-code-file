package Demo;

import java.util.Scanner;

public class CheckStringvalue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "Aashish ajmera";

        System.out.println("Enter string value: ");
        String name = sc.nextLine();

        if(s == name){
            System.out.println("Name match: ");
        }else{
            System.out.println("Not match: ");
        }
        
    }
}
