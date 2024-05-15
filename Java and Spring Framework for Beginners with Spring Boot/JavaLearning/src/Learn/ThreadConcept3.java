package Learn;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class NumberMaker implements Runnable {
    private BlockingQueue blockingQueue;

    public NumberMaker(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) { // put 20 Integer's
            try {
                blockingQueue.put(new Integer(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class QueueProcessor implements Runnable {
    private BlockingQueue blockingQueue;

    public QueueProcessor(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        Integer i = null;
        try {
            do { // take 20 Integer's
                i = (Integer) blockingQueue.take();
                System.out.println("Got" + i);
            } while (i != 20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyTask implements Runnable {
    private ArrayList<String> mylist;

    public MyTask(ArrayList<String> list) {
        this.mylist = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            mylist.add(Thread.currentThread().getName() + " - Entry " + i);
        }
    }
}

public class ThreadConcept3 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();

        Thread t1 = new Thread(new MyTask(mylist));
        Thread t2 = new Thread(new MyTask(mylist));

        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the contents of the list
        for (String entry : mylist) {
            System.out.println(entry);
        }
        
        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(10); // Shared queue

        // Create producer and consumer threads
        Thread numberMakerThread = new Thread(new NumberMaker(sharedQueue));
        Thread queueProcessorThread = new Thread(new QueueProcessor(sharedQueue));

        // Start both threads
        numberMakerThread.start();
        queueProcessorThread.start();
    }
}
