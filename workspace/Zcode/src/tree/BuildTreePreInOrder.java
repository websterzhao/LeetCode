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
		int i =si;                  //i ��ָinorder����ϵ�ڣ� ����ֱ������Pre����ϵ������þ���ֵ
		while(inorder[i]!=preorder[sp]&&i<=np){
			i++;
		}		
		TreeNode ret = new TreeNode(preorder[sp]);
		ret.left=build(preorder,sp+1,sp+i-si,inorder,si,i-1);  //����һλ ������sp+��i-si-1�� , �����sp+1,
		ret.right=build(preorder,sp+i-si+1,np,inorder,i+1,ni);		
		return ret;
	}
}
