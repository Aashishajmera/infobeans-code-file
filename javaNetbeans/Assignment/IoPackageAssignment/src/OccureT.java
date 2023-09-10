
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class OccureT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string value: ");
//        String st = sc.nextLine();

        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Assignment\\IoPackageAssignment\\src\\StoreData.txt");

        try {
            FileOutputStream fos = new FileOutputStream(f);
//            byte arr[] = {65, 116, 66, 67, 116};
//            byte arr[] = {'a', 'b', 't', ' '};
            String s = "java is very simple and most useable language";

            byte arr[] = s.getBytes();
            fos.write(arr);

            FileInputStream fis = new FileInputStream(f);
            int i = fis.read();
            int check = 0;
            while (i != -1) {
                if ('t' == (char) (i)) {
                    check++;
                }
                i = fis.read();
            }

//            while (i != -1) {
//                System.out.println(i);
//                i = fis.read();
//            }
            System.out.println("t maximum occurance is: " + check);
        } catch (Exception e) {
        }
    }
}
