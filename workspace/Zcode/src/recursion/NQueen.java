package recursion;

import java.util.ArrayList;

public class NQueen {
	public ArrayList<String[]> solveNQueens(int n) {
		if (n <= 0)
			return null;
		ArrayList<String[]> ret = new ArrayList<String[]>();
		int[] set = new int[n];
		nqueens(ret, set, n, 0);
		return ret;
	}

	private void nqueens(ArrayList<String[]> ret, int[] set, int n, int cur) {
		if (cur == n) {
			addtoRet(ret, set, n);
		}
		for (int i = 0; i < n; i++) {
			boolean nonattack = true;
			for (int k = 0; k < cur; k++) {
				if ((set[k] == i) || ((cur - k) == Math.abs(i - set[k])))
					nonattack = false;
			}
			if (nonattack) {
				set[cur] = i;
				nqueens(ret, set, n, cur + 1);
			}
		}
	}

	private void addtoRet(ArrayList<String[]> ret, int[] set, int n) {
		String[] full = new String[n];
		for (int i = 0; i < n; i++) {
			char[] temp = new char[n];
			for (int k = 0; k < n; k++) {
				temp[k] = '.';
			}
			temp[set[i]] = 'Q';
			full[i] = new String(temp);
		}
		ret.add(full);
	}
}
