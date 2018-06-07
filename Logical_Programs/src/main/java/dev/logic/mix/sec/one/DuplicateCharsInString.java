package dev.logic.mix.sec.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author gauraw
 *
 */
public class DuplicateCharsInString {

	public void findDuplicateChars(String str) {

		Map<Character, Integer> duplicateCharMap = new HashMap<Character, Integer>();

		char[] chrs = str.toCharArray();

		for (Character ch : chrs) {
			if (duplicateCharMap.containsKey(ch)) {
				duplicateCharMap.put(ch, duplicateCharMap.get(ch) + 1);
			} else {
				duplicateCharMap.put(ch, 1);
			}
		}

		Set<Character> keys = duplicateCharMap.keySet();
		for (Character ch : keys) {
			if (duplicateCharMap.get(ch) > 1) {
				System.out.println(ch + " appears " + duplicateCharMap.get(ch) + " times");
			}
		}
	}

	public static void main(String a[]) {
		String s1 = "Kumar Gauraw";
		System.out.println("String is:::" + s1);
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicateChars(s1);
	}
}
