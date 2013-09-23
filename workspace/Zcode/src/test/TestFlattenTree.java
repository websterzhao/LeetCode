package test;

import anode.TreeNode;
import tree.FlattenBTtoLinkedList;



public class TestFlattenTree {

	public static void main(String[] args) {
		FlattenBTtoLinkedList rl= new FlattenBTtoLinkedList();
		TreeNode root=new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		rl.flatten(root);
		while(root!=null){
			System.out.println(root.val);
			root=root.right;			
		}	
	}
}