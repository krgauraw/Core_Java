package demo.object.clone;

/**
 * Shallow Copy demo
 * 
 * @author gauraw
 *
 */
public class ShallowCopyDemo implements Cloneable {

	int j;
	A obj;

	public static void main(String[] args) {

		A a1 = new A();
		a1.i = 10;

		ShallowCopyDemo obj1 = new ShallowCopyDemo();
		obj1.j = 20;
		obj1.obj = a1;

		System.out.println("obj1 data::::: i=" + obj1.obj.i + " , j=" + obj1.j);

		System.out.println("Performing Shallow copy....");

		// performing copy
		ShallowCopyDemo obj2 = null;
		try {
			obj2 = (ShallowCopyDemo) obj1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("obj2 (copied object) data::::: i=" + obj2.obj.i + " , j=" + obj2.j);

		System.out.println("Changing obj2 data...");
		obj2.obj.i = 100;
		obj2.j = 200;
		System.out.println("obj2 updated data::::: i=" + obj2.obj.i + " , j=" + obj2.j);
		System.out.println("obj1 data (after performing update on obj2)::::: i=" + obj1.obj.i + " , j=" + obj1.j);

	}
}