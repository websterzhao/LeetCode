package recursion;

import java.util.ArrayList;
import java.util.Arrays;


public class CombinationSumTwo {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates,int target) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
		getcom(ret, candidates, 0, target, temp);
		return ret;
	}

	@SuppressWarnings("unchecked")
	private void getcom(ArrayList<ArrayList<Integer>> ret, int[] candidates,int index, int target, ArrayList<Integer> temp) {
		if (target == 0 ) {
			if(!ret.contains(temp))
			ret.add((ArrayList<Integer>) temp.clone());   
			return;
		}
		if (index == candidates.length||target<0)
			return;
		getcom(ret, candidates, index + 1, target, temp);
		temp.add(candidates[index]);
		getcom(ret, candidates, index + 1, target - candidates[index],temp);
		temp.remove(temp.size() - 1);
	}
}
