public class P5 extends Thread {

  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("i value is: " + i);
    //   try {
    //     Thread.sleep(3000);
    //   } catch (Exception e) {}
    }
  }

  // main method
  public static void main(String[] args) {
    P5 t = new P5();
    t.start();
    try {
      t.wait(3000);
    } catch (Exception e) {}

    for (int j = 1; j <= 10; j++) {
      System.out.println("J value is::::" + j);
    }
  }
}
