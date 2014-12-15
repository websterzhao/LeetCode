package arrays;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		int n = A.length;
		if (n == 0)
			return 1;
		int i=0;
		for (; i < n; i++) {
			while (A[i] > 0 && A[i] < n && A[i] != i && A[i]!=A[A[i]]) {
				int temp = A[i];
				A[i] = A[temp];
				A[temp] = temp;
			}
		}
		i = 1;
		for (; i < n; i++) {
			if (i != A[i])
				return i;
		}
		if (A[0] == i)
			++i;
		return i;
	}

}
