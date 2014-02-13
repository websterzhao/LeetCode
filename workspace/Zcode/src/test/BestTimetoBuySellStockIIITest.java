package test;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.BestTimetoBuySellStockIII;

public class BestTimetoBuySellStockIIITest {

	@Test
	public void test() {
		BestTimetoBuySellStockIII bbs= new BestTimetoBuySellStockIII();
		int[] A= new int[]{1,2,4,2,5,7,2,4,9,0};
		assertEquals(13,bbs.maxProfit(A));
	}

	@Test
	public void test1() {
		BestTimetoBuySellStockIII bbs= new BestTimetoBuySellStockIII();
		int[] A= new int[]{2,1,2,0,1};
		assertEquals(2,bbs.maxProfit(A));
	}

}
