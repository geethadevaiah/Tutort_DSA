package Arrays.Assignments_1;

public class _7_buyNSellII {

	public static int maxProfit(int[] prices) {
		int maxProfit = 0 , n = prices.length, low = prices[0], peak = prices[0];
		int i = 0 ;
		while(i < n-1) {
			while(i < n-1 && prices[i] >= prices[i+1]) i++;
			low = prices[i];
			while(i < n-1 && prices[i] <= prices[i+1]) i++;
			peak = prices[i];
			maxProfit += peak - low;
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int prices[] = {7,5,4,3,2,1,4,5,2,5};
		System.out.println(maxProfit(prices));
	}
}
