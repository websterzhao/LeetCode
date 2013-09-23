package DP;

import java.util.HashMap;

import anode.Ret;
import anode.TreeNode;

public class LargestSumSubtree {

	public TreeNode findLargestSumSubtree(TreeNode root){
		if(root==null) return null;
		HashMap<TreeNode,Integer> map = new HashMap<TreeNode,Integer>();
		return findlst(root, map);				
	}

	private TreeNode findlst(TreeNode node, HashMap<TreeNode, Integer> sum) {
		if(node==null)  return null;
		TreeNode leftMaxNode=findlst(node.left, sum);
		TreeNode rightMaxNode=findlst(node.right, sum);
		int nodeSum = node.val+ ((node.left!=null)?sum.get(node.left):0)+((node.right!=null)?sum.get(node.right):0);
		sum.put(node, nodeSum);
		
		TreeNode maxNode = node;
		int max = nodeSum;

		if(leftMaxNode != null && sum.get(leftMaxNode) > max)
		{
		maxNode = leftMaxNode;
		max = sum.get(leftMaxNode);
		}

		if(rightMaxNode != null && sum.get(rightMaxNode) > max)
		{
		maxNode = rightMaxNode;
		max = sum.get(rightMaxNode);
		} 
		return maxNode;
	}
	////////////////////////////////////////////////////////////////////  brute force
	public TreeNode findLargestSumSubtree1(TreeNode root){
		if(root==null) return null;
		Ret ret = findmax(root);
		return ret.maxNode;
	}

	private Ret findmax(TreeNode root) {
		if(root==null) return new Ret(0,null);
		Ret retl= findmax(root.left);
		Ret retr= findmax(root.right);
		TreeNode maxNodel=retl.maxNode;
		TreeNode maxNoder=retr.maxNode;
		int temp = retl.sum+retr.sum+root.val;
		TreeNode maxNode = root;
		if(maxNodel!=null&&findmax(maxNodel).sum>temp)
		     maxNode=maxNodel;
		if(maxNoder!=null&&findmax(maxNoder).sum>temp)
		     maxNode=maxNoder;
		return new Ret(temp,maxNode);
	}
}
