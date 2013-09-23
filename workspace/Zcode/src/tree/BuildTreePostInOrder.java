package tree;

import anode.TreeNode;

public class BuildTreePostInOrder {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		   int np =postorder.length;
		   int ni= inorder.length;
           if(np==0||ni==0||np!=ni)
            	  return null;
           return build(postorder,0,np-1,inorder,0,ni-1);   	        
	    }

	private TreeNode build(int[] postorder, int sp, int np, int[] inorder, int si, int ni) {
		if(sp>np||si>ni) return null;
		int i =si;                  //i ��ָinorder����ϵ�ڣ� ����ֱ������post����ϵ������þ���ֵ
		while(inorder[i]!=postorder[np]&&i<=ni){
			i++;
		}		
		TreeNode ret = new TreeNode(postorder[np]);
		ret.left=build(postorder,sp,sp+i-si-1,inorder,si,i-1);
		ret.right=build(postorder,sp+i-si,np-1,inorder,i+1,ni);		
		return ret;
	}
}
