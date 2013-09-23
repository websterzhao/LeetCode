package tree;

import anode.TreeNode;

public class FlattenBTtoLinkedList {
	   public void flatten(TreeNode root) {
		   if (root == null) return;
		   TreeNode left = root.left;
		   TreeNode right = root.right;
		   TreeNode last =null;
		   root.left = null;
		   if(left!=null){
			   root.right = left;
		   }
		   else
			   root.right=right;
		   flatten(left);
		   flatten(right);
		   if(left!=null)                 //������flatten(left)����ִ�У���Ϊ�����ã���ı�Left Node����Flatten����ı�Left��ֻ������������
			   last=findlast(left);
		   if(left!=null)
			   last.right=right;
	    }

	private TreeNode findlast(TreeNode root) {
		while(root.right!=null)
			root=root.right;
		return root;
	}
}
