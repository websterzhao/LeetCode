package linkedList;

import anode.ListNode;

public class InsertSortList {
	public ListNode insertionSortList(ListNode head) {
		if (head == null)
			return null;
		ListNode next = head.next;
		ListNode cur = head;
		return insert(cur, next);
	}

	private ListNode insert(ListNode cur, ListNode next) {
		if (next == null)
			return cur;
		ListNode nhead = insert(next, next.next);
		if (cur.val <= nhead.val) {
			cur.next = nhead;
			return cur;
		}
		ListNode ret = nhead;
		ListNode prev = null;
		while (nhead != null && cur.val > nhead.val) {
			prev = nhead;
			nhead = nhead.next;
		}
		prev.next = cur;
		cur.next = nhead;
		return ret;
	}
}
