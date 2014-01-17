package tree;

import java.util.Stack;

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
	
	
	 public boolean isSymmetric1(TreeNode root) {
		 if (root == null) return true;
		     Stack<TreeNode> s1 = new Stack<TreeNode>();
		     Stack<TreeNode> s2 = new Stack<TreeNode>();
		     s1.push(root.left);
		     s2.push(root.right);
		     while (!s1.empty() && !s2.empty()) {
		         TreeNode n1 = s1.pop();
		         TreeNode n2 = s2.pop();
		         if (n1 == null && n2 == null) continue;
		         if (n1 == null || n2 == null) return false;
		         if (n1.val != n2.val) return false;
		         s1.push(n1.left);
		         s2.push(n2.right);
		         s1.push(n1.right);
		         s2.push(n2.left);
		     }
		     return true;
		 }
	
}
