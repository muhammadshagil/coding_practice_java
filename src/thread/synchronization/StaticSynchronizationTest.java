package synchronization;

public class StaticSynchronizationTest {

	public static void main(String[] args) {
		final MultiTable table = new MultiTable();
		Thread myThread1 = new Thread(){
			public void run(){
				table.printTable(1);
			}
		};
		Thread myThread2 = new Thread(){
			public void run(){
				table.printTable(5);
			}
		};
		Thread myThread3 = new Thread(){
			public void run(){
				table.printTable(10);
			}
		};
		Thread myThread4 = new Thread(){
			public void run(){
				table.printTable(100);
			}
		};
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();

	}

}

class MultiTable {
	public synchronized static void printTable(int n){
//		synchronized (MultiTable.class) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " * " + n + " = " + i * n);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
//	}
	}
}