package tree;

import anode.TreeNode;

public class BTMaxSumPath {
	public int maxPathSum(TreeNode root) {
		TreeNode max_s = new TreeNode(Integer.MIN_VALUE);//do not use Integer class since it is immutable 
		dfs(root, max_s);
		return max_s.val;
	}

	private int dfs(TreeNode root, TreeNode max_s) {
		if (root == null) {
			return 0;
		}
		int l = dfs(root.left, max_s);
		int r = dfs(root.right, max_s);
		int m = root.val;
		if (l > 0) {
			m += l;
		}
		if (r > 0) {
			m += r;
		}
		max_s.val = max_s.val > m ? max_s.val : m;
		int cur = l > r ? l : r;
		if (cur > 0) {
			return (cur + root.val);
		} else {
			return root.val;
		}
	}
}
