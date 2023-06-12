import java.util.Scanner;

public class PercentageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        byte marks = sc.nextByte();

        if(marks > 90){
            System.out.println("A grade");
        }else if(marks > 80 && marks <= 90){
            System.out.println("B grade");
        }else if(marks >= 60 && marks <= 80){
            System.out.println("C grade");
        }else{
            System.out.println("D grade");
        }
    }
}
