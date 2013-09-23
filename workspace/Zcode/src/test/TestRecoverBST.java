package test;

import anode.TreeNode;
import tree.RecoverBST;



public class TestRecoverBST {

	public static void main(String[] args) {
//		RecoverBST rl= new RecoverBST();
		TreeNode root=new TreeNode(0);
		root.left = new TreeNode(1);
//		root.right = new TreeNode(2);

		RecoverBST.recoverTree(root);
//		System.out.println(root.left.val);		
	}
}