package test;

import stackqueue.TrappingRainWater;



public class TestTrappingWater {

	public static void main(String[] args) {
		TrappingRainWater sq = new TrappingRainWater();
		int[]  matrix={4,2,0,3,2,5};
		int ret=sq.trap(matrix);
		System.out.println("total is " + ret);
	}

}
