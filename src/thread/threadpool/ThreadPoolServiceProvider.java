package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolServiceProvider {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
			Runnable workerTreadRunnable = new WorkerThread(""+i);
			executorService.execute(workerTreadRunnable);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()){
			
		}
		System.out.println("finished all threads");

	}

}
