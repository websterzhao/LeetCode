package stackqueue;

import java.util.ArrayList;
import java.util.Stack;

import anode.TreeNode;
//if the top node has been visited, pop it. 
//if the top node's child = the latest popped node, either left or right, it must has been visited.)
public class BinaryTreePostorderTraversal {
	 public ArrayList<Integer> postorderTraversal(TreeNode root) {
	        Stack<TreeNode> stk = new Stack<TreeNode>();
	        ArrayList<Integer> ret = new ArrayList<Integer>();
	        if(root==null) return ret;
	        stk.push(root);
	        TreeNode prev = root;
	        while(!stk.empty()){
	        	TreeNode top = stk.peek();
	        	if((top.right==null&&top.left==null)||top.right==prev||top.left==prev){
	        		ret.add(top.val);
	        		stk.pop();
	        		prev=top;
	        	}
	        	else{
		            if(top.right!=null)
		            	stk.push(top.right);
		            if(top.left!=null)
		            	stk.push(top.left);
	        	}
	        }
	        return ret;
	    }
}
