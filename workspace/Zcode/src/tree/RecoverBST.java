package tree;


import anode.TreeNode;
import anode.DTreeNode;

public class RecoverBST {    ////////////////////////////dont know why w1,w2 can not reference to new node

	 public static void recoverTree(TreeNode root) {
	        if(root==null) return;
	        TreeNode prev = new TreeNode(Integer.MIN_VALUE);
	        DTreeNode dt = new DTreeNode();
	        inorder(root,prev,dt);
	        System.out.println("after function");
			System.out.println(dt.w1.val);
			System.out.println(dt.w2.val);
//			int temp = w1.val;
//	        w1.val=w2.val;
//	        w2.val=temp;
	    }

	private static  void inorder(TreeNode root, TreeNode prev, DTreeNode dt) {                          //������ĵ�ַ��ֵ
		if(root==null)
			return;
		inorder(root.left,prev,dt);		
		if(prev.val>root.val){
			if(dt.w1==null){
				dt.w1=prev;
				System.out.println(dt.w1.val);
			}
			dt.w2=root;                                                             //��������w2,�������������w2�Ŀ�������ԭw2ָ��ͬһ���󣩣��ı��丳ֵ��ָ����һ������,��ԭw2��Ȼָ��ԭ���� 
			System.out.println(dt.w2.val);
		}			
		prev.val=root.val;	
		inorder(root.right,prev,dt);
	}
}
