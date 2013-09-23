package tree;

import anode.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return checkvalid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

	private boolean checkvalid(TreeNode root, int minValue, int maxValue) {
		if(root==null) return true;
	    if(root.val<= minValue ||root.val>=maxValue)
	    	   return false; 
	    return checkvalid(root.left,minValue,root.val)&&checkvalid(root.right,root.val,maxValue);
	}
}
