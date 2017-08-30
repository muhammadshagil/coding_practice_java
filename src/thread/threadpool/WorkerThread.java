package threadpool;

public class WorkerThread implements Runnable{
	String message;
	
	WorkerThread(String message){
		this.message= message;
	}

	@Override
	public void run() {
		System.out.println("START: Thread name : "+ this.message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END: Thread name : "+this.message);
	}

}
