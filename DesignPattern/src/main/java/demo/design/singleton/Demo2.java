package demo.design.singleton;

/**
 * @author gauraw
 *
 */
public class Demo2 {

	private static Demo2 obj = null;

	private String msg;

	private Demo2() {
	}

	public static Demo2 getObject() {
		if (null == obj)
			obj = new Demo2();
		return obj;
	}

	public static String getMesg() {
		return obj.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
