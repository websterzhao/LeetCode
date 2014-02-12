package test;

import static org.junit.Assert.*;

import org.junit.Test;

import anode.TreeNode;

import tree.BTMaxSumPath;

public class BTMaxSumPathTest {

	@Test
	public void test() {
		BTMaxSumPath bs= new BTMaxSumPath(); 
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		assertEquals(6, bs.maxPathSum(root));
	}

}
