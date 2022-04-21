package Arrays.Assignments_1;

public class _6_BestTimeToBuyNSellStock {
	
	public static int maxProfit(int[] prices) {
		// Time limit exceeded
		/*int profit = Integer.MIN_VALUE;
		for(int i = 0 ; i < prices.length ; i++) {
			int tmpProfit = 0 ;
			for(int j = i+1 ; j < prices.length ; j++) 
				tmpProfit = Math.max(tmpProfit, prices[j]-prices[i]);
			profit = Math.max(profit, tmpProfit);
		}
		return profit;*/
		
		int profit = 0, lowPrice = Integer.MAX_VALUE, i = -1, n = prices.length;
		// justify for 2 cases
		while(++i < n) {
			if(i < n && prices[i] < lowPrice) // either value can be the least 
				lowPrice = prices[i];
			else if(i < n && profit < (prices[i] - lowPrice)) // or it can be the with the highest profit
				profit = prices[i] - lowPrice;
		}
		return profit;
    }
	
	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
}
