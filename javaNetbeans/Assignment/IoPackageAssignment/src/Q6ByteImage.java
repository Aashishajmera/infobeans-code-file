
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

// Que. 6 Write a program to count number of bytes in a image file(jpeg/png/gif). Also find how
//much time it will take to upload the file on server if internet speed is 256 bps(bitsper
//second).
public class Q6ByteImage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\Assignment\\IoPackageAssignment\\src\\byteImg.txt");
        
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);
            
            fos.write();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
