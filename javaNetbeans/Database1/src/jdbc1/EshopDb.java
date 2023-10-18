package jdbc1;

import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

            // to use show the all data from product table 
            PreparedStatement ps = null;

            // result set 
            ResultSet rs = null;

            // formating show all data 
            ResultSetMetaData rsmd = null;

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
                    System.out.println("Do you want to change name (y/n)");
                    char checkName = sc.next().charAt(0);
                    if (checkName == 'y') {
                        System.out.println("Enter update name: ");
                        sc.nextLine();
                        String updateName = sc.nextLine();
                        while (updateName.isBlank()) {
                            updateName = sc.nextLine();
                        }
                        System.out.println("Enter id: ");
                        int idN = sc.nextInt();
                        String uName = "update product set name = '" + updateName + "' where id = '" + idN + "'";
                        int checkUpdateName = st.executeUpdate(uName);
                        if (checkUpdateName != 0) {
                            System.out.println("change successfully.....");
                        } else {
                            System.out.println("Not change name....");
                        }
                    }
                    break;
                case 4:
                    String showAllData = "select * from product";
                    ps = con.prepareStatement(showAllData);
                    rs = ps.executeQuery();

                    rsmd = rs.getMetaData();
//                    System.out.println(rsmd.getColumnName(1) + "\t\t" + rsmd.getColumnName(2) + "\t\t" + rsmd.getColumnName(3) + "\t\t" + rsmd.getColumnName(4));
                    System.out.println(rsmd.getColumnName(1) + "\t    " + rsmd.getColumnName(2) + "\t    " + rsmd.getColumnName(3) + "\t    " + rsmd.getColumnName(4));

                    while (rs.next()) {
//                        System.out.println(rs.getInt("id") + "\t\t" + rs.getString("name") + "\t" + rs.getString("price") + "\t" + rs.getString("brand"));
                        System.out.format(rs.getInt(1) + "\t    " + rs.getString(2) + "\t    " + rs.getString(3) + "\t    " + rs.getString(4));
                        System.out.println();

                    }
                    break;
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
