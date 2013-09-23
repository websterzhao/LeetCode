package recursion;

import java.util.ArrayList;

public class Combinations {
	   public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		   ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		   ArrayList<Integer> temp = new ArrayList<Integer>();
	       if(n<=0||k<=0||k>n)
	    	   return ret;
	       innerCombine(ret,temp, n,0,k,0);
	       return ret;
	    }

	@SuppressWarnings("unchecked")
	private void innerCombine(ArrayList<ArrayList<Integer>> ret,
			ArrayList<Integer> temp, int n, int i, int k, int j) {
		if(k==j){
			ret.add((ArrayList<Integer>) temp.clone());
			return;
		}
		if(n==i)
			return;
		innerCombine(ret, temp, n, i+1, k, j);
		temp.add(i+1);
		innerCombine(ret, temp, n, i+1, k, j+1);
		temp.remove(temp.size()-1);
	}

	

}
