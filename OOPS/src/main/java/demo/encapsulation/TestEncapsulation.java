package demo.encapsulation;

/**
 * 
 * @author gauraw
 *
 */
public class TestEncapsulation {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Rajeev");

		System.out.println("Employee Id::" + emp.getEmpId() + " , Employee Name::" + emp.getEmpName());
	}
}