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

public class Thread2 {

    public static void main(String[] args) {

        // create object of first thread class: 
        First ft = new First();
        ft.start();

        // create object of second thread class: 
        Second st = new Second();
        st.start();
        
    }
}
