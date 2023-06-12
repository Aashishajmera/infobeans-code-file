import java.util.Scanner;

public class FiveSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter maths marks: ");
        int maths = sc.nextInt();
        System.out.println("Enter chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.println("Enter biology marks: ");
        int biology = sc.nextInt();
        System.out.println("Enter computer marks: ");
        int computer = sc.nextInt();

        int percent = (physics + maths + chemistry + biology + computer)/5;
        if(percent >= 90 && percent <= 100){
            System.out.println(percent +"% A grade: ");
        }else if(percent >= 80){
            System.out.println(percent +"% B grade: ");
        }else if(percent >= 70){
            System.out.println(percent +"% C grade: ");
        }else if(percent >= 60){
            System.out.println(percent +"% D grade: ");
        }else if(percent >= 40){
            System.out.println(percent +"% E grade: ");
        }else{
            System.out.println(percent +"% F grade: ");
        }
    }
}
