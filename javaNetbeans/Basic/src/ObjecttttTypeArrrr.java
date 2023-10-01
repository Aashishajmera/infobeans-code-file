
import java.util.Scanner;


class A {
    int age;
    String name;

    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
}

public class ObjecttttTypeArrrr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj[] = new A[3];
        
        for(int i = 0; i < obj.length; i++){
            obj[i] = sc.nextInt();
        }
    }
}
