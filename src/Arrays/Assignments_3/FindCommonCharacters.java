package Arrays.Assignments_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

	public static List<String> commonChars(String[] words) {

		List<String> result = new ArrayList<String>();
		if(words.length == 1) return Arrays.asList(words[0]);
		// for each char in first word
		for(char c : words[0].toCharArray()) {
			int count = 1; // keeps the count whether this char is present in all the words
			// iterate over the rest of the words
			for(int i = 1 ; i < words.length ; i++) {
				if(words[i].indexOf(c) != -1) {
					StringBuilder sb = new StringBuilder(words[i]);
					sb.deleteCharAt(words[i].indexOf(c));
					words[i] = String.valueOf(sb); // remove c in the word n setting it back to check with the duplicates
					count++; // c is present in this word, so increment count
				}
			}
			if(count == words.length)  //c found in all the words, add to result
				result.add(String.valueOf(c));
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] words = { "bella", "label", "roller" };
		List<String> res = commonChars(words);
		for(String s : res) {
			System.out.println(s);
		}
	}
}
