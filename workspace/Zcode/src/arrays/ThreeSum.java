package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);		
		for (int i = 0; i < num.length - 2; i++) {
			int j = i + 1;
			int k = num.length - 1;
			while (j < k) {
				if (num[i] + num[j] + num[k] == 0) {
					ArrayList<Integer> mylist = new ArrayList<Integer>();
					mylist.add(num[i]);
					mylist.add(num[j]);
					mylist.add(num[k]);
					if (!set.contains(mylist)){
						set.add(mylist);
						ret.add(mylist);
					}
					j++;
					k--;
				}

				else if (num[i] + num[j] + num[k] < 0)
					j++;
				else
					k--;
			}
		}
		return ret;
	}

}
