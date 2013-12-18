package linkedList;

import anode.ListNode;

public class RemoveDuplicate {
	  public ListNode deleteDuplicates(ListNode head) {
	        if(head==null) return head;
	        ListNode prev= head;
	        ListNode cur= head.next;
	        while(cur!=null){
	            while(cur!=null&&cur.val==prev.val)
	             cur=cur.next;
	            prev.next=cur;
	            prev=cur;
	            if(cur!=null)
	              cur=cur.next;
	        }
	        return head;
	    }
	  
	   public ListNode deleteDuplicatesAll(ListNode head) {
	        if(head==null) return null;
	        ListNode prev = null;
	        ListNode newhead=null;
	        ListNode cur=head;
	        while(cur!=null){
	            boolean dup=false;
	            ListNode itr= cur.next;
	            while(itr!=null&&itr.val==cur.val){
	                dup=true;
	                itr=itr.next;
	            }
	            if(dup){
	                if(prev!=null){
	                    prev.next=itr;
	                }
	                cur=itr;
	            }
	            else{
	                prev=cur;
	                cur=cur.next;
	                if(newhead==null)
	                 newhead=prev;
	            }
	        }
	        return newhead;
	    }
}
