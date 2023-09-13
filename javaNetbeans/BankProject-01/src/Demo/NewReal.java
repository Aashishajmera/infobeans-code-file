package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class CostumerReal {

    private String name;
    private int id;

    public CostumerReal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

public class NewReal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        
        // create object of customerreal
        CostumerReal cr = new CostumerReal(name, id);
        

        File f = new File("D:\\Infobeans_Foundation\\javaNetbeans\\BankProject-01\\src\\Demo\\newReal.txt");

        try {
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f,true);

            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(name +"\t");
            bw.write(id+"\t");
            bw.write("\n");
            
            bw.flush();
            bw.close();
            
            // read data 
            System.out.println("Found id: ");
//            sc.nextLine();
            int id2 = sc.nextInt();
            
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            boolean flag = true;
            while((line = br.readLine()) != null){
                String lineReal[] = line.split("\t");
                if(id2 == Integer.parseInt(lineReal[1])){
                    System.out.println("Name: "+lineReal[0] +" Id: "+lineReal[1]);
                    flag = false;
                }
                line = br.readLine();
            }
            if(flag == true){
                System.out.println("Account not found: ");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
