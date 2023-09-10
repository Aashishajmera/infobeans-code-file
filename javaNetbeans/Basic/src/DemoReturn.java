
import java.util.Scanner;

public class DemoReturn {

    public boolean m1() {
        Scanner sc = new Scanner(System.in);
        String s = "Aashish";
        boolean flag = true;
        try {
            if (s.equals(s)) {
                System.out.println("vlaue is exists....");
                return flag;
            } else {
                flag = false;
                return flag;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return flag;
        }
    }

    public static void main(String[] args) {
        // DemoReturn object
        DemoReturn objD = new DemoReturn();
        objD.m1();
    }
}
