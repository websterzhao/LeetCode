package tree;

import java.util.ArrayList;

import anode.TreeNode;



public class SumRoottoLeafNumbers {
	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		ArrayList<Integer> ret = new ArrayList<Integer>();
		checksum(root, ret, root.val);
		int ren = 0;
		for (Integer i : ret) {
			ren += i;
		}
		return ren;
	}

	private void checksum(TreeNode root, ArrayList<Integer> ret, int i) {
		if (root.left == null && root.right == null) {
			ret.add(i);
			return;
		}
		if (root.left != null){
			int l = i * 10 + root.left.val;		
			checksum(root.left, ret, l);
		}
		if (root.right != null){
			int r = i * 10 + root.right.val;		
			checksum(root.right, ret, r);
		}
	}
}
