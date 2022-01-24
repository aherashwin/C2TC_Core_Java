import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyDemo {

	public static void main(String[] args) {

		ReentrantLock l=new ReentrantLock();
		l.lock();
		
		System.out.println(l.getQueueLength());
		
	   System.out.println(l.getHoldCount());
		
		System.out.println(l.isHeldByCurrentThread());
		
		
		l.unlock();
		
		System.out.println(l.isLocked());
	}

}
