package dev.coll.exp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Sort a map based on value
 * 
 * @author gauraw
 *
 */
public class SortMapByValue {

	public static void main(String a[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("J2EE", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Data Structure", 93);

		Set<Entry<String, Integer>> set = map.entrySet();

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
				//return (o2.getValue()).compareTo( o1.getValue() );	// Sort in descending order
			}
		});

		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}
}
