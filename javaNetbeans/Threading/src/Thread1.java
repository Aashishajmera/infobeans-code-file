// create a thread: 

class First extends Thread {

    @Override
    public void run() {
        System.out.println("Java is very simple.....");
    }
}

public class Thread1 {

    public static void main(String[] args) {
        // create object of first class: 

        First ft1 = new First();
        ft1.start();
    }
}
