package poc.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exe {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService executorService = Executors.newFixedThreadPool(10);

//		for (int i=0;i<20;i++){
//			executorService.execute(new Runnable() {
//			    public void run() {
//			        System.out.println("Asynchronous task");
//			    }
//			});
//			
//		}

		Future future = executorService.submit(new Callable(){
		    public Object call() throws Exception {
		        System.out.println("Asynchronous Callable");
		        Thread.sleep(2000);
		        return "Callable Result";
		    }
		});

		System.out.println("future.get() = " + future.get());
		executorService.shutdown();
	}
}
