package arrays;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
		int distance = Integer.MAX_VALUE;
		int ret = 0;
		for (int i = 0; i < num.length - 2; i++) {
			int j = i + 1;
			int k = num.length - 1;
			while (j < k) {
				int temp = num[i] + num[j] + num[k] - target;
				if (Math.abs(temp) < distance) {
					distance = Math.abs(temp);
					ret = num[i] + num[j] + num[k];
					if (temp>0)
						k--;
					else
						j++;
				} else if (temp > 0) {
					k--;
				} else
					j++;
			}
		}
		return ret;
	}
}
