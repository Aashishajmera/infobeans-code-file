import java.util.Scanner;

public class ArrayOfObj {

  int id;
  String name;

  public ArrayOfObj(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "id: " + id + " name: " + name;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many user: ");
    int user = sc.nextInt();

    ArrayOfObj arr[] = new ArrayOfObj[user];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter " + (i + 1) + " user detiels: ");

      System.out.println("Enter id: ");
      int id = sc.nextInt();
      System.out.println("Enter name: ");
      sc.nextLine();
      String name = sc.nextLine();

      arr[i] = new ArrayOfObj(id, name);
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
