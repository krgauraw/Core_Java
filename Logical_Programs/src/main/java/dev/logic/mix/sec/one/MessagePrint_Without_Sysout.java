package dev.logic.mix.sec.one;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Is it possible to print message without using system.out.println?
 * 
 * @author gauraw
 *
 */
public class MessagePrint_Without_Sysout {

	public static void main(String[] args) {

		try {
			System.out.write("Hello World \n".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.format("%s", "Hello world \n");

		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("Hello World \n");

		System.err.print("Hello World...using err.print");

		//System.console().writer().print("Hello World");

	}
}
