package demo.design.singleton;

/**
 * @author gauraw
 *
 */
public class Demo2Impl {

	public static void main(String[] args) {
		Demo2 obj = Demo2.getObject();
		obj.setMsg("Singleton Demo");
		System.out.println(Demo2.getMesg());

		Demo2 obj2 = Demo2.getObject();
		System.out.println(obj2.getMesg());

		if (obj == obj2)
			System.out.println("Both Object is same");

		//In order to clone, clone() need to be overridden in Demo2 class and the class should implement Clonable Interface.
		//See CloneDemo.java and its corresponding Test Class in project Object. 
		//Demo2 demo = (Demo2) obj.clone();

	}
}
