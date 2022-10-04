package Arrays;

public class VowelSubsequence {

	public static void main(String[] args) {
		String s = "abhishek";
		String vowel = "aeiou";
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < s.length() ; i++) {
			if(vowel.indexOf(s.charAt(i)) != -1)
				sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
			
	
	}
}
