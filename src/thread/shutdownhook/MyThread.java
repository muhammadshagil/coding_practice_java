package shutdownhook;

public class MyThread extends Thread{

	public void run(){
		System.out.println("shutdown hook task running");
	}
}
