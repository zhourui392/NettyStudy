package lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockTest2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.submit(new Runnable() {	
			@Override
			public void run() {
				String name = "1";
				while (true) {
					BlockPart.blockPartMethod(name);
				}
			}
		});
		executor.submit(new Runnable() {	
			@Override
			public void run() {
				String name = "2";
				while (true) {
					BlockPart.blockPartMethod(name);
				}
			}
		});
	}
}
