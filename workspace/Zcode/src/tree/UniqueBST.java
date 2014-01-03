package tree;

public class UniqueBST {
	   public int numTrees(int n) {
		   if (n==0){return 1;}
	        if (n==1){return 1;}
	        int sum=0;
	        for (int i=1;i<=n;i++){
	            sum += numTrees(i-1)*numTrees(n-i);
	        }
	        return sum;
	        
	    }

	   
	   //DP
	public int numTrees1(int n) {
		if (n < 1)
			return 0;
		else if (n < 3)
			return n;
		else if (n == 3)
			return 5;

		int[] numNodes = new int[n + 1];
		numNodes[0] = 1;
		numNodes[1] = 1;
		numNodes[2] = 2;
		numNodes[3] = 5;

		for (int i = 4; i <= n; i++) {
			int num = 0;
			int j = 1;
			for (; j <= i / 2; j++) {
				int leftnodes = numNodes[j - 1];
				int rightnodes = numNodes[i - j];
				num = num + (leftnodes * rightnodes);
			}
			num *= 2;
			if (i % 2 != 0) {
				int lfn = numNodes[j - 1];
				int rhn = numNodes[i - j];
				num = num + (lfn * rhn);
			}

			numNodes[i] = num;
		}

		return numNodes[n];
	}
}
