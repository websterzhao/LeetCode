package tree;

import anode.TreeNode;

public class MinDepthTree {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		int max = left < right ? right : left;
		int min = left < right ? left : right;
		if (left == 0 || right == 0)   //consider left or right only tree
			return max + 1;
		else
			return min + 1;
	}
}
