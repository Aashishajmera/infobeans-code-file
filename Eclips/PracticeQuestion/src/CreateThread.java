class AThread extends Thread {
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + getName());
//		}
//	}
}

public class CreateThread {
	public static void main(String[] args) {
		AThread aThread = new AThread();
		AThread aThread2 = new AThread();
		AThread aThread3 = new AThread();

//		aThread.run();
//		aThread2.run();
//		aThread3.run();

		
		aThread.start();
		aThread2.start();
		aThread3.start();

//		aThread.m1();
//		aThread2.m1();

	}
}
