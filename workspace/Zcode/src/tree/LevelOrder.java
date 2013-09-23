package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import anode.TreeNode;



public class LevelOrder {
	   public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		   ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();		   
		   Queue<TreeNode> q = new LinkedList<TreeNode>();   //Queue is only an interface, linkedlist implements it
		   if(root!=null)
			   q.add(root);
		   while(!q.isEmpty()){
			   Queue<TreeNode> qtemp = new LinkedList<TreeNode>(); 
			   ArrayList<Integer> temp = new ArrayList<Integer>();
			   for(TreeNode t:q){
				   temp.add(t.val);		
				   if(t.left!=null)
					   qtemp.add(t.left);
				   if(t.right!=null)
					   qtemp.add(t.right);
			   }
			   q=qtemp;
			   ret.add(temp);
		   }
		   return ret;
	    }
}
