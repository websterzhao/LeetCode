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

	private static  void inorder(TreeNode root, TreeNode prev, DTreeNode dt) {                          //传对象的地址的值
		if(root==null)
			return;
		inorder(root.left,prev,dt);		
		if(prev.val>root.val){
			if(dt.w1==null){
				dt.w1=prev;
				System.out.println(dt.w1.val);
			}
			dt.w2=root;                                                             //本地引用w2,仅仅是输入参数w2的拷贝（和原w2指向同一对象），改变其赋值后，指向另一个对象,但原w2依然指向原对象。 
			System.out.println(dt.w2.val);
		}			
		prev.val=root.val;	
		inorder(root.right,prev,dt);
	}
}
