package arrays;

public class BestTimetoBuySellStockIII {
//	The idea is from dynamic programming, the max profit at day i is the max profit before day i + max profit after day i. 
//	So there is one loop O(n) to compute the max profit before each each day and
//	another loop O(n) to get the final max profit by compute the max profit after each day reversely and combine the "before day" max profit.
	public int maxProfit(int[] prices) {
		int ret = 0;
		int n= prices.length;
		if(n==0) return 0;
		int[] maxstore = new int[n];
		maxstore[0]=0;
		int beg =prices[0];
	    for (int i=1; i< n; i++) {
	    	ret=(prices[i]-beg>ret)?(prices[i]-beg):ret;
	    	beg=(prices[i]<beg)?prices[i]:beg;
		    maxstore[i]=ret;    
	    }	  
	    ret=0;
	    int end=prices[n-1];
	    for(int i=n-1;i>=0;i--){
	    	ret=end-prices[i]+maxstore[i]>ret?end-prices[i]+maxstore[i]:ret;
	    	end=prices[i]>end?prices[i]:end;
	    }
	    
	    return ret;
	}

}
