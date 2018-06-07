package demo.object.clone;

/**
 * @author gauraw
 *
 */
public class CloneDemoTestImpl {

	public static void main(String[] args) {
		CloneDemo obj = new CloneDemo();
		try {
			// clone() need to be overridden in CloneDemo, else clone() will not be visible here and result into CTE. 
			//See Comment below main().
			CloneDemo obj2 = (CloneDemo) obj.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

	/*
	 * Points: 
	 * 1. When a protected member is inherited across package it becomes private member of inherited class 
	 * 2. When a protected member is inherited within the same package it becomes default member of inherited class.
	 * 
	 * In this example, clone() from Object class is inherited into CloneDemo across package. Object class is present in 
	 * java.lang package and CloneDemo is in demo.object.clone package. So clone() method becomes a private member of CloneDemo class.
	 * 
	 * Conclusion:
	 * 
	 * 1. We can access clone() inside CloneDemo directly without overriding Object class clone() as private members can be accessed 
	 * within class. 2.
	 * 
	 * 2. We can't access clone() (can't perform object cloning on CloneDemo object) in CloneDemoTestImpl without overriding clone() in
	 * CloneDemo class because clone() is private in CloneDemo. So We need to override to make it either default or public.
	 */
}
