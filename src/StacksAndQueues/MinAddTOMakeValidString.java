package StacksAndQueues;

//leetcode 921
public class MinAddTOMakeValidString {

	public int minAddToMakeValid(String s) {
		int open = 0, close = 0, len = s.length(), i = 0;
		for (; i < len; i++) {
			if (s.charAt(i) == '(')
				close++;
			else if (close > 0)
				close--;
			else
				open++;
		}
		return open + close;
		/**
		 * 
		(1) Found '(' --> ++close
		(Must add closing bracket to make it Balanced)
		
		(2) Found ')'
		Two cases:
		
		(A) close > 0 ---> --close
		(Found the Closing Bracket)
		
		(B) Else --> ++open
		(Increase the Opening Bracket)
		
		return open+close;
		 */
	}
}
