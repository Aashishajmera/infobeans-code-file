import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo{
    public static void main(String[] args) {
        //  File f = new File("userAcc.txt");
        // File fnew = new File("userAcc1.txt");

        String pinNum2 = null;
        try {
            //read data in file : 
            FileReader fr = new FileReader("bank\\userAcc.txt");
            BufferedReader br = new BufferedReader(fr);

            // write new data in new file: 
            FileWriter fw = new FileWriter(fnew);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("\t Enter pin number: \n\t ");
            sc.nextLine();
            pinNum2 = sc.nextLine();

            String line;
            Boolean flag = true;
            while ((line = br.readLine()) != null) {
                String readData[] = line.split("\t");
                if (pinNum2.equals(readData[6])) {
                    System.out.println(Pojo.setYellow + "\t\t\t\t\t\t\t\t ACCOUNT-INFORMATION" + Pojo.resetColor);
                    System.out.println("\t\t\t\t\t\t\t ============================================");
                    System.out.println("\t\t\t\t\t\t\t\tAccount number:  " + readData[0]);
                    System.out.println("\t\t\t\t\t\t\t\tHolder's name: \t" + readData[1]);
                    System.out.println("\t\t\t\t\t\t\t\tFather name: \t" + readData[2]);
                    System.out.println("\t\t\t\t\t\t\t\tAadhar number: \t" + readData[3]);
                    System.out.println("\t\t\t\t\t\t\t\tMobile number: \t" + readData[4]);
                    System.out.println("\t\t\t\t\t\t\t\tDOB:  \t\t" + readData[5]);
//                   System.out.println("\t\t\t\t\t\t\t\t\tAccount number: \t" + readData[6]);
                    System.out.println("\t\t\t\t\t\t\t\tTotal amount: \t" + readData[7]);
                    System.out.println("\t\t\t\t\t\t\t ============================================");
                    flag = false;

                    System.out.println(Pojo.setRed + "\t\t\t\t\t\t\tDo you want to delete this account: (y/n)" + Pojo.resetColor);
                    char ch = sc.next().charAt(0);
                    if (ch == 'y') {
                        System.out.println(Pojo.setGreen + "\t\t\t\t\t\t\t\tAccount successfully delete: " + Pojo.resetColor);
                        continue;
                    } else {
                        bw.write(readData[0] + "\t");
                        bw.write(readData[1] + "\t");
                        bw.write(readData[2] + "\t");
                        bw.write(readData[3] + "\t");
                        bw.write(readData[4] + "\t");
                        bw.write(readData[5] + "\t");
                        bw.write(readData[6] + "\t");
                        bw.write(readData[7] + "\t");
                        bw.write("\n");
                    }
                } else {
                    bw.write(readData[0] + "\t");
                    bw.write(readData[1] + "\t");
                    bw.write(readData[2] + "\t");
                    bw.write(readData[3] + "\t");
                    bw.write(readData[4] + "\t");
                    bw.write(readData[5] + "\t");
                    bw.write(readData[6] + "\t");
                    bw.write(readData[7] + "\t");
                    bw.write("\n");
                }
            }
            fw.close();
            bw.close();
            fr.close();
            br.close();
            
            if (f.exists()) {
                System.out.println("file is exists");
//               fr.close();
//               br.close();
//               fw.close();
//                bw.close();
                f = null;
                f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");
                System.out.println("delet1e file is : " + f.delete());
            }

            File fold = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\BankProject\\userAcc.txt");
            System.out.println("Come:");

            if (fnew.renameTo(fold)) {
                System.out.println("Rename successfull");
            }

            if (flag) {
                System.out.println(Pojo.setRed + "\t\t\t\t\t\t\t\t Account not found: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}