package test;

import anode.TreeNode;
import tree.SumRoottoLeafNumbers;



public class TestSumRootToLeafNumbers {

	public static void main(String[] args) {
		SumRoottoLeafNumbers rl= new SumRoottoLeafNumbers();
		TreeNode root=new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(-5);
		int ret = rl.sumNumbers(root);
		System.out.println(ret);
	}
}