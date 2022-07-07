package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	public static String mostCommonWord(String paragraph, String[] banned) {

		// replace all chars whichever are not words with space
		// split the string with one or more space
		
		String words[] = paragraph.replaceAll("\\W+"," ").toLowerCase().split("\\s+");
		Map<String, Integer> wordCount = new HashMap<>();
		Set<String> bannedSet = new HashSet<String>(Arrays.asList(banned));
		
		for(String word : words) {
			if(!bannedSet.contains(word))
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		
		return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
	
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(mostCommonWord(paragraph, banned));
	}
}
