package dev.lara.mix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Reading Property file.
 * @author gauraw
 *
 */
public class P2 {

	public static void main(String[] args) {
		
		String fileName="."+File.separator+"dev.lara.mix_files"+File.separator+"P_1_2.properties";
		InputStream inputStream=null;
		try 
		{
				inputStream=new FileInputStream(fileName);
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties pr=new Properties();
		
		System.out.println("name:::::"+pr.getProperty("name"));
		System.out.println("age::::::"+pr.getProperty("age"));
		System.out.println("education::"+pr.getProperty("education"));
		System.out.println("address::"+pr.getProperty("address"));
		
		System.out.println("---------------------------");
		try 
		{
			pr.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Loading:::pr.load(inputStream):::::::::;");
		
		System.out.println("name:::::"+pr.getProperty("name"));
		System.out.println("age::::::"+pr.getProperty("age"));
		System.out.println("education::"+pr.getProperty("education"));
		System.out.println("address::"+pr.getProperty("address"));
	}

}
