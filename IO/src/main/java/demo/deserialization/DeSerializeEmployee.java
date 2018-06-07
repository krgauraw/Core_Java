package demo.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import demo.serialization.Employee;

/**
 * @author gauraw
 *
 */
public class DeSerializeEmployee {

	public static void main(String[] args) {

		Employee e1 = null;

		try {
			FileInputStream fis = new FileInputStream("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e1 = (Employee) ois.readObject();
			ois.close();
			fis.close();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Exception Occurred::" + e.getMessage());
		}

		System.out.println("Reading Employee Data::");
		System.out.println("Employee Id::" + e1.getEmpId());
		System.out.println("Employee Name::" + e1.getEmpName());
		System.out.println("Mobile Number::" + e1.getMobile());
	}
}