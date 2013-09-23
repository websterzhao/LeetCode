package tree;

import anode.TreeNode;

public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if(checkBalance(root)==-1)
        	return false;
        else
        	return true;
    }

	private int checkBalance(TreeNode root) {
		if(root==null)
			return 0;
		int left = checkBalance(root.left);
		if(left==-1) return -1;
		int right = checkBalance(root.right);
		if(right==-1) return -1;
		if(Math.abs(left-right)>1){
			return -1;
		}
		else{
			int ret=left>right?left:right;
			return ret+1;
		}
			
	}
}
