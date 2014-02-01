package stackqueue;

import java.util.ArrayList;
import java.util.Stack;

import anode.TreeNode;

public class BinaryTreePreorderTraversal {
	 public ArrayList<Integer> preorderTraversal(TreeNode root) {
	        Stack<TreeNode> stk = new Stack<TreeNode>();
	        ArrayList<Integer> ret = new ArrayList<Integer>();
	        if(root==null) return ret;
	        stk.push(root);
	        while(!stk.empty()){
	            TreeNode cur= stk.pop();
	            ret.add(cur.val);
	            if(cur.right!=null)
	            	stk.push(cur.right);
	            if(cur.left!=null)
	            	stk.push(cur.left);
	        }
	        return ret;
	    }
}
