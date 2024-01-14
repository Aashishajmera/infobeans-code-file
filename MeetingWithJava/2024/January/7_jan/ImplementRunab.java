public class ImplementRunab implements Runnable {

  public void run() {
    System.out.println("I m run....");
  }

  public static void main(String[] args) {
    ImplementRunab obj = new ImplementRunab();
    Thread objThread = new Thread(obj);
    objThread.start();
    for (int i = 1; i <= 10; i++) {
      System.out.println("I am main...");
    }
  }
} 
