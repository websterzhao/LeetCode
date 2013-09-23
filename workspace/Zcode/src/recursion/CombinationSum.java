package recursion;

import java.util.ArrayList;
import java.util.Arrays;



public class CombinationSum {
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
		getcom(ret, candidates, 0, target, temp);
		return ret;
	}

	@SuppressWarnings("unchecked")
	private void getcom(ArrayList<ArrayList<Integer>> ret, int[] candidates,
			int index, int target, ArrayList<Integer> temp) {
		if (target == 0 ) {
			ret.add((ArrayList<Integer>) temp.clone());  //不能再这里Sort结果，会改变Temp
			return;
		}
		if (index == candidates.length||target<0)
			return;

		int i = 0;
		for (; i * candidates[index] <= target; i++) {
			getcom(ret, candidates, index + 1, target - i * candidates[index],
					temp);
			temp.add(candidates[index]);
		}
		for (; i > 0; i--) {
			temp.remove(temp.size() - 1);
		}

	}
}
