package Multi_Threading;

public class MultiThread_App3 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {

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
		});
		
		thread1.start();
	}

}
