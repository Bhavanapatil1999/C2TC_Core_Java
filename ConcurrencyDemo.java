import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReentrantLock l=new ReentrantLock();
		l.lock();
		System.out.println(l.isLocked());
		
		l.unlock();
	}

}
