class UseRunable implements Runnable{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Value of i is "+i);
        }
    }

    public static void main(String[] args) {
        UseRunable t1 = new UseRunable();
        Thread thread = new Thread(t1);
        thread.start();
    }
}