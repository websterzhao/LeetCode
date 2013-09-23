package tree;

import java.util.ArrayList;
import anode.TreeNode;

public class UniqueBSTII {
	public ArrayList<TreeNode> generateTrees(int n) {
		ArrayList<TreeNode> ret = new ArrayList<TreeNode>();
		if (n <= 0)
			return ret;
		for (int i = 1; i <= n; i++) {
			TreeNode root = new TreeNode(i);
			innrergentree(1, n, 1, root, ret);
		}
    //    return ret;
	}

	private void innrergentree(int beg, int end, int cur, TreeNode root,
			ArrayList<TreeNode> ret) {
		if (cur == end) {
			ret.add(root);
			return;
		}

	}
}
