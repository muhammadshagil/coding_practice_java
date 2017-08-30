package synchronization;

public class TestSynchronization {

	public static void main(String[] args) {
		Table table = new Table();
//		TestSynchronization testSynchronization = new TestSynchronization();
//		MyThread myThread1 = new MyThread(table, 5);
//		MyThread myThread2 = new MyThread(table, 100);
//		
//		myThread1.start();
//		myThread2.start();
		
		Thread myThread1 = new Thread(){
			public void run(){
				table.printTable(5);
			}
		};
		
		Thread myThread2 = new Thread(){
			public void run(){
				table.printTable(100);
			}
		};
		
		myThread1.start();
		myThread2.start();
	}
}

//class MyThread extends Thread {
//	Table table;
//	int n;
//	MyThread(Table table, int n){
//		this.table = table;
//		this.n = n;
//	}
//	public void run(){
//		table.printTable(n);
//	}
//}