package arrays;

public class BestTimetoBuySellStock {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int n = prices.length;
	       int[] min = new int[n];
	       min[0] = 0;
	       for(int i =1;i<n;i++){
	    	   if(prices[i]<prices[min[i-1]])
	    		   min[i]=i;
	    	   else
	    		   min[i]=min[i-1];
	       }
	       int ret=0;
	       for(int i =1;i<n;i++){
	    	   int temp = prices[i]-prices[min[i]];
	    	   if(temp>ret)
	    		   ret=temp;
	       }
	       return ret;
	    }
}
