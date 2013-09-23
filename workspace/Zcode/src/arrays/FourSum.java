package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {

	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);
		HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < num.length - 3; i++) {
			for (int j = i + 1; j < num.length - 2; j++) {
				int k = j + 1, l = num.length - 1;
				while (k < l) {
					int sum = num[i] + num[j] + num[k] + num[l];
					if (sum > target) {
						l--;
					} else if (sum < target) {
						k++;
					} else if (sum == target) {
						ArrayList<Integer> found = new ArrayList<Integer>();
						found.add(num[i]);
						found.add(num[j]);
						found.add(num[k]);
						found.add(num[l]);
						if (!hSet.contains(found)) {
							hSet.add(found);
							result.add(found);
						}

						k++;
						l--;

					}
				}
			}
		}
		return result;
	}
}
