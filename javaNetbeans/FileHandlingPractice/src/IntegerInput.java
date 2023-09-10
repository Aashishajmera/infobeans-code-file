
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;

public class IntegerInput {
    
    public static void main(String[] args) {

        // create a object of file class: 
        File f = new File("integerInput.txt");

        // create a object of fileWriter class: 
        FileWriter fw = null;
        
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            System.out.println(f.getAbsolutePath());
            
            fw = new FileWriter(f);
            int n = 999;
//            fw.write(n.toString());
            
        } catch (InputMismatchException e) {
            System.out.println("Wrong input: ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
