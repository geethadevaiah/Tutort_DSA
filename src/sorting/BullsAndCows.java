package sorting;

import java.util.Arrays;

public class BullsAndCows {

	public static String getHint1(String secret, String guess) {
		
		// if same number same position then 
		int n = secret.length(), i = 0, bulls = 0, cows = 0;
		while(i < n) {
			if(secret.charAt(i) == guess.charAt(i)) bulls++;
			i++;
		}
		if( bulls == n) return String.valueOf(bulls)+"A0B";
		char[] s = (secret.toCharArray());
		char[] g = guess.toCharArray();
		Arrays.sort(s);
		Arrays.sort(g);
		String s1 = String.valueOf(s), g1 = String.valueOf(g);
		if(s1.equals(g1)) 
			return String.valueOf(bulls)+"A"+String.valueOf(n-bulls)+"B";
		i = 0;
		while(i < n) {
			if(guess.indexOf(secret.charAt(i)) != -1) cows++;
			i++;
		}
		cows = cows - bulls;
		return String.valueOf(bulls)+"A"+String.valueOf(cows)+"B";
	}

	// approach
	// bulls just get the equals count
	// cows 2 cases:
	// 	1. - Number present in secret and guess
	//  2  - Not used in bull
	public static String getHint(String secret, String guess) {
		int bulls = 0, cows = 0, i =0;
		int[] digits = new int[10]; // [0-9]
		for(i = 0 ; i < secret.length() ; i++) {
			if(secret.charAt(i) == guess.charAt(i)) bulls++;
			else {
				if(digits[secret.charAt(i) - '0']++ < 0) cows++;
				if(digits[guess.charAt(i) - '0']-- > 0) cows++;
			}
		}
		return bulls+"A"+cows+"B";
	}
	/* for secret digits of that char index is incremented
	 * for guess digits of that char index in decremented
	 * so, if secret of that char index is < 0 then there is a cow
	 * if guess of that char index is > 0 then theres is a cow
	 */
	
	public static void main(String[] args) {
		String secret = "11", guess = "10";
		System.out.println(getHint(secret, guess));
	}
}
