package tree;

import anode.TreeNode;

public class BuildTreePreInOrder {
	   public TreeNode buildTree(int[] preorder, int[] inorder) {
		   int np =preorder.length;
		   int ni= inorder.length;
           if(np==0||ni==0||np!=ni)
            	  return null;
           return build(preorder,0,np-1,inorder,0,ni-1);   	        
	    }

	private TreeNode build(int[] preorder, int sp, int np, int[] inorder, int si, int ni) {
		if(sp>np||si>ni) return null;
		int i =si;                  //i 是指inorder坐标系内， 不能直接用于Pre坐标系。最好用绝对值
		while(inorder[i]!=preorder[sp]&&i<=np){
			i++;
		}		
		TreeNode ret = new TreeNode(preorder[sp]);
		ret.left=build(preorder,sp+1,sp+i-si,inorder,si,i-1);  //右移一位 本来是sp+（i-si-1） , 起点是sp+1,
		ret.right=build(preorder,sp+i-si+1,np,inorder,i+1,ni);		
		return ret;
	}
}
