package linkedList;

import anode.ListNode;

public class RemoveNfromLast {
	   public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null) return null;
	        ListNode cur=head;
	        ListNode runner=head;
	        ListNode prev=null;
	        while(n>0){
	        	runner=runner.next;
	        	n--;
	        }
	        while(runner!=null){
	        	runner=runner.next;	        		
	        	prev=cur;
	        	cur=cur.next;
	        }
	        if(prev!=null){
	        	prev.next=cur.next;
	        	return head;
	        }
	        else
	        	return head.next;
	    }
}
