package test;


import java.util.ArrayList;
import recursion.Subsets;



public class TestSubsets {

	public static void main(String[] args) {
		Subsets sq = new Subsets();
		int[]  matrix={0,1,2};
		ArrayList<ArrayList<Integer>> ret=sq.subsets(matrix);
        for(ArrayList<Integer> arry:ret){
        	for(Integer e:arry){
        		System.out.print(e+" ");
        	}
        	System.out.println();
        }
	}

}
