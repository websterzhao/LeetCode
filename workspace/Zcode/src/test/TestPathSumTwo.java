package test;

import java.util.ArrayList;

import anode.TreeNode;


import tree.PathSumTwo;



public class TestPathSumTwo {

	public static void main(String[] args) {
		PathSumTwo rl= new PathSumTwo();
		TreeNode root=new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(-5);
		ArrayList<ArrayList<Integer>> ret = rl.pathSum(root,-1);
	for(ArrayList<Integer> e : ret){
			for(Integer i: e){
				System.out.println(i);
			}
			System.out.println("-----------------");
		}
		
	}
}
