package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
	 public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	     if(S.length==0)
		    return ret;
	     Arrays.sort(S);
	     ArrayList<Integer> temp = new ArrayList<Integer>();
	     findSubset(S,ret,0,temp);
	     return ret;
	    }

	@SuppressWarnings("unchecked")
	private void findSubset(int[] s, ArrayList<ArrayList<Integer>> ret, int index, ArrayList<Integer> temp) {
		if(index==s.length){
			ret.add((ArrayList<Integer>) temp.clone());
			return;
		}
		findSubset(s,ret,index+1,temp);
		temp.add(s[index]);
		findSubset(s,ret,index+1,temp);
		temp.remove(temp.size()-1);
		
	}
}
