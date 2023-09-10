
import java.io.File;
import java.util.Scanner;


public class CharcterStr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string value: ");
//        String s = sc.nextLine();
        
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\FileHandlingPractice\\src\\DemoData.txt");
        if(f.exists()){
            System.out.println("Found: ");
        }else{
            System.out.println("Not found:");
        }
       
    }
}
