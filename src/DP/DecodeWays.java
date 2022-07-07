package DP;

public class DecodeWays {

	public int numdec(String s) {
		int len = s.length();
        if (s == null || len==0)
                return 0;
		int dp[] = new int[len];
        dp[0] = s.charAt(0)!='0' ? 1 : 0;

		// 2 options
		// (1) If 1-9: dp[i] = dp[i-1]: 1 Entry Point
		// (2) If 10-26: dp[i] = dp[i-1] + d[i-2]: 2 Entry Point
		for (int i = 1; i < len; i++) {
			int first = Integer.parseInt(s.substring(i,i+1));
			int second = Integer.parseInt(s.substring(i-1, i+1));
			
			if(first >= 1 && first <= 9) 
				dp[i] = dp[i] + dp[i-1];
			
			if(second >= 10 && second <= 26) 
				dp[i] += i>=2 ? dp[i-2] : 1;
		}
		return dp[len-1];
	}
	
	public static int numDecodings(String s) {
		int len = s.length();
		int dp[] = new int[len + 1];
		dp[0] = 1;
		if (s.charAt(0) != '0')
			dp[1] = 1;
		for (int i = 2; i <= len; i++) {
			if (s.charAt(i - 1) != '0')
				dp[i] = dp[i - 1];
			int val = Integer.parseInt(s.substring(i - 2, i));
			if (val >= 10 && val <= 26)
				dp[i] += dp[i - 2];
		}
		return dp[len];
	}
	public static void main(String[] args) {
		System.out.println(numDecodings("226"));
	}
	// "1" -> means 1 way
	// "12" -> 2 cases
		//  if first char is not 0 then prev no. of ways(1 way)
		// else just check for valid num of prev and before chars to make prev to before ways
	
	
	
	
}
