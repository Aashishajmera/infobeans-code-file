
import java.util.Scanner;

class Pojo {

    int id;
    String name;
    float salary;

    public Pojo(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}

public class ObjectType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Number: ");
        int size = sc.nextInt();

        Pojo pj[] = new Pojo[size];
        Pojo pj1 = null;

        for (int i = 0; i < pj.length; i++) {
            System.out.println("Enter name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            System.out.println("Enter salary: ");
            float salary = sc.nextFloat();

            pj1 = new Pojo(id, name, salary);
        }

        for (int i = 0; i < pj.length; i++) {
            System.out.println("Name: " + pj1.getName() + " Id: " + pj1.getId() + " Salary: " + pj1.getSalary());
        }
    }
}
