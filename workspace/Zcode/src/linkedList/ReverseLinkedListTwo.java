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
}
