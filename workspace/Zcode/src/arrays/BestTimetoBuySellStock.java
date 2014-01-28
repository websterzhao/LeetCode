package arrays;

public class BestTimetoBuySellStock {
    public int maxProfit(int[] prices) {
    	  if(prices.length==0) return 0;
          int min=prices[0];
          int ret=0;
          for(int i=1;i<prices.length;i++){
              if(prices[i]<min)
                  min=prices[i];
              else
                  ret=(prices[i]-min)>ret?(prices[i]-min):ret;
          }
          return ret;
	    }
}
