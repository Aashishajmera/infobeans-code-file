
class First extends Thread {

    @Override
    public void run() {
        System.out.println("Please wait...");

        try {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            Thread.sleep(3000);

            System.out.println("Sum is: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class Thread4 {

    public static void main(String[] args) {

        try {
            // create object of first thread class: 
            First ft = new First();
            ft.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
