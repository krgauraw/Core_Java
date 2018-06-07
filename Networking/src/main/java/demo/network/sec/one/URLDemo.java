package demo.network.sec.one;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author gauraw
 *
 */
public class URLDemo {
	public static void main(String[] args) {
		System.out.println("Enter URL of Any Website::");
		Scanner sc = new Scanner(System.in);

		String url = sc.next();
		URL obj = null;
		try {
			obj = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if (obj != null) {
			System.out.println("Protocol:" + obj.getProtocol());
			System.out.println("Host:" + obj.getHost());
			System.out.println("File:" + obj.getFile());
			System.out.println("Prt:" + obj.getPort());
			System.out.println("Path:" + obj.getPath());
			System.out.println("External Form:" + obj.toExternalForm());
		}

	}
}