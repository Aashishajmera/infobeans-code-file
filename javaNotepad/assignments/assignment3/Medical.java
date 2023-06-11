import java.util.Scanner;
public class Medical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("medical cause or not ( 'y' or 'n' )");
        char medical = sc.next().charAt(0);
        if(medical == 'y'){
            System.out.println("sit: ");
        }else{
            System.out.println("you can't sit: ");
        }
    }
}
