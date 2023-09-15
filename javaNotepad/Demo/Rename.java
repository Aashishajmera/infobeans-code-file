import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Rename {

  public static void main(String[] args) {
    File f = new File(
      "D:\\Infobeans_Foundation\\javaNotepad\\Demo\\normal.txt"
    );

    File fnew = new File(
      "D:\\Infobeans_Foundation\\javaNotepad\\Demo\\text1.txt"
    );


    try {
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Aashish\t");
        bw.write("Ajmera");

        bw.close();

        FileWriter fw1 = new FileWriter(fnew);
        BufferedWriter bw1 = new BufferedWriter(fw1);

        bw1.write("Deepak\t");
        bw1.write("Ajmera");

        bw1.close();
        f.delete();
      File fold = new File("D:\\Infobeans_Foundation\\javaNotepad\\Demo\\normal.txt");
      fnew.renameTo(fold);
     

    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}
