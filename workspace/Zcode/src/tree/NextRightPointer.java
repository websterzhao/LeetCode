package tree;

import anode.TreeLinkNode;

public class NextRightPointer {
    public void connect(TreeLinkNode root) {
        if(root==null)  return;
    	innerConnect(root,null);
    }

	private void innerConnect(TreeLinkNode cur, TreeLinkNode par) {
		if(cur==null)  return;
		if(par!=null&&par.left==cur&&par.right!=null)
			cur.next=par.right;
		else{
			TreeLinkNode itr = par==null?null:par.next;
			while(itr!=null&&itr.left==null&&itr.right==null)
				itr=itr.next;
			if(itr!=null)
			    cur.next=itr.left==null?itr.right:itr.left;
			else
				cur.next=null;
		}
		innerConnect(cur.right,cur);   //----ÏÈ  ÓÒ  ºó      ×ó----------
		innerConnect(cur.left,cur);		
	}
}
