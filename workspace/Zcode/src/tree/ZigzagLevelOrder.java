package tree;

import java.util.ArrayList;
import java.util.Stack;

import anode.TreeNode;




public class ZigzagLevelOrder {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		Stack<TreeNode> sLR = new Stack<TreeNode>(); 
		Stack<TreeNode> sRL = new Stack<TreeNode>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Stack<TreeNode> cur = sLR;
		if (root != null)
			cur.add(root);
		while (!sLR.isEmpty() || !sRL.isEmpty()) {
			TreeNode t = cur.pop();
			temp.add(t.val);
			if (cur == sLR) {
				if (t.left != null)
					sRL.push(t.left);
				if (t.right != null)
					sRL.push(t.right);
			} else {
				if (t.right != null)
					sLR.push(t.right);
				if (t.left != null)
					sLR.push(t.left);
			}
			if (cur.empty()) {
				cur = cur == sLR ? sRL : sLR;
				ret.add(temp);
				temp = new ArrayList<Integer>();
			}

		}
		return ret;
	}
}
