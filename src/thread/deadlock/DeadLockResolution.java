package deadlock;

public class DeadLockResolution {

	public static void main(String[] args) {
		String resource1 = "resource 1";
		String resource2 = "resourse 2";
		
		Thread thread1 = new Thread(){
			public void run(){
				synchronized(resource1) {
					System.out.println("thread 1 locked resource 1");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("thread 1 accessing resource 2");	
					};
				}
			}
		};
		
		Thread thread2 = new Thread(){
			public void run(){
				synchronized (resource1) {
					System.out.println("thread2 locked resource1");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("thread2 accessing resource2");
					}
				}
			}
		};
		
		thread1.start();
		thread2.start();

	}

}
