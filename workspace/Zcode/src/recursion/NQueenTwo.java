package recursion;

public class NQueenTwo {

	public int solveNQueens(int n) {
		if (n <= 0)
			return 0;
		int[] set = new int[n];
		int ret = nqueens(set, n, 0);
		return ret;
	}

	private int nqueens(int[] set, int n, int cur) {
		if (cur == n) {
			return 1;
		}	
		int ret = 0;
		for (int i = 0; i < n; i++) {
			boolean nonattack = true;
			for (int k = 0; k < cur; k++) {
				if ((set[k] == i) || ((cur - k) == Math.abs(i - set[k])))
					nonattack = false;
			}
			if (nonattack) {
				set[cur] = i;
				ret+=nqueens(set, n, cur + 1);
			}
		}
		return ret;
	}

}
