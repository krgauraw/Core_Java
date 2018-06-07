package dev.lara.mix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Read a properties file and print all properties (key).
 * @author gauraw
 *
 */
public class P1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*//1st approach
		String dir= "."+File.separator+"dev.lara.mix_files"+File.separator+"P_1_2.properties";
		File tempDir=new File(dir);
		String absoluteDir=tempDir.getAbsolutePath();
		System.out.println("absoluteDir:::::::"+absoluteDir);
		
		Properties pr=new Properties();
		
		try 
		{
			FileReader fReader=new FileReader(absoluteDir);
			pr.load(fReader);
		} catch (IOException e) {
			System.out.println("Following Exception Occured::::"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Printing Properties Object pr::::::"+pr);*/
	
		
		/*//2nd approach - Folder must be inside project but outside src folder
		Properties pr = new Properties();
		String fileName = "./dev.lara.mix_files/P_1_2.properties";
		InputStream inputStream = new FileInputStream(fileName);
		pr.load(inputStream);
		System.out.println("Printing Properties Object pr::::::"+pr);*/
		
		
		//3rd approach - File must me inside package folder
		Properties pr = new Properties();
		InputStream inputStream = P1.class.getResourceAsStream("P_1_2.properties");
		//InputStream inputStream = new FileInputStream(fileName);
		pr.load(inputStream);
		System.out.println("Printing Properties Object pr::::::"+pr);
	}

}
