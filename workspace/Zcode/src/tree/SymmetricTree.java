package tree;

import anode.TreeNode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return check(root.left, root.right);
	}

	private boolean check(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return false;
		if (left.val != right.val)
			return false;

		return check(left.left, right.right) && check(left.right, right.left);
	}
	
	
	
	
}
