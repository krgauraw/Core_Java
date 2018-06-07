package dev.coll.exp1;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("A", 100);
		Object o = map.get("A");
		System.out.println("Hello");
	}
}
