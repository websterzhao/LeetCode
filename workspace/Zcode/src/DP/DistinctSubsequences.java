package DP;

public class DistinctSubsequences {
	public int numDistinct(String S, String T) {
        if(S.length()==0||T.length()==0)
            return 0;
        return nd(S,T);    
    }
	private int nd(String S, String T) {
		if (S.length() == 0)
			return 0;
		if (T.length() == 0)
			return 1;
		if (S.length() == 1 && T.length() == 1) {
			if (S.charAt(0) == T.charAt(0))
				return 1;
			else
				return 0;
		}
		if (S.charAt(0) == T.charAt(0)) {
			return nd(S.substring(1), T.substring(1)) + nd(S.substring(1), T);
		} else
			return nd(S.substring(1), T);
	}
/////////////////////////////////////////////////
/* Solution (DP):
		 * We keep a m*n matrix and scanning through string S, while
		 * m = T.length() + 1 and n = S.length() + 1
		 * and each cell in matrix Path[i][j] means the number of distinct subsequences of 
		 * T.substr(1...i) in S(1...j)
		 * 
		 * Path[i][j] = Path[i][j-1]            (discard S[j])
		 *              +     Path[i-1][j-1]    (S[j] == T[i] and we are going to use S[j])
		 *                 or 0                 (S[j] != T[i] so we could not use S[j])
		 * while Path[0][j] = 1 and Path[i][0] = 0.
	 * Further optimization could be made that we can use only 1D array instead of a
	 * matrix, since we only need data from last time step.
*/
	public int numDistinct1(String S, String T) {
	    int m = T.length();
	    int n = S.length();
	    if (m > n) return 0;    // impossible for subsequence

	    int[] path = new int[m+1];
	    path[0] = 1;            // initial condition

	    for (int j = 1; j <= n; j++) {
	        // traversing backwards so we are using path[i-1] from last time step
	        for (int i = m; i >= 1; i--) {  
	            path[i] = path[i] + (T.charAt(i-1) == S.charAt(j-1) ? path[i-1] : 0);
	        }
	    }

	    return path[m];
	}	
	
	
}
