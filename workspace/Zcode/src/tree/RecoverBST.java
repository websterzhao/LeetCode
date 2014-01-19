package tree;


import anode.TreeNode;

public class RecoverBST {   
   TreeNode firstNode;
   TreeNode secondNode;
   public void recoverTree(TreeNode root) {
       firstNode =null;
       secondNode = null;
       inorder(root,null);
       swap(firstNode,secondNode);


   }

   public void swap(TreeNode f,TreeNode s){
           int temp = f.val;
           f.val = s.val;
           s.val = temp;
   }

   public TreeNode inorder(TreeNode node, TreeNode prev){
           if(node==null) return prev;

           TreeNode p = inorder(node.left,prev);

           if(p!=null && p.val>node.val){
                   if(firstNode==null){
                           firstNode = p;
                           secondNode = node;
                   }
                   else
                           secondNode = node;
           }

           p = inorder(node.right,node);

           return p;
   }
}
