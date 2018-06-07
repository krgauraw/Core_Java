package demo.design.singleton;

/**
 * @author gauraw
 *
 */
public class SingletonDemoImpl {

	public static void main(String[] args) {
		SingletonDemo s1 = SingletonDemo.getObject();
		s1.setMessage("Hello!");
		SingletonDemo s2 = SingletonDemo.getObject();
		System.out.println(s2.getMessage());
		s2.setMessage("Hi");
		if (s1 == s2) {
			System.out.println("Both Objects are same");
		}
		System.out.println(s1.getMessage());
	}
}
