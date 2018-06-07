package demo.network.sec.one;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * This Program will fetch IP Address of any website.
 * 
 * @author gauraw
 *
 */
public class FetchIpAddress {
	public static void main(String[] args) {
		System.out.println("Please enter website name::");
		Scanner sc = new Scanner(System.in);
		String webAddress = sc.next();

		InetAddress ip = null;
		try {
			// getByName() accepts site name and returns its ip address
			ip = InetAddress.getByName(webAddress);
		} catch (UnknownHostException e) {
			System.out.println("Error Occurred::" + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Ip Address of " + webAddress + " is : " + ip.toString());
		System.out.println("Host Address : " + ip.getHostAddress());
		System.out.println("Host Name :" + ip.getHostName());
		System.out.println("Canonical Host Name:" + ip.getCanonicalHostName());
		System.out.println("Is Site Local Address::" + ip.isSiteLocalAddress());
		System.out.println("Is Loop Back Address:" + ip.isLoopbackAddress());
		System.out.println("Is Multi Cast Address::" + ip.isMulticastAddress());
	}

}