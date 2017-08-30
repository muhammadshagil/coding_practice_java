package synchronization;

public class Table {
	public synchronized void printTable(int n) {
//		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " * " + n + " = " + i * n);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
//		}
		for(int i=1;i<=5;i++){
			System.out.println(i+" * "+2*n+" = "+i*2*n);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}
