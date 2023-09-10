
import java.io.Serializable;


public class Employee implements Serializable{

    String mo_number;
    String name;
    int id;

    public Employee(String mo_number, String name, int id) {
        this.mo_number = mo_number;
        this.name = name;
        this.id = id;
    }

    public String getMo_number() {
        return mo_number;
    }

    public void setMo_number(String mo_number) {
        this.mo_number = mo_number;
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
