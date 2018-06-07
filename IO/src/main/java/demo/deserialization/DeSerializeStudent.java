package demo.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import demo.serialization.Student;

/**
 * @author gauraw
 *
 */
public class DeSerializeStudent {

	public static void main(String[] args) {

		Student s1 = null;

		try {
			FileInputStream fis = new FileInputStream("Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s1 = (Student) ois.readObject();
			ois.close();
			fis.close();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Exception Occurred::" + e.getMessage());
		}

		System.out.println("Reading Student Data::");
		System.out.println("Student Id::" + s1.getsId());
		System.out.println("Student Name::" + s1.getsName());
		System.out.println("Mobile Number::" + s1.getMobile());
	}
}
