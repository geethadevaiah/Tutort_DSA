package DP;
/*A box contains a number of chocolates that can only be removed 1 at a time or 3 at a a time. 
How many ways can the box be emptied?

The answer can be very large so return it modulo of 10^9+7
*/


public class RemoveNChocolates {

	public static int mod = 1000000007;
	public static int removingCHoc(int n ) {
		int dp[] = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3 ; i <= n ; i++) {
			dp[i] = ((dp[i-1] % mod) + (dp[i-3] % mod) ) % mod;
		}
		return dp[n];
	}
	
}
