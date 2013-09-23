package test;

import DP.LargestSumSubtree;
import anode.TreeNode;



public class TestLargestSubTree {

	public static void main(String[] args) {
		LargestSumSubtree rl= new LargestSumSubtree();
		TreeNode root=new TreeNode(-100);
		root.left = new TreeNode(200);
		root.right = new TreeNode(100);
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(-5);
		TreeNode t = rl.findLargestSumSubtree(root);
		TreeNode t1 = rl.findLargestSumSubtree1(root);
		System.out.println(t.val);
		System.out.println(t1.val);
	}
}