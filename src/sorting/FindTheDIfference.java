package sorting;

import java.util.Arrays;

public class FindTheDIfference {

	
	public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        int i = 0;
        for(i = 0 ; i < s.length() ; i++) {
        	chars[s.charAt(i) - 'a']++;
        	chars[t.charAt(i) - 'a']--;
        }
        chars[t.charAt(i) - 'a']--;
        for(int k = 0 ; k < t.length(); k++) {
        	if(chars[t.charAt(k) - 'a'] != 0) return t.charAt(k);
        }
        return 0;
    }
	
	// approach 1
	public char findTheDifference1(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		for (int i = 0; i < s.length(); i++) {
			if (sChar[i] != tChar[i]) {
				return tChar[i];
			}
		}
		return tChar[t.length() - 1];
	}
}
