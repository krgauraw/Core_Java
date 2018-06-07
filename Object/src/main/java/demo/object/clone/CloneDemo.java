package demo.object.clone;

/**
 * @author gauraw
 *
 */
public class CloneDemo implements Cloneable {

	int x = 10;
	int y = 20;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//object cloning can be done here with overriding clone() because private clone() can be accessed within the class.

	/*public static void main(String[] args) {
		CloneDemo obj = new CloneDemo();
		try {
			CloneDemo obj2 = (CloneDemo) obj.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.x);
	}*/
}
