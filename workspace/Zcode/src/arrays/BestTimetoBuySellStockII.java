package arrays;

public class BestTimetoBuySellStockII {
/*
* Scan the vector, add all the sub set which are non-decreasing order.
e.g. 
1 2 4 2 5 7 2 4 9 0 9
(1 2 4) (2 5 7) ( 2 4 9) (0 9)  
prof = 3 + 5 + 7 + 9  = 24.
 */
	public int maxProfit(int[] prices) {
		int total = 0;
	    for (int i=0; i< prices.length-1; i++) {
	        if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
	    }

	    return total;
	}
}
