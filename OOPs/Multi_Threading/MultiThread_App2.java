package Multi_Threading;

class StartThreads1 implements Runnable{

	public void run() {
		for(int n=0; n<8; n++) {
			System.out.println("Hi there! " + n);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread_App2 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new StartThreads1());
		Thread thread2 = new Thread(new StartThreads1());
		
		thread1.start();
		thread2.start();
	}
}

