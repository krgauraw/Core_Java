package demo.serialization;

import java.io.Serializable;

/**
 * @author gauraw
 *
 */
public class Employee implements Serializable {

	String empId;
	String empName;
	String mobile;

	Employee(String empId, String empName, String mobile) {
		this.empId = empId;
		this.empName = empName;
		this.mobile = mobile;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}