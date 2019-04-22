package BarrierS;
import java.util.concurrent.Semaphore;

public class Barrier {
	
	// add missing variables
	int count;
	Semaphore semaphore;
	
	Barrier(int n) {
		// complete this constructor
		count = n;
		semaphore = new Semaphore(n);
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		semaphore.acquire();
		semaphore.release();
	}

}
