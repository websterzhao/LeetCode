package tree;

import anode.ListNode;
import anode.TreeNode;

public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode cur= head;
        int cnt = 0;
        while(cur!=null){
        	cur=cur.next;
        	cnt++;
        }
        return convert(head,cnt); 	        
    }

	private TreeNode convert(ListNode head, int n) {
		if(head==null||n==0)
			return null;
		ListNode cur= head;
		int i =0;
        for(; i< n/2;i++){
        	cur=cur.next;
        }
        TreeNode ret = new TreeNode(cur.val);
        ret.left=convert(head,i);
        ret.right=convert(cur.next,n-i-1);
		return ret;
	}
}
