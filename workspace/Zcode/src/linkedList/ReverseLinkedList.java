package linkedList;

import anode.ListNode;


public class ReverseLinkedList {
     public ListNode ReverseLinkedList1(ListNode head){
    	 if(head==null) return null;
    	 ListNode newhead = reverse(head, null);   	 
		 return newhead;
     }

	private ListNode reverse(ListNode head, ListNode prev) {
		if(head==null)  return null;
		if(head.next==null){
			head.next=prev;
			return head;
		}
		ListNode cur = head.next;
		head.next=prev;
		return reverse(cur, head);
	}
	
	public ListNode ReverseLinkedList2(ListNode head){
		if(head==null) return null;
		ListNode cur = head;
		ListNode prev = null;
		while(cur!=null){
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur= next;			
		}		
		return prev;
	}	
}
