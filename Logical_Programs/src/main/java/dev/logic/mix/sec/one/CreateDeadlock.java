package dev.logic.mix.sec.one;

/**
 * Create deadlock between two threads
 * 
 * @author gauraw
 *
 */
public class CreateDeadlock {

	String str1 = "Java";
	String str2 = "UNIX";

	Thread trd1 = new Thread("My Thread 1") {
		@Override
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};

	Thread trd2 = new Thread("My Thread 2") {
		@Override
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};

	public static void main(String a[]) {
		CreateDeadlock mdl = new CreateDeadlock();
		mdl.trd1.start();
		mdl.trd2.start();
	}
}
