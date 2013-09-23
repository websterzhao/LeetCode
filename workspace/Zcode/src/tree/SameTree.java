package tree;

import anode.TreeNode;

public class SameTree {
	boolean issametree(TreeNode p1, TreeNode p2){
		if(p1==null&&p2==null) return true;
		if(p1==null||p2==null) return false;
		
		return issametree(p1.left, p2.left)&&issametree(p1.right, p2.right)&&(p1.val==p2.val);		
	}
}
