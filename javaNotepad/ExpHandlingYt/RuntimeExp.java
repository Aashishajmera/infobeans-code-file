class UnderAgeException extends RuntimeException {

  UnderAgeException(String msg) {
    super(msg);
  }
}

public class RuntimeExp {

  public static void main(String[] args) {
    Throws1.Voting();
  }

  static void Voting() {
    int age = 12;
    if(age < 18){
        throw new UnderAgeException("Under age : ");
    }else{
        System.out.println("You can go for vote: ");
    }
    System.out.println(" " + age);
  }
}
