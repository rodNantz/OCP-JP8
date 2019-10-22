package ocp.assessment.classes;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * 
 * CyclicBarrier is a valid class from from java.util.concurrent.
 * 
 * 
 * Application wiats forever at runtime. Nothing is printed out.
 * 
 * @author r.santos
 *
 */
public class BabyPandaBathManager {



	public static void await(CyclicBarrier cb) {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}
	
	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(3,					// 
				()-> System.out.println("Clean!"));						// u1
		ExecutorService service = Executors.newScheduledThreadPool(2);
		IntStream.iterate(1, i-> 1) 									// u2
			.limit(12)
			.forEach(i-> service.submit( 								// u3
				()-> await(cb))); 										// u4
		service.shutdown();
	}
}
