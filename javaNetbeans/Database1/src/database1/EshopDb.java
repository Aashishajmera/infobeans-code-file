package database1;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EshopDb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class Load successfully....");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop", "root", "root");
            System.out.println("Database connected....");

            //to execute sql query: 
            Statement st = con.createStatement();

            System.out.println("What you want do: ");

//            System.out.println("PRESS 1: Describe product table");
//            String descDb = "desc product";
            System.out.println("PRESS 1: Insert data into product table: ");
            System.out.println("PRESS 2: Delete data into product table: ");
            System.out.println("PRESS 3: Update data into product table: ");
            System.out.println("PRESS 4: show all data into product: ");

            byte var = sc.nextByte();

            switch (var) {
                case 1:
                    System.out.println("Enter Product name: ");
                    sc.nextLine();
                    String productName = sc.nextLine();
                    System.out.println("Enter product price: ");
                    int productPrice = sc.nextInt();
                    System.out.println("Enter brand name: ");
                    sc.nextLine();
                    String brandName = sc.nextLine();
                    String insertData = "insert into product(name,price,brand) values('" + productName + "','" + productPrice + "','" + brandName + "')";
                    int valueInsert = st.executeUpdate(insertData);
                    if (valueInsert != -1) {
                        System.out.println("Data inserted successfully .....");
                    } else {
                        System.out.println("Data not inserted.....");
                    }
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    String deleteRow = "delete from product where id = '" + id + "'";
                    int checkDelete = st.executeUpdate(deleteRow);
                    if (checkDelete != 0) {
                        System.out.println("Successfully delete.....");
                    } else {
                        System.out.println("Data not delete.....");
                    }
                    break;
                case 3:
                    System.out.println("Work in progress........");
                    break;
                case 4:
                    String showAllData = "select * from product";
                    Resultset rs = (Resultset) st.executeQuery(showAllData);
//                    while (rs.next()) {
//
//                    }
                default:
                    System.out.println("Invalid case: ");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
