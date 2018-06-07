package demo.serialization;

import java.io.Serializable;

/**
 * @author gauraw
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 5886014501379964985L;

	String sId;
	static String sName;
	transient String mobile;

	Student(String sId, String sName, String mobile) {
		this.sId = sId;
		this.sName = sName;
		this.mobile = mobile;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public static String getsName() {
		return sName;
	}

	public static void setsName(String sName) {
		Student.sName = sName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}