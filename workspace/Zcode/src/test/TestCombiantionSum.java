package test;


import java.util.ArrayList;

//import recursion.CombinationSum;
import recursion.CombinationSumTwo;



public class TestCombiantionSum {

	public static void main(String[] args) {
		CombinationSumTwo sq = new CombinationSumTwo();
		int[]  matrix={1,1};
		ArrayList<ArrayList<Integer>> ret=sq.combinationSum2(matrix,1);
        for(ArrayList<Integer> arry:ret){
        	for(Integer e:arry){
        		System.out.print(e+" ");
        	}
        	System.out.println();
        }

	}

}
