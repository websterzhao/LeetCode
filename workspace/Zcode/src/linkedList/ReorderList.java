package linkedList;

import anode.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null|| head.next==null) return;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
        	slow=slow.next;
        	fast=fast.next.next;
        }
        ListNode rhead = slow.next;
        slow.next = null;
        rhead = reverse(rhead);
        ListNode cur = head;
        while(rhead!=null){
        	ListNode rnext = rhead.next;
        	ListNode cnext = cur.next;
        	cur.next=rhead;
        	rhead.next=cnext;
        	cur=cnext;
        	rhead = rnext;
        }
    }

	private ListNode reverse(ListNode head) {
		if(head==null)
			return null;
		ListNode prev = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}
