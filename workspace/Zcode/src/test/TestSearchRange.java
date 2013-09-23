package test;

import arrays.SearchRange;

public class TestSearchRange {
	public static void main(String[] args) {
		SearchRange sq = new SearchRange();
		int[]  A={1,2,2,2,4,5,6};
		int[] ret= new int[2];
		ret=sq.searchRange(A,2);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
	}
}
