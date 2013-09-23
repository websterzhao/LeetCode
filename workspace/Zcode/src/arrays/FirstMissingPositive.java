package arrays;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		int n = A.length;
		if (n == 0)
			return 1;
		int i = 0;
		while (i < n) {
			int ai = A[i];
			if (0 <= ai && ai < n)
				if (A[ai] != ai)// prevent from infinit swap
				{
					A[i] = A[ai];
					A[ai] = ai;
					continue;
				}

			++i;
		}

		i = 1;
		while (i < n && A[i] == i)
			i++;

		// fisrt element maybe n, if so, the largest missed positive number
		// should be n+1
		if (A[0] == i)
			++i;

		return i;
	}
}
