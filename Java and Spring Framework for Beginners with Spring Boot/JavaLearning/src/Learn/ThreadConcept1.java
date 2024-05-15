package Learn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class myThread implements Runnable {
	private int i;
	public myThread(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		for (int j = 0; j < 5; j++)
			System.out.println(i);

	}
}
class yourThread extends Thread {
	private int i;

	public yourThread(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		for (int j = 0; j < 5; j++)
			System.out.println(i);
	}

}

class ValueReturningTask implements Callable<Integer> {
	private int a;
	private int b;

	public ValueReturningTask(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() {
		// Perform some computation here
		for (int j = 0; j < 10; j++)
			System.out.println("#####");
		return a + b; // For instance, adding two numbers
	}
}

public class ThreadConcept1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// using runnable
		Thread t1 = new Thread(new myThread(1));
		t1.start();
		Thread t2 = new Thread(new myThread(2));
		t2.start();
		// if you remove join-> all four (t1,t2,t3,t4) threads will run in parallel.
		t1.join();
		t2.join();
		// using Thread class
		System.out.println("--------");
		yourThread t3 = new yourThread(3);
		t3.start();
		yourThread t4 = new yourThread(4);
		t4.start();

		t3.join();
		t4.join();
		System.out.println("--------");
		// Thread pool
		// 1) create a new thread for each new task, and reuse the threads after they
		// complete
		ExecutorService exec1 = Executors.newCachedThreadPool();
		// 2) create a set of threads initially, assign new tasks to threads, reuse as
		// above, but if there are more tasks than threads, the tasks are queued.
		ExecutorService exec2 = Executors.newFixedThreadPool(2);

		exec1.execute(new yourThread(5));
		exec1.execute(new yourThread(6));
		exec1.execute(new yourThread(7));
		exec2.execute(new yourThread(8));
		exec2.execute(new yourThread(9));
		exec2.execute(new yourThread(10));
		exec1.shutdown();
		exec2.shutdown();
//		exec1.execute(t4); // will throw runtime exeption

		System.out.println("--------");
		// Create an ExecutorService
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// Create a task that returns a value
		Callable<Integer> task = new ValueReturningTask(10, 20);

		// Submit the task to the executor service
		Future<Integer> futureResult = executorService.submit(task);

		// You can perform other operations here while the task is executing
		// asynchronously
		for (int j = 0; j < 10; j++)
			System.out.println("******");

		// Get the result once the task is completed
		try {
			Integer result = futureResult.get(); // This blocks until the result is available
			System.out.println("Result: " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		// Shutdown the executor service
		executorService.shutdown();
	}

}
