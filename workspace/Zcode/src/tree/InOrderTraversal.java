package tree;

import java.util.ArrayList;
import java.util.Stack;

import anode.TreeNode;



public class InOrderTraversal {
	 public ArrayList<Integer> inorderTraversal(TreeNode root) {
	       Stack<TreeNode> stk = new  Stack<TreeNode>(); 
	       ArrayList<Integer> ret = new ArrayList<Integer>();
		   TreeNode cur=root;
	       while(cur!=null){
	    	   stk.push(cur);
	    	   cur=cur.left;
	       }
	       while(!stk.empty()){
	    	   cur= stk.pop();
	    	   ret.add(cur.val);
	    	   TreeNode itr = cur.right;
	    	   while(itr!=null){
	    		   stk.push(itr);
	    		   itr=itr.left;
	    	   }
	       }
	       return ret;
	    }
	 
///////////////////////////////////////////////////////////////////////////	 
  public ArrayList<Integer> inorderTraversal2(TreeNode root) {
        ArrayList<Integer> ret= new ArrayList<Integer>();
        inorder(root,ret);
        return ret;
    }
    private void inorder(TreeNode root, ArrayList<Integer> ret){
        if(root==null)
            return;
        inorder(root.left,ret);
        ret.add(root.val);
        inorder(root.right,ret);
    }
}
