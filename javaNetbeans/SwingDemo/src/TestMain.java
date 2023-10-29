
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestMain {

    public static void main(String[] args) {
        JFrame jFram = new JFrame();
        jFram.setLayout(null);

//==========================================================MAIN-CODE======================================================
        // hading lable 
        JLabel jlable = new JLabel("Hading 1");
        jlable.setBounds(370, 30, 300, 10);
        jFram.setFont(new Font("bold", Font.BOLD, 50));
        jFram.add(jlable);
        
//================================================================================================================
        jFram.setVisible(true);
        jFram.setSize(800, 480);
        jFram.setTitle("Demo swing");
        jFram.setLocation(280, 150);
        jFram.getContentPane().setBackground(Color.lightGray);

    }
}
