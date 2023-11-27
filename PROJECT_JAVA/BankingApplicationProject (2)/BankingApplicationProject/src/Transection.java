import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transection implements ActionListener {
    JFrame fram10 = new JFrame("BANKING_APPLICATION");
    private JButton login, clear, back;
    private JTextField ac, money;
    private JFrame fram11 = new JFrame("BANKING_APPLICATION");
    public int count = 0;

    public void transfer() {
        fram10.setLayout(null);

        // 1 label text
        JLabel text1 = new JLabel("Transfer Money");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(250, 25, 400, 40);
        fram10.add(text1);

        // label 2 text
        JLabel text2 = new JLabel("Account Number :");
        text2.setFont(new Font("Osward", Font.BOLD, 20));
        text2.setBounds(110, 150, 200, 30);
        fram10.add(text2);

        // text field 1
        ac = new JTextField();
        ac.setFont(new Font("Osward", Font.PLAIN, 18));
        ac.setBounds(290, 150, 250, 30);
        fram10.add(ac);

        // label 3 text
        JLabel text3 = new JLabel("Transfer Money :");
        text3.setFont(new Font("Osward", Font.BOLD, 20));
        text3.setBounds(110, 200, 200, 30);
        fram10.add(text3);

        // text field 2
        money = new JTextField();
        money.setFont(new Font("Osward", Font.PLAIN, 18));
        money.setBounds(290, 200, 250, 30);
        fram10.add(money);

        // login button
        login = new JButton("Transfer");
        login.setFont(new Font("Raleway", Font.BOLD, 18));
        login.setBounds(290, 250, 120, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        fram10.add(login);

        // clear button
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Raleway", Font.BOLD, 18));
        clear.setBounds(420, 250, 120, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        fram10.add(clear);

        // back button
        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(290, 300, 250, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        fram10.add(back);

        fram10.getContentPane().setBackground(Color.white); // contener color
        fram10.setSize(800, 480); // set size
        fram10.setVisible(true); // visible
        fram10.setLocation(350, 200); // location

    }

    public void transectionhistory() {
        try {
            // back button
            back = new JButton("BACK");
            back.setFont(new Font("Raleway", Font.BOLD, 20));
            back.setBounds(10, 400, 100, 40);
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.addActionListener(this);
            fram11.add(back);

            // read dat
            String q4 = "select * from transection where holder=" + C_UserLogin.acnumber;
            D_DatabaseConnection obj1 = new D_DatabaseConnection();
            ResultSet rest = obj1.s.executeQuery(q4);
            String data[][] = new String[10][5];
            for (int i = 0; rest.next(); i++) {
                data[i][0] = rest.getString("date");
                data[i][1] = rest.getString("description");
                data[i][2] = rest.getString("debit");
                data[i][3] = rest.getString("credit");
                data[i][4] = rest.getString("balance");
            }
            String column[] = { "Date", "Description", "Debit", "Credit", "Total" };

            JTable jt = new JTable(data, column);
            JScrollPane sp = new JScrollPane(jt);
            fram11.add(sp);

            fram11.getContentPane().setBackground(Color.white);
            fram11.setSize(800, 480);
            fram11.setLocation(350, 200);
            fram11.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            // JOptionPane.showMessageDialog(null, "Somthing Want Wrong");
        }
    }

    public void actionPerformed(ActionEvent event10) {
        if (event10.getSource() == login) {
            String ac1 = C_UserLogin.acnumber;
            String ac2 = ac.getText();
            String m = money.getText();
            Double money = 0.0, t1 = 0.0, t2 = 0.0;
            Double total1 = 0.0, total2 = 0.0;

            if (!ac2.matches("^[0-9]+$") || ac2.length() != 10) {
                JOptionPane.showMessageDialog(null, "Invelid Account Number");
            } else if (!m.matches("^[0-9.]+$")) {
                JOptionPane.showMessageDialog(null, "Invelid Amount");
            } else {

                D_DatabaseConnection obj1 = new D_DatabaseConnection();
                try {
                    String query1 = "select * from account where Account_Number = " + ac1;
                    ResultSet rest1 = obj1.s.executeQuery(query1);
                    String am1 = "";
                    while (rest1.next()) {
                        am1 = rest1.getString("Amount");
                    }

                    String query2 = "select * from account where Account_Number = " + ac2;
                    ResultSet rest2 = obj1.s.executeQuery(query2);
                    String am2 = "";
                    while (rest2.next()) {
                        am2 = rest2.getString("Amount");
                    }

                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String date = currentDate.format(formatter);

                    t1 = Double.parseDouble(am1);
                    t2 = Double.parseDouble(am2);
                    money = Double.parseDouble(m);
                    if (ac1.equals(ac2)) {
                        JOptionPane.showMessageDialog(null, "Account Number Must Be Different");
                    } else if (!(t1 > money)) {
                        JOptionPane.showMessageDialog(null, "Account Balance Not Sufficient");
                    } else {
                        total1 = t1 - money;
                        total2 = t2 + money;

                        String qurry = "insert into transection values('" + date + "','" + ac1 + "','" + ac2 + "',"
                                + money
                                + ",null," + total1 + "),('" + date + "','" + ac2 + "','" + ac1 + "',null," + money
                                + ","
                                + total2 + ")";
                        obj1.s.executeUpdate(qurry);
                        String q1 = "update account set amount=" + total1 + " where Account_Number = " + ac1 + "";
                        obj1.s.executeUpdate(q1);
                        String q2 = "update account set amount=" + total2 + " where Account_Number = " + ac2 + "";
                        obj1.s.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null, "Transfer Money Successfluy");
                        fram10.setVisible(false);
                        fram10.dispose();
                    }
                } catch (Exception e) {
                    // JOptionPane.showMessageDialog(null, "Somthing Want Wrong");
                }

            }
        } else if (event10.getSource() == clear) {
            ac.setText(null);
            money.setText(null);
        } else if (event10.getSource() == back) {
            fram10.setVisible(false);
            fram10.dispose();
            fram11.setVisible(false);
            fram11.dispose();
        }
    }
    // public static void main(String[] args) {
    // Transection obj = new Transection();
    // obj.transfer();
    // }
}