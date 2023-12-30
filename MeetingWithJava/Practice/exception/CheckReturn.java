import java.io.IOException;

class SuperClass {

  void anyMethod() throws Exception{
    System.out.println("Super Class Method");
  }
}

public class CheckReturn extends SuperClass {

  //   static int anyMethod() {
  //     int i = 1;
  //     try {
  //       i = i + 1;
  //       return i;
  //     } catch (Exception e) {
  //       i = i + 2;
  //     } finally {
  //       i = i + 3;
  //       return i;
  //     }
  //   }

  //   public static void main(String[] args) {
  //     try {
  //       NumberFormatException ex = new NumberFormatException();
  //       throw ex;
  //     } catch (NumberFormatException ex) {
  //       System.out.println(1);
  //     }
  //   }

  //   public static void main(String[] args) throws Exception {
  //     try {
  //       try {
  //         try {
  //           throw new Exception();
  //         } catch (Exception ex) {
  //           throw ex;
  //         }
  //       } catch (Exception ex) {
  //         throw ex;
  //       }
  //     } catch (Exception ex) {
  //       throw ex;
  //     }
  //   }

  void anyMethod() throws IOException {
    System.out.println("Sub Class Method");
  }


}