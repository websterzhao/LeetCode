package recursion;

public class PermutationSequence {
	public String getPermutation(int n, int k) {
		int[] nf = { 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 }; // n factorail
		char[] sb= new char[n];// result string
		for (int i = 1; i <= n; i++) {   // initialization
			sb[i-1] = (char) ((i + '0'));
		} 
		k--;
		for (int i = 0; i < n; i++) {
			int m = k % nf[n - i - 1];
			int s = k / nf[n - i - 1];
			if (m == 0 && s == 0) {
				break;
			} else {
				if (s > 0) {
					for (int j = i - 1 + s; j > i - 1; j--) {
						char tmp = sb[j];
						sb[j] = sb[j - 1];
						sb[j - 1] = tmp;
					}
					if (m == 0) {
						break;
					}
				}
				k = m;
			}
		}
		StringBuilder ssb = new StringBuilder();
		for (int i = 0; i < n; i++) {  
			ssb = ssb.append(sb[i]);
		}
		return ssb.toString();
	}
}
