package BarrierS;
import java.util.concurrent.Semaphore;

public class Barrier {
	
	// add missing variables
	private static int n;
	private static int counter;
	private Semaphore semaphore;
	
	Barrier(int n) {
		// complete this constructor
		Barrier.n = n;
		Barrier.counter = 0;
		semaphore = new Semaphore(n);
		semaphore.drainPermits();
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		Barrier.counter++;

		if (counter == n){
			semaphore.release();
		}
		//check if 
		semaphore.acquire();
		semaphore.release();

	}

}
