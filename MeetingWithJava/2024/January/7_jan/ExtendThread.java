public class ExtendThread extends Thread {

  // run method override
  //   @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("I am thread....."+getName());
    }
  }

  public static void main(String[] args) {
    // create a object of thread
    ExtendThread obj = new ExtendThread();
    ExtendThread obj2 = new ExtendThread();
    obj2.start();
    obj.start();
    try {
      //   obj.join();
      obj.sleep(3000);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Some exception....");
    }
    // obj.run();
    for (int i = 1; i <= 10; i++) {
      System.out.println("I am main method.....");
    }
  }
}
