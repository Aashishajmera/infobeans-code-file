
import java.io.File;

public class FolderDir {

    public static void main(String[] args) {
        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Demo2");
        try {
            if (f.exists()) {
                System.out.println(f.getName());
                f = new File(f, "Test1.txt");
                f.createNewFile();
                System.out.println(f.getName());
                System.out.println(f.delete());
            } else {
                f.mkdir();
                System.out.println("Not found: ");
            }
        } catch (Exception e) {
        }
    }
}
