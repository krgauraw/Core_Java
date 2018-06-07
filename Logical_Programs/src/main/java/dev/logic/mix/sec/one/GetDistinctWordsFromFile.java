package dev.logic.mix.sec.one;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Write a program to find all distinct words from the given file. Remove
 * special chars like ".,;:" etc. Ignore case sensitivity.
 * 
 * @author gauraw
 *
 */
public class GetDistinctWordsFromFile {

	public List<String> getDistinctWordList(String fileName) {

		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		List<String> wordList = new ArrayList<String>();
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
				while (st.hasMoreTokens()) {
					String tmp = st.nextToken().toLowerCase();
					if (!wordList.contains(tmp)) {
						wordList.add(tmp);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
		}
		return wordList;
	}

	private static File getResourceFile(String fileName) {
		File file = new File(GetDistinctWordsFromFile.class.getResource("/exp_files/" + fileName).getFile());
		return file;
	}

	public static void main(String a[]) {

		GetDistinctWordsFromFile obj = new GetDistinctWordsFromFile();
		List<String> wordList = obj
				.getDistinctWordList(getResourceFile("GetDistinctWordsFromFile.txt").getAbsolutePath());
		for (String str : wordList) {
			System.out.println(str);
		}
	}
}
