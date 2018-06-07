package demo.design.singleton;

/**
 * 1. Singleton pattern is one of the simplest design patterns in Java. This
 * type of design pattern comes under creational pattern as this pattern
 * provides one of the best ways to create an object.
 * 
 * 2. Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine. The
 * singleton class must provide a global access point to get the instance of the
 * class. Singleton pattern is used for logging, drivers objects, caching and
 * thread pool.
 * 
 * @author gauraw
 *
 */
public class SingletonDemo {

	private static SingletonDemo sd = null;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	static {
		sd = new SingletonDemo();
	}

	private SingletonDemo() {

	}

	public static SingletonDemo getObject() {
		return sd;
	}
}
