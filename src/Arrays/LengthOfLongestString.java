package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestString {

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length(), maxLength = 0;
		int start = 0, end = 0, i = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		while(end < n) {
			char c = s.charAt(end);
			if(map.containsKey(c)) { // check if map contains this char
				start = Math.max(start, map.get(c)+1); // get the latest index 
			}
			maxLength = Math.max(maxLength, end - start + 1);
			map.put(c, end);
			end++;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "tmmzuxt";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
