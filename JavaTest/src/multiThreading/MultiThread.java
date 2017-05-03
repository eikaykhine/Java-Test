package multiThreading;

public class MultiThread extends Thread {
	public synchronized void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i::" + i);
		}
	}

	public static void main(String[] args) {
		MultiThread obj = new MultiThread();

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);

		t1.start();
		t2.start();
		t3.start();
		
	}
}
