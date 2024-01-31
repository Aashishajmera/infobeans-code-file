public class P4 extends Thread {

    public static void main(String[] args) {

        P4 t1 = new P4();
        P4 t2 = new P4();
        System.out.println("Start thread");
        // get a current thread
        System.out.println(Thread.currentThread());
        // get name of current thread
        System.out.println(Thread.currentThread().getName());
        // change the name of current thread
        Thread.currentThread().setName("no_Name");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority()+"----------------------------");
        System.out.println(Thread.currentThread().MIN_PRIORITY);
        System.out.println(Thread.currentThread().NORM_PRIORITY);
        System.out.println(Thread.currentThread().MAX_PRIORITY);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setName("name3");
        System.out.println(t1.getName());
        t1.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(Thread.currentThread().getPriority()+"----------------------------");


        System.out.println("End thread");
    }
}
