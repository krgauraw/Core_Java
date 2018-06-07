package demo.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author gauraw
 *
 */
public class SerializeEmployee {
	public static void main(String[] args) {
		Employee e1 = null;
		try {
			e1 = new Employee("E123", "Amit Kumar", "1234567890");
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//writeObject() will write the object data on File.
			oos.writeObject(e1);
			oos.close();
			fos.close();
			System.out.println("Object Data is Successfully written in File.");
		} catch (IOException e) {
			System.out.println("Following Exception Occured::" + e.getMessage());
		}
	}
}