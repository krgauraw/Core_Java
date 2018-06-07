package demo.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author gauraw
 *
 */
public class SerializeStudent {
	public static void main(String[] args) {
		Student s1 = null;
		try {
			s1 = new Student("S1234", "Akash Kumar", "1234567890");
			FileOutputStream fos = new FileOutputStream("Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//writeObject() will write the object data on File.
			oos.writeObject(s1);
			oos.close();
			fos.close();
			System.out.println("Object Data is Successfully written in File.");
		} catch (IOException e) {
			System.out.println("Following Exception Occured::" + e.getMessage());
		}
	}
}