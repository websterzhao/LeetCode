package tree;

import anode.TreeNode;


public class ConvertSortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] num) {
	        int n=num.length;
	        if(n==0) return null;
	        return convert(num,0,n-1);
	    }

	private TreeNode convert(int[] num, int m, int n) {
        if (m>n) return null;
		int k=n+(m-n)/2;
        TreeNode root= new TreeNode(num[k]);
        root.left=convert(num,m,k-1);
        root.right=convert(num,k+1,n);
        return root;
	}
}
