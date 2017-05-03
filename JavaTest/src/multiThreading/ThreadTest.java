package multiThreading;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread(0, 3, 300);//for 'extends Thread'
		MyThread t2 = new MyThread(1, 3, 300);//for 'extends Thread'
		MyThread t3 = new MyThread(2, 3, 300);//for 'extends Thread'
		
		Thread thr = new Thread(t1);
		thr.start();
		
		//t1.start();//for 'extends Thread'
		//t2.start();//for 'extends Thread'
		//t3.start();//for 'extends Thread'
	}
}
