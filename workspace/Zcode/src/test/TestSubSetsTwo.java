package test;


import java.util.ArrayList;
import recursion.SubsetsTwo;



public class TestSubSetsTwo {

	public static void main(String[] args) {
		SubsetsTwo sq = new SubsetsTwo();
		int[]  matrix={1,1};
		ArrayList<ArrayList<Integer>> ret=sq.subsetsWithDup(matrix);
        for(ArrayList<Integer> arry:ret){
        	for(Integer e:arry){
        		System.out.print(e+" ");
        	}
        	System.out.println();
        }

	}

}
