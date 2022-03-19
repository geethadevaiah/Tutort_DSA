package WarmupPracticeSet_III;


public class _6_ReverseVowels {
	public static boolean isVowel(char c) {
		 String vowels = "aeiou";
		 return vowels.indexOf(Character.toLowerCase(c)) != -1;
	}
	 public static String reverseVowels(String s) {
		 int i = 0, j = s.length()-1;
		 char[] charArr = s.toCharArray();
		 while(i < j) {
			 if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
				 char c = s.charAt(i);
				 charArr[i++] = charArr[j];
				 charArr[j--] = c;	 
			 }
			 else if(!isVowel(s.charAt(i))) 
				 i++;
			 else if(!isVowel(s.charAt(j))) 
				 j--;
		 }
		 return String.valueOf(charArr);
	 }
	 
	 public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));
	}
	 
}
