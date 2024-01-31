public class P3 extends Thread {
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("i value is: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("I am catch block");
            }
        }
    }


    // main method
    public static void main(String[] args) {
        P3 t = new P3();
        t.start();
    }
}
