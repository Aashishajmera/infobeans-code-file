import java.util.Scanner;

class voting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("your eligible");
        }else{
            System.out.println("your not eligible");
        }
    }
}