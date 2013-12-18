package linkedList;

import anode.ListNode;

public class ReverseLinkedListTwo {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode cur = head;
		int k = n - m + 1;
		if (k == 1)
			return head;
		if (m == 1)
			return swap(cur, k);
		while (m-- > 2 && cur.next != null) {
			cur = cur.next;
		}
		if (cur.next == null)
			return head;
		ListNode prev = cur;
		cur = cur.next;
		prev.next = swap(cur, k);
		return head;
	}

	private ListNode swap(ListNode cur, int k) {
		ListNode prev = null;
		ListNode itr = cur;
		while (k-- > 0 && itr != null) {
			ListNode temp = itr.next;
			itr.next = prev;
			prev = itr;
			itr = temp;
		}
		cur.next = itr;
		return prev;
	}
	////////////////////////////////////////////////////////
	
	  public ListNode reverseBetween2(ListNode head, int m, int n) {
	        int i=1;
	        ListNode itr=head;
	        ListNode prev=null;
	        while(i<m&&itr!=null){
	            prev=itr;
	            itr=itr.next;
	            i++;           //write inc in the loop 
	        }
	        if(itr==null||m==n) return head;       // m==n return
	        ListNode newtail=itr;
	        ListNode newprev=null;
	        while(i<=n&&itr!=null){               // include the nth, use <=
	            ListNode next=itr.next;
	            itr.next=newprev;
	            newprev=itr;
	            itr=next;
	            i++;
	        }
	        if(prev!=null)              //conctan head and tail and check if null
	            prev.next=newprev;
	        if(itr!=null)
	            newtail.next=itr;
	        if(m>1)
	            return head;  
	        return newprev;    
	    }
///////////////////////////////////////////////////////////
	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		ListNode cur = head;
		ListNode prev = null;
		ListNode newhead = null;
		while (cur != null && cur.next != null) {
			ListNode itr = swap(cur);
			if (prev != null)
				prev.next = itr;
			prev = itr.next;
			if (newhead == null)
				newhead = itr;
			cur = prev.next;
		}
		if (newhead == null)
			newhead = cur;
		return newhead;
	}

	private ListNode swap(ListNode cur) {
		ListNode next = cur.next;
		cur.next = next.next;
		next.next = cur;
		return next;
	}
}
