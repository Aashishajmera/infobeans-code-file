class P2 implements Runnable{

    // Override the run method to asign the job
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Value of i is "+i);
            // stop this thread on every 1 second

            try {
                Thread.sleep(1000);   // throw the interrupted exception
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("I am catch block");
            }

        }
    }

    public static void main(String[] args) {
        P2 t1 = new P2();
        Thread thread = new Thread(t1);
        thread.start();

        for(int j = 1; j <= 10; j++){
            System.out.println("J value is: "+j);
        }
    }
}