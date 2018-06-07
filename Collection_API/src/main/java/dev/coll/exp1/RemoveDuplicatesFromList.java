package dev.coll.exp1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("ABC");
		list1.add("DEF");

		List<String> list2 = new ArrayList<String>();
		list2.add("ABC");
		list2.add("XYZ");

		list2.addAll(list1);

		System.out.println(list2);

		// for jdk 7
		List<String> distinctList = (List<String>) (List<?>) list2.stream().distinct().collect(Collectors.toList());

		//for jdk8
		//List<String> distList = list2.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctList);
	}
}
