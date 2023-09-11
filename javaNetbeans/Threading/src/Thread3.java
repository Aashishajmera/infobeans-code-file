// create a thread: 

class First extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Java is simple...");
        }
    }
}

class Second extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Java is hard...");
            i++;
        }
    }
}

class Third extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Java is nothing but everything...");
        }
    }
}

public class Thread3 {

    public static void main(String[] args) {

        try {
            // create object of first thread class: 
            First ft = new First();
            ft.start();
            ft.join();

            // create object of second thread class: 
            Second st = new Second();
            st.start();

            // create object of third class: 
            Third tt = new Third();
            tt.start();
            st.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
