package WarmupPracticeSet_III;

import java.util.Arrays;

public class _8_FindTheDifference {

	public static char findDiff(String s , String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		for(int i = 0 ; i < s.length() ; i++) {
			if(sChar[i] != tChar[i]) {
				return tChar[i];
			}
		}
		return tChar[t.length() - 1];
	}
	
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abecd";
		System.out.println(findDiff(s, t));
	}

}
