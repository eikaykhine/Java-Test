package multiThreading;

class StopThread extends Thread {
	// Initially setting the flag as true

	private volatile boolean flag = true;

	// This method will set flag as false

	public void stopRunning() {
		flag = false;
	}

	@Override
	public void run() {
		// Keep the task in while loop

		// This will make thread continue to run until flag becomes false

		while (flag) {
			System.out.println("I am running....");
		}

		System.out.println("Stopped Running....");
	}

	public static void main(String[] args) {
		StopThread thread = new StopThread();

		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// call stopRunning() method whenever you want to stop a thread

		thread.stopRunning();
	}
}