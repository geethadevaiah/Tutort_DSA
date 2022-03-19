package WarmupPracticeSet_III;

public class _3_IsValidAnagram {

	public static boolean isAnagram(String s, String t) {
		 if(s.length() != t.length())
			 return false;
		 int[] schar = new int[26];
		 
		 for(int i = 0 ; i < s.length() ; i++) {
			 schar[s.charAt(i)  - 'a']++;
			 schar[t.charAt(i)  - 'a']--;
		 }
		 
		 for(int count : schar) {
			 if(count != 0) {
				 return false;
			 }
		 }
		 return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "anagara"));
	}
}
