package arrays;

public class BestTimetoBuySellStockII {
	public int maxProfit(int[] prices) {
		if (prices.length == 0)
			return 0;
		int n = prices.length;
		int ret = 0;
		int buy = 0;
		boolean buyable = false;
		for (int i = 1; i < n; i++) {
			if(prices[i]>prices[buy]){
				ret+=prices[i]-prices[buy];
				buyable = true;
			}
			else{
				
			}
				
				
		}
	//	return ret;
	}
}
