package Learn;

class UnsafeSimpleData { // Wrapper for count
	private int count = 0;

	// race condition if following is not synchronized -> works as lock
	// There's one lock for the entire object, no matter how many methods you apply
	// synchronized to, you lock access to all the methods when you lock one

	// If a thread acquires the lock and is timed out by the JVM (in order to give
	// other threads a chance to run) ... • that thread sleeps until woken up by the
	// JVM • it keeps the lock while it sleeps • if another thread tries to acquire
	// the lock on this or any other synchronized method in this object, it is put
	// to sleep on the lock's waiting queue. Any other threads doing the same thing
	// are also placed on this queue • when the original thread is woken up by the
	// JVM, it continues execution inside the method (it still has the lock) • When
	// it exits the method, the first thread on the lock queue (if there is one) is
	// woken up and acquires the lock
	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

class SharedData implements Runnable {
	private UnsafeSimpleData data;

	public SharedData(UnsafeSimpleData data) {
		this.data = data;
	}

	public void run() {
		// Incrementing the shared integer without proper synchronization
		for (int i = 0; i < 10000; i++)
			data.increment();
	}

	public void print() {

		System.out.println(data.getCount());
	}
}


// using synchronized to avoid race condition
public class ThreadConcept2 {

	public static void main(String[] args) throws InterruptedException {
		UnsafeSimpleData s1 = new UnsafeSimpleData();
		// both Thread objects use s1 - i.e., shared data
		Thread t1 = new Thread(new SharedData(s1));
		t1.start();
		Thread t2 = new Thread(new SharedData(s1));
		t2.start();
		t1.join();
		t2.join();
		System.out.println(s1.getCount());
	}

}
