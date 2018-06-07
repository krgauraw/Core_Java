package demo.object.clone;

/**
 * Deep Copy Demo.
 * 
 * @author gauraw
 *
 */
public class DeepCopyDemo implements Cloneable {

	int i, j;

	public static void main(String[] args) {

		DeepCopyDemo obj1 = new DeepCopyDemo();
		obj1.i = 10;
		obj1.j = 20;
		System.out.println("obj1 data::::: i=" + obj1.i + " , j=" + obj1.j);

		System.out.println("Going to perform deep copy on obj1...");

		// deep copy
		DeepCopyDemo obj2 = null;
		try {
			obj2 = (DeepCopyDemo) obj1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("obj2 (copied from obj1) data::::: i=" + obj2.i + " , j=" + obj2.j);
		System.out.println("Changing obj2 data...");
		obj2.i = 100;
		obj2.j = 200;
		System.out.println("obj2 updated data::::: i=" + obj2.i + " , j=" + obj2.j);
		System.out.println("obj1 data (after performing update on obj2)::::: i=" + obj1.i + " , j=" + obj1.j);
	}
}