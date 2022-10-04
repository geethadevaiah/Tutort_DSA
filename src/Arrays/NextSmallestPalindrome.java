package Arrays;

public class NextSmallestPalindrome {

	public static String solve1(String A) {
		int n = A.length();
		StringBuilder s = new StringBuilder(A);
		StringBuilder old = new StringBuilder(A);
		StringBuilder secondHalf = new StringBuilder();
		if(n % 2 == 0) 
			secondHalf.append(A.substring(n/2));
		
		else 
			secondHalf.append(A.substring(n/2+1));
		StringBuilder firstHalf = new StringBuilder(A.substring(0, n/2));
		int i = n/2;	
		while(i > 0) {
			firstHalf = new StringBuilder(A.substring(0, n/2));
			String rev = firstHalf.reverse().toString();
			if(Integer.parseInt(rev) > Integer.parseInt(secondHalf.toString())) {
				s.replace(i, n, rev);
				if(Integer.parseInt(s.toString()) > Integer.parseInt(old.toString())) {
					// result found 
					break;
				}
			}
			else {
				// append the previous to next middle char
				if(s.charAt(i) != '9') {
					int replace = Integer.parseInt(String.valueOf(s.charAt(i)))+1;
					s.replace(i, i+1, String.valueOf(replace));
					i--;
					if(Integer.parseInt(s.toString()) > Integer.parseInt(old.toString())) {
						// result found 
						break;
					}
				}
			}
		}
		
		return s.toString();
		
	}
	
	public static String solve(String A) {
		do {
			Double d = Double.parseDouble(A)+1;
		}while(!isPalindrome(d));
		return A;
	}
	
	public static boolean isPalindrome(Double d) {
		int n = s.length();
		for(int i = 0 ; i < n ;i++) {
			if(s.charAt(i) != s.charAt(n-i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String A = "23545";
		System.out.println(solve(A));
	}
}
